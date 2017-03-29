/**
 * Created by Kebun Binatang Bandung on 3/26/17.
 */
import animal.Animal;
import animal.turunananimal.binatang.Anoa;
import animal.turunananimal.binatang.Cormorants;
import animal.turunananimal.binatang.Crocodile;
import animal.turunananimal.binatang.Dolphin;
import animal.turunananimal.binatang.ElangB;
import animal.turunananimal.binatang.FlyingFish;
import animal.turunananimal.binatang.Hippopotamus;
import animal.turunananimal.binatang.Kangaroo;
import animal.turunananimal.binatang.Kasuari;
import animal.turunananimal.binatang.Kelelawar;
import animal.turunananimal.binatang.Kiwi;
import animal.turunananimal.binatang.Ostrich;
import animal.turunananimal.binatang.Panda;
import animal.turunananimal.binatang.Pelikan;
import animal.turunananimal.binatang.Penguin;
import animal.turunananimal.binatang.Rhino;
import animal.turunananimal.binatang.Shark;
import animal.turunananimal.binatang.Tiger;
import animal.turunananimal.binatang.Toucan;
import animal.turunananimal.binatang.Whale;
import cell.Cell;
import cell.turunancell.Facility;
import cell.turunancell.Habitat;
import java.util.Scanner;
import java.util.Vector;
import state.State;



/**
 * Kelas yang merepresentasikan sebuah virtual zoo. Kelas memiliki atribut
 * berupa peta zoo, height dan width, posisi pengunjung, dan kumpulan kandang
 * yang ada pada zoo.
 * @author Winarto
 * @author Kukuh Basuki Rahmat
 *
 * @see Cage
 * @see Cell
 */
public class Zoo {
  /**
   * Atribut kandang-kandang yang ada di Zoo.
   */
  private Vector<Cage> cages;
  /**
   * Atribut posisi pengunjung.
   */
  private Cell playerPos;
  /**
   * Atribut matriks peta.
   */
  private Cell[][] map;
  /**
   * Atribut height Zoo.
   */
  private int height;
  /**
   * Atribut width Zoo.
   */
  private int width;

  /**
   * Konstruktor Zoo.
   * Zoo mengambil informasi dari State untuk menginisialisasi height dan width Zoo.
   * Lalu dilakukan iterasi untuk mengisi atribut map dari Zoo.
   *
   * @see State
   */
  public Zoo() {
    cages = new Vector<>();
    State stateMap = new State();
    height = stateMap.getHeight();
    width = stateMap.getWidth();
    char[][] smap = new char[height][];
    for (int iidx = 0; iidx < width; iidx++) {
      smap[iidx] = stateMap.getMap()[iidx].clone();
    }
    map = new Cell[height][width];
    for (int iidx = 0; iidx < height; iidx++) {
      for (int jidx = 0; jidx < width; jidx++) {
        if (isHabitat(smap[iidx][jidx])) {
          map[iidx][jidx] = new Habitat(smap[iidx][jidx], iidx, jidx);
        } else if (isFacility(smap[iidx][jidx])) {
          map[iidx][jidx] = new Facility(smap[iidx][jidx], iidx, jidx);
          if (iidx == 0 || jidx == 0) {
            ((Facility)map[iidx][jidx]).setTrue(0);
          } else if (iidx == height || jidx == width) {
            ((Facility)map[iidx][jidx]).setTrue(1);
          }
        }
      }
    }
    initAllCage(stateMap);
  }

  /**
   * Menginisialisasi seluruh cage yang ada pada zoo. Melakukan iterasi
   * ke seluruh map. Apabila ditemukan Cell Habitat yang belum dimasukkan
   * ke cage, panggil prosedur initCage.
   *
   * @param stateMap State yang akan ditelusuri cagenya.
   */
  public void initAllCage(State stateMap) {
    Vector<Vector<Habitat>> cageBuffer = new Vector<Vector<Habitat>>(1);
    char[][] smap = new char[height][];
    for (int iidx = 0; iidx < width; iidx++) {
      smap[iidx] = stateMap.getMap()[iidx].clone();
    }
    int nidx = 1;
    for (int iidx = 0; iidx < height; iidx++) {
      for (int jidx = 0; jidx < width; jidx++) {
        if (isHabitat(smap[iidx][jidx])) {
          boolean recorded = false;
          int xidx = 0;
          while ((!recorded) && (xidx < cageBuffer.size())) {
            recorded = inCage(cageBuffer.get(xidx), map[iidx][jidx]);
            xidx++;
          }
          if (!recorded) {
            cageBuffer.setSize(nidx);
            cageBuffer.set(nidx - 1, initCage((Habitat)map[iidx][jidx]));
            nidx++;
          }
        }
      }
    }
    for (int iidx = 0; iidx < cageBuffer.size(); iidx++) {
      Cage cgbuf = new Cage(cageBuffer.get(iidx));
      cages.add(cgbuf);
    }
  }

  /**
   * Menelusuri seluruh habitat yang termasuk dalam satu cage dengan
   * algoritma Breadth First Search.
   *
   * @param hab Habitat penelusuran cage dimulai
   * @return Vector habitat yang berisi seluruh habitat dalam satu cage.
   */
  public Vector<Habitat> initCage(Habitat hab) {
    Vector<Habitat> cage = new Vector<Habitat>(1);
    Habitat habitatMap;
    cage.add(hab);
    int iidx = 0;
    while (iidx < cage.size()) {
      habitatMap = cage.get(iidx);
      if (habitatMap.getCellRow() - 1 >= 0) {
        Cell peekCell = map[habitatMap.getCellRow() + 1][habitatMap.getCellCol()];
        char peekContent = peekCell.getCellContent();
        if (peekContent == hab.getCellContent() && !inCage(cage, peekCell)) {
          char tempCon = hab.getCellContent();
          int tempRow = habitatMap.getCellRow() - 1;
          int tempCol = habitatMap.getCellCol();
          Habitat habTemp = new Habitat(tempCon,tempRow,tempCol);
          cage.add(habTemp);
        }
      }
      if (habitatMap.getCellCol() + 1 < width) {
        Cell peekCell = map[habitatMap.getCellRow()][habitatMap.getCellCol() + 1];
        char peekContent = peekCell.getCellContent();
        if (peekContent == hab.getCellContent() && !inCage(cage, peekCell)) {
          char tempCon = hab.getCellContent();
          int tempRow = habitatMap.getCellRow();
          int tempCol = habitatMap.getCellCol() + 1;
          Habitat habTemp = new Habitat(tempCon,tempRow,tempCol);
          cage.add(habTemp);
        }
      }
      if (habitatMap.getCellRow() + 1 < height) {
        Cell peekCell = map[habitatMap.getCellRow() + 1][habitatMap.getCellCol()];
        char peekContent = peekCell.getCellContent();
        if (peekContent == hab.getCellContent() && !inCage(cage, peekCell)) {
          char tempCon = hab.getCellContent();
          int tempRow = habitatMap.getCellRow() + 1;
          int tempCol = habitatMap.getCellCol();
          Habitat habTemp = new Habitat(tempCon,tempRow,tempCol);
          cage.add(habTemp);
        }
      }
      if (habitatMap.getCellCol() - 1 >= 0) {
        Cell peekCell = map[habitatMap.getCellRow()][habitatMap.getCellCol() - 1];
        char peekContent = peekCell.getCellContent();
        if (peekContent == hab.getCellContent() && !inCage(cage, peekCell)) {
          char con = hab.getCellContent();
          int row = habitatMap.getCellRow();
          int col = habitatMap.getCellCol() - 1;
          Habitat habTemp = new Habitat(con,row,col);
          cage.add(habTemp);
        }
      }
      iidx++;
    }
    System.out.println();
    return cage;
  }

  /**
   * Melihat apakah suatu parameter cell termasuk dari suatu
   * parameter vector of Habitat.
   *
   * @param vectorMap vector Habitat yang akan ditinjau
   * @param cellMap cell yang akan ditinjau
   * @return boolean kebenaran suatu cell termasuk bagian dari suatu vector Habitat.
   */
  public boolean inCage(Vector<Habitat> vectorMap, Cell cellMap) {
    if (isHabitat(cellMap.getCellContent())) {
      boolean found = false;
      int iidx = 0;
      while (!found && iidx < vectorMap.size()) {
        if (cellMap.getCellRow() == vectorMap.get(iidx).getCellRow()
                && cellMap.getCellCol() == vectorMap.get(iidx).getCellCol()) {
          found = true;
        }
        iidx++;
      }
      return (found);
    } else {
      return (false);
    }
  }

  /**
   * Getter atribut map.
   * @return Atribut matriks Cell sebagai peta suatu Zoo
   */
  public Cell[][] getMap() {
    return map;
  }

  /**
   * Getter atribut cages.
   * @return Atribut kumpulan dari semua cage yang ada di Zoo
   */
  public Vector<Cage> getCages() {
    return cages;
  }

  /**
   * Getter atribut height.
   * @return Atribut height Zoo
   */
  public int getHeight() {
    return height;
  }

  /**
   * Getter atribut width.
   * @return Atribut width Zoo
   */
  public int getWidth() {
    return width;
  }

  /**
   * Getter posisi pengunjung.
   * @return Atribut posisi pengunjung
   */
  public Cell getPlayerPos() {
    return playerPos;
  }

  /**
   * Prosedur untuk memasukkan binatang pada kandang yang tersedia
   * dan memenuhi kriteria. Kriteria yang dimaksud adalah
   * <ol>
   *     <li>Berada pada alam tempat tinggalnya</li>
   *     <li>Hewan jinak tidak bersama dengan hewan tidak jinak</li>
   *     <li>Kadang tidak penuh (Jumlah hewan kurang dari 30% Jumlah cell pada cage)</li>
   * </ol>
   */
  public void putInAnimal() {
    int size = cages.size();
    System.out.println("Nama-Nama Binatang dan kodenya");
    System.out.println("- Tiger (H)");
    System.out.println("- Panda (B)");
    System.out.println("- Anoa (A)");
    System.out.println("- Rhino (R)");
    System.out.println("- Kangaroo (D)");
    System.out.println("- Dolphin (L)");
    System.out.println("- Whale (W)");
    System.out.println("- Shark (S)");
    System.out.println("- Kelelawar (K)");
    System.out.println("- Elang Botak (E)");
    System.out.println("- Toucan (T)");
    System.out.println("- Penguin (P)");
    System.out.println("- Crocodile (C)");
    System.out.println("- Hippopotaus (N)");
    System.out.println();

    System.out.println("Masukkan kode binatang yang ingin dimasukkan kedalam kandang : ");
    Scanner sinput = new Scanner(System.in);
    char inputUser = sinput.next().trim().charAt(0);

    boolean[] arr = new boolean[size];
    for (int iidx = 0; iidx < size; iidx++) {
      arr[iidx] = false;
    }

    switch (inputUser) {
      case 'H': {
        Tiger animalTemp = new Tiger(-1,-1,-1);
        checkCage(arr, animalTemp);
        break;
      }
      case 'B': {
        Panda animalTemp = new Panda(-1,-1,-1);
        checkCage(arr, animalTemp);
        break;
      }
      case 'A': {
        Anoa animalTemp = new Anoa(-1,-1,-1);
        checkCage(arr, animalTemp);
        break;
      }
      case 'R': {
        Rhino animalTemp = new Rhino(-1,-1,-1);
        checkCage(arr, animalTemp);
        break;
      }
      case 'D': {
        Kangaroo animalTemp = new Kangaroo(-1,-1,-1);
        checkCage(arr, animalTemp);
        break;
      }
      case 'L': {
        Dolphin animalTemp = new Dolphin(-1,-1,-1);
        checkCage(arr, animalTemp);
        break;
      }
      case 'W': {
        Whale animalTemp = new Whale(-1,-1,-1);
        checkCage(arr, animalTemp);
        break;
      }
      case 'S': {
        Shark animalTemp = new Shark(-1,-1,-1);
        checkCage(arr, animalTemp);
        break;
      }
      case 'K': {
        Kelelawar animalTemp = new Kelelawar(-1,-1,-1);
        checkCage(arr, animalTemp);
        break;
      }
      case 'E': {
        ElangB animalTemp = new ElangB(-1,-1,-1);
        checkCage(arr, animalTemp);
        break;
      }
      case 'T': {
        Toucan animalTemp = new Toucan(-1,-1,-1);
        checkCage(arr, animalTemp);
        break;
      }
      case 'P': {
        Penguin animalTemp = new Penguin(-1,-1,-1);
        checkCage(arr, animalTemp);
        break;
      }
      case 'C': {
        Crocodile animalTemp = new Crocodile(-1,-1,-1);
        checkCage(arr, animalTemp);
        break;
      }
      case 'N': {
        Hippopotamus animalTemp = new Hippopotamus(-1,-1,-1);
        checkCage(arr, animalTemp);
        break;
      }
      default : {
        break;
      }
    }
    
    System.out.println("Kandang yang tersedia :");
    for (int iidx = 0; iidx < size; iidx++) {
      if (arr[iidx]) {
        System.out.print(iidx + " ");
      }
    }
    System.out.println();
    System.out.println("Masukkan kode binatang yang ingin dimasukkan kedalam kandang: ");
    System.out.println("Untuk kandang bebas masukkan -1");
    System.out.println("Untuk membatalkan masukkan -2");
    int pilihanAngka;
    boolean found = false;
    do {
      Scanner tinput = new Scanner(System.in);
      pilihanAngka = tinput.nextInt();
      found = true;
      if (pilihanAngka == -1 || pilihanAngka == -2) {
        break;
      }
      if ((pilihanAngka >= size) || (pilihanAngka < -2)) {
        System.out.println("Input salah, masukkan kembali input :");
        found = false;
      } else if (!arr[pilihanAngka] && pilihanAngka < size && pilihanAngka >= 0) {
        System.out.println("Input salah, masukkan kembali input :");
        found = false;
      }
    } while (!found);
    if (pilihanAngka == -1) {
      int iidx = 0;
      found = false;
      while (iidx < size && !found) {
        if (arr[iidx]) {
          found = true;
        } else {
          iidx++;
        }
      }
      if (found) {
        do {
          pilihanAngka = (int) (Math.random() * size);
        } while (!arr[pilihanAngka]);
      } else {
        System.out.println("Tidak ada kandang yang cocok");
      }
    }

    if (pilihanAngka != -2 && found) {
      cages.get(pilihanAngka).addAnimal(inputUser,pilihanAngka);
    }
  }

  /**
   * Mengubah nilai array kebenaran arr menjadi true untuk semua cage yang
   * dapat diisi oleh parameter animal.
   *
   * @param arr array of boolean yang berisi kebenaran apakah parameter animal
   *            dapat dimasukkan ke cage dengan indeks yang sama dengan arr.
   * @param animal Animal yang akan dimasukkan ke Cage
   */
  public void checkCage(boolean[] arr, Animal animal) {
    for (int jidx = 0; jidx < animal.getSize(); jidx++) {
      int iidx = 0;
      while (iidx < cages.size()) {
        char tempCon = cages.get(iidx).getHabitat()[0].getCellContent();
        if ((!arr[iidx]) && (animal.getArrayOfHabitat()[jidx] == tempCon)) {
          //System.out.println(cages.get(i).getNeff());
          if (cages.get(iidx).isEmpty()) {
            arr[iidx] = true;
          } else if (!cages.get(iidx).isFull()) {
            if (animal.getTame() == cages.get(iidx).getAnimal()[0].getTame()) {
              arr[iidx] = true;
            }
          }
        }
        iidx++;
      }
    }
  }

  /**
   * Prosedur untuk melakukan tour virtual zoo.
   * Algoritma mencari exit dari Zoo dengan cara brute-force.
   * Jalan tour yang diambil pada iterasi tour diurutkan sebagai berikut:
   * <ol>
   *     <li>Kanan</li>
   *     <li>Bawan</li>
   *     <li>Kiri</li>
   *     <li>Atas</li>
   * </ol>
   */
  public void tour() {
    int iidx = playerPos.getCellRow();
    int jidx = playerPos.getCellCol();
    tourInteract(playerPos);
    if (isRoad(map[iidx][jidx + 1])) {
      Cell next = new Cell('=',iidx, jidx + 1);
      playerPos = next;
    } else if (isRoad(map[iidx + 1][jidx])) {
      Cell next = new Cell('=',iidx + 1, jidx);
      playerPos = next;
    } else if (isRoad(map[iidx - 1][jidx])) {
      Cell next = new Cell('=',iidx - 1, jidx);
      playerPos = next;
    } else if (isRoad(map[iidx][jidx - 1])) {
      Cell next = new Cell('=',iidx, jidx - 1);
      playerPos = next;
    }
  }

  /**
   * Menuliskan interaksi pengunjung dengan hewan.
   * Interaksi terjadi apabila pengunjung dengan hewan-hewan yang ada
   * di kandang saling bersisian.
   *
   * @param pos posisi pengunjung saat ini
   */
  public void tourInteract(Cell pos) {
    if (pos.getCellRow() > 0) {
      int xrow = pos.getCellRow() - 1;
      int ycol = pos.getCellCol();
      for (int kidx = 0; kidx < cages.size(); kidx++) {
        if (cages.get(kidx).insideCage(xrow, ycol)) {
          if (!cages.get(kidx).isEmpty()) {
            char tempCon = cages.get(kidx).getAnimal()[0].getContent();
            String tempIn = cages.get(kidx).getAnimal()[0].getInteract();
            System.out.println(tempCon + ":" + tempIn);
            cages.get(kidx).getAnimal()[0].giveFood();
          }
        }
      }
    }
  }

  /**
   * Melakukan pengacakan pemilihan pintu masuk pengunjung.
   * Road yang berada pada baris ke-0 dan kolom ke-0 dianggap sebagai
   * pintu masuk. Algoritma mencatat seluruh pintu masuk ini dan
   * menempatkan pengunjung pada salah satu pintu masuk tersebut.
   */
  public void randomEntrance() {
    Vector<Cell> ent = new Vector<Cell>();
    Vector<Cell> ex = new Vector<Cell>();
    for (int iidx = 0; iidx < width; iidx++) {
      if (isRoad(map[iidx][0])) {
        ent.add(map[iidx][0]);
      }
      if (isRoad(map[iidx][width - 1])) {
        ex.add(map[iidx][width - 1]);
      }
    }
    for (int jidx = 0; jidx < height; jidx++) {
      if (isRoad(map[0][jidx])) {
        ent.add(map[0][jidx]);
      }
      if (isRoad(map[height - 1][jidx])) {
        ex.add(map[height - 1][jidx]);
      }
    }
    int randidx = (int)(Math.random() * ent.size());
    char tempcon = ent.get(randidx).getCellContent();
    int tempx = ent.get(randidx).getCellRow();
    int tempy = ent.get(randidx).getCellCol();
    playerPos = new Cell(tempcon,tempx,tempy);
  }

  /**
   * Peninjauan apakah suatu Cell termasuk pintu keluar Zoo.
   * @param pos Cell yang ditinjau
   * @return boolean kebenaran Cell adalah pintu keluar
   */
  public boolean isExit(Cell pos) {
    return (pos.getCellRow() == height - 1 || pos.getCellCol() == width - 1);
  }

  /**
   * Peninjauan kebenaran suatu posisi (iidx,jidx) adalah posisi pengunjung Zoo.
   * @param iidx baris map yang ditinjau
   * @param jidx kolom map yang ditinjau
   * @return boolean kebenaran cell dengan baris ke-iidx dan kolom ke-jidx adalah posisi pemain.
   */
  public boolean isPlayer(int iidx, int jidx) {
    return (playerPos.getCellRow() == iidx && playerPos.getCellCol() == jidx);
  }

  /**
   * Peninjauan apakah suatu Cell termasuk jalanan untuk manusia.
   * @param cellMap Cell yang ditinjau
   * @return nilai kebenaran suatu Cell adalah Road
   */
  public boolean isRoad(Cell cellMap) {
    return (cellMap.getCellContent() == '_');
  }

  /**
   * Peninjauan apakah suatu Cell termasuk habitat untuk hewan.
   * @param cellMap Cell yang ditinjau
   * @return nilai kebenaran suatu Cell adalah Habitat
   */
  public boolean isHabitat(char cellMap) {
    return (cellMap == '^' || cellMap == '~' || cellMap == '`');
  }

  /**
   * Peninjauan apakah suatu Cell termasuk restoran, taman, atau jalanan manusia.
   * @param cellMap Cell yang ditinjau
   * @return nilai kebenaran suatu Cell adalah Facility
   */
  public boolean isFacility(char cellMap) {
    return (cellMap == '#' || cellMap == '_' || cellMap == 'R');
  }
}
