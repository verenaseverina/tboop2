/**
 * Created by Kebun Binatang Bandung on 3/26/17.
 */
import animal.Animal;
import animal.turunananimal.binatang.*;
import cell.Cell;
import cell.turunancell.Facility;
import cell.turunancell.Habitat;
import state.State;

import java.util.Scanner;
import java.util.Vector;

import static java.lang.Thread.sleep;

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
    widtanimalTemp = stateMap.getWidth();
    char[][] smap = new char[height][];
    for (int iIdx = 0; iIdx < width; iIdx++) {
      smap[iIdx] = stateMap.getMap()[iIdx].clone();
    }
    map = new Cell[height][width];
    for (int iIdx = 0; iIdx < height; iIdx++) {
      for (int jIdx = 0; jIdx < width; jIdx++) {
        if (isHabitat(smap[iIdx][jIdx])) {
          map[iIdx][jIdx] = new Habitat(smap[iIdx][jIdx], iIdx, jIdx);
        } else if (isFacility(smap[iIdx][jIdx])) {
          map[iIdx][jIdx] = new Facility(smap[iIdx][jIdx], iIdx, jIdx);
          if (iIdx == 0 || jIdx == 0) {
            map[i][j].SetTrueEntranceExit(0);
          } else if (iIdx == height || jIdx == width) {
            map[iIdx][jIdx].SetTrueEntranceExit(1);
          }
        }
      }
    }
    initAllCage(s);
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
    for (int iIdx = 0; iIdx < width; iIdx++) {
      smap[iIdx] = s.getMap()[iIdx].clone();
    }
    int nIdx = 1;
    for (int iIdx = 0; iIdx < height; iIdx++) {
      for (int jIdx = 0; jIdx < width; jIdx++) {
        if (isHabitat(smap[iIdx][jIdx])) {
          boolean recorded = false;
          int xIdx = 0;
          while ((!recorded) && (xIdx < cageBuffer.size())) {
            recorded = inCage(cageBuffer.get(xIdx), map[iIdx][jIdx]);
            xIdx++;
          }
          if (!recorded) {
            cageBuffer.setSize(nIdx);
            cageBuffer.set(nIdx-1, initCage((Habitat)map[iIdx][jIdx]));
            nIdx++;
          }
        }
      }
    }
    for (int iIdx = 0; iIdx < cageBuffer.size(); iIdx++) {
      Cage cgbuf = new Cage(cageBuffer.get(iIdx));
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
    int iIdx = 0;
    while (i < cage.size()) {
      animalTemp = cage.get(iIdx);
      if (habitatMap.getCellRow() - 1 >= 0) {
        if (map[habitatMap.getCellRow() - 1][habitatMap.getCellCol()].getCellContent() == hab.getCellContent() && !inCage(cage, map[habitatMap.getCellRow() - 1][habitatMap.getCellCol()])) {
          Habitat habTemp = new Habitat(hab.getCellContent(),habitatMap.getCellRow() - 1,habitatMap.getCellCol());
          cage.add(habTemp);
        }
      }
      if (habitatMap.getCellCol() + 1 < width) {
        if (map[habitatMap.getCellRow()][habitatMap.getCellCol() + 1].getCellContent() == hab.getCellContent() && !inCage(cage, map[habitatMap.getCellRow()][habitatMap.getCellCol() + 1])) {
          Habitat habTemp = new Habitat(hab.getCellContent(),habitatMap.getCellRow(),habitatMap.getCellCol() + 1);
          cage.add(habTemp);
        }
      }
      if (habitatMap.getCellRow() + 1 < height) {
        if (map[habitatMap.getCellRow() + 1][habitatMap.getCellCol()].getCellContent() == hab.getCellContent() && !inCage(cage, map[habitatMap.getCellRow() + 1][habitatMap.getCellCol()])) {
          Habitat habTemp = new Habitat(hab.getCellContent(),habitatMap.getCellRow() + 1,habitatMap.getCellCol());
          cage.add(habTemp);
        }
      }
      if (habitatMap.getCellCol() - 1 >= 0) {
        if (map[habitatMap.getCellRow()][habitatMap.getCellCol() - 1].getCellContent() == hab.getCellContent() && !inCage(cage, map[habitatMap.getCellRow()][habitatMap.getCellCol() - 1])) {
          Habitat habTemp = new Habitat(hab.getCellContent(),habitatMap.getCellRow(),habitatMap.getCellCol() - 1);
          cage.add(habTemp);
        }
      }
      iIdx++;
    }
    System.out.println();
    return cage;
  }

  /**
   * Melihat apakah suatu parameter cell termasuk dari suatu
   * parameter vector of Habitat.
   *
   * @param vMap vector Habitat yang akan ditinjau
   * @param cellMap cell yang akan ditinjau
   * @return boolean kebenaran suatu cell termasuk bagian dari suatu vector Habitat.
   */
  public boolean inCage(Vector<Habitat> vMap, Cell cellMap) {
    if (isHabitat(cellMap.getCellContent())) {
      boolean found = false;
      int iIdx = 0;
      while (!found && iIdx < vMap.size()) {
        if (cellMap.getCellRow() == vMap.get(iIdx).getCellRow() && cellMap.getCellCol() == vMap.get(iIdx).getCellCol()) {
          found = true;
        }
        iIdx++;
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
   *     <li>Kadang tidak penuh (Jumlah hewan < 30% Jumlah cell pada cage)</li>
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
    Scanner sInput = new Scanner(System.in);
    char inputUser = sInput.next().trim().charAt(0);

    boolean[] arr = new boolean[size];
    for (int iIdx = 0; iIdx < size; iIdx++) {
      arr[iIdx] = false;
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
    }
    
    System.out.println("Kandang yang tersedia :");
    for(int iIdx = 0; iIdx < size; iIdx++) {
      if(arr[iIdx]) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
    boolean found = false;
    System.out.println("Masukkan kode binatang yang ingin dimasukkan kedalam kandang: ");
    System.out.println("Untuk kandang bebas masukkan -1");
    System.out.println("Untuk membatalkan masukkan -2");
    int pilihanAngka;
    do {
      Scanner tInput = new Scanner(System.in);
      pilihanAngka = tInput.nextInt();
      found = true;
      if(pilihanAngka == -1 || pilihanAngka == -2){
        break;
      }
      if((pilihanAngka >= size)||(pilihanAngka < -2)) {
        System.out.println("Input salah, masukkan kembali input :");
        found = false;
      }
      else if(arr[pilihanAngka] == false && pilihanAngka < size && pilihanAngka >= 0) {
        System.out.println("Input salah, masukkan kembali input :");
        found = false;
      }
    } while (!found);
    if (pilihanAngka == -1) {
      int iIdx = 0;
      found = false;
      while(iIdx < size && !found) {
        if(arr[iIdx]) {
          found = true;
        } else {
          iIdx++;
        }
      }
      if(found) {
        do {
          pilihanAngka = (int) (Math.random() * size);
        } while (arr[pilihanAngka] == false);
      }
      else {
        System.out.println("Tidak ada kandang yang cocok");
      }
    }

    if (pilihanAngka != -2 && found) {
      cages.get(pilihanAngka).AddAnimal(inputUser,pilihanAngka);
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
  public void checkCage(boolean arr[], Animal animal) {
    for (int jIdx = 0; jIdx < animal.getSize(); jIdx++) {
      int iIdx = 0;
      while (iIdx < cages.size()) {
        if ((arr[iIdx] == false) && (animal.getArrayOfHabitat()[jIdx] == cages.get(iIdx).getHabitat()[0].getCellContent())) {
          //System.out.println(cages.get(i).getNeff());
          if (cages.get(iIdx).IsEmpty()) {
            arr[iIdx] = true;
          } else if ((!cages.get(iIdx).IsFull()) && (animal.getTame() == cages.get(iIdx).getAnimal()[0].getTame())) {
            arr[iIdx] = true;
          }
        }
        iIdx++;
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
    int iIdx = playerPos.getCellRow();
    int jIdx = playerPos.getCellCol();
    tourInteract(playerPos);
    if (isRoad(map[iIdx][jIdx + 1])) {
      Cell next = new Cell('=',iIdx, jIdx + 1);
      playerPos = next;
    } else if (isRoad(map[iIdx + 1][jIdx])) {
      Cell next = new Cell('=',iIdx + 1, jIdx);
      playerPos = next;
    } else if (isRoad(map[iIdx - 1][jIdx])) {
      Cell next = new Cell('=',iIdx - 1, jIdx);
      playerPos = next;
    } else if (isRoad(map[iIdx][jIdx - 1])) {
      Cell next = new Cell('=',iIdx, jIdx - 1);
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
      int xRow = pos.getCellRow() - 1;
      int yCol = pos.getCellCol();
      for (int kIdx = 0; kIdx < cages.size(); kIdx++) {
        if (cages.get(kIdx).InsideCage(xRow, yCol)) {
          if (!cages.get(kIdx).IsEmpty()) {
            System.out.println(cages.get(kIdx).getAnimal()[0].getContent() + ":" + cages.get(kIdx).getAnimal()[0].getInteract());
            cages.get(kIdx).getAnimal()[0].GiveFood();
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
    for (int iIdx = 0; iIdx < width; iIdx++) {
      if (isRoad(map[iIdx][0])) {
        ent.add(map[iIdx][0]);
      }
      if (isRoad(map[iIdx][width - 1])) {
        ex.add(map[iIdx][width - 1]);
      }
    }
    for (int jIdx = 0; jIdx < height; jIdx++) {
      if (isRoad(map[0][jIdx])) {
        ent.add(map[0][jIdx]);
      }
      if (isRoad(map[height - 1][jIdx])) {
        ex.add(map[height - 1][jIdx]);
      }
    }
    int randidx = (int)(Math.random() * ent.size());
    playerPos = new Cell(ent.get(randidx).getCellContent(), ent.get(randidx).getCellRow(), ent.get(randidx).getCellCol());
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
   * Peninjauan kebenaran suatu posisi (iIdx,jIdx) adalah posisi pengunjung Zoo.
   * @param iIdx baris map yang ditinjau
   * @param jIdx kolom map yang ditinjau
   * @return boolean kebenaran cell dengan baris ke-iIdx dan kolom ke-jIdx adalah posisi pemain.
   */
  public boolean isPlayer(int iIdx, int jIdx) {
    return (playerPos.getCellRow() == iIdx && playerPos.getCellCol() == jIdx);
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
