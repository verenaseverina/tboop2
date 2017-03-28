
import animal.Animal;
import animal.turunananimal.binatang.*;
import cell.Cell;
import cell.turunancell.Facility;
import cell.turunancell.Habitat;
import state.State;

import java.util.Scanner;
import java.util.Vector;

import static java.lang.Thread.sleep;

public class Zoo {

  private Vector<Cage> cages;
  private Cell playerPos;
  private Cell[][] map;
  private int height;
  private int width;

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

  public Cell[][] getMap() {
    return map;
  }

  public Vector<Cage> getCages() {
    return cages;
  }

  public int getHeight() {
    return height;
  }

  public int getWidth() {
    return width;
  }

  public Cell getPlayerPos() {
    return playerPos;
  }

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

  public boolean isExit(Cell pos) {
    return (pos.getCellRow() == height - 1 || pos.getCellCol() == width - 1);
  }

  public boolean isPlayer(int iIdx, int jIdx) {
    return (playerPos.getCellRow() == iIdx && playerPos.getCellCol() == jIdx);
  }

  public boolean isRoad(Cell cellMap) {
    return (cellMap.getCellContent() == '_');
  }

  public boolean isHabitat(char cellMap) {
    return (cellMap == '^' || cellMap == '~' || cellMap == '`');
  }

  public boolean isFacility(char cellMap) {
    return (cellMap == '#' || cellMap == '_' || cellMap == 'R');
  }
}
