
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
    height = stateMap.GetHeight();
    widtanimalTemp = stateMap.GetWidth();
    char[][] smap = new char[height][];
    for (int iIdx = 0; iIdx < width; iIdx++) {
      smap[iIdx] = stateMap.GetMap()[iIdx].clone();
    }
    map = new Cell[height][width];
    for (int iIdx = 0; iIdx < height; iIdx++) {
      for (int jIdx = 0; jIdx < width; jIdx++) {
        if (IsHabitat(smap[iIdx][jIdx])) {
          map[iIdx][jIdx] = new Habitat(smap[iIdx][jIdx], iIdx, jIdx);
        } else if (IsFacility(smap[iIdx][jIdx])) {
          map[iIdx][jIdx] = new Facility(smap[iIdx][jIdx], iIdx, jIdx);
          if (iIdx == 0 || jIdx == 0) {
            map[i][j].SetTrueEntranceExit(0);
          } else if (iIdx == height || jIdx == width) {
            map[iIdx][jIdx].SetTrueEntranceExit(1);
          }
        }
      }
    }
    InitAllCage(s);
  }

  public void InitAllCage(State stateMap) {
    Vector<Vector<Habitat>> cageBuffer = new Vector<Vector<Habitat>>(1);
    char[][] smap = new char[height][];
    for (int iIdx = 0; iIdx < width; iIdx++) {
      smap[iIdx] = s.GetMap()[iIdx].clone();
    }
    int nIdx = 1;
    for (int iIdx = 0; iIdx < height; iIdx++) {
      for (int jIdx = 0; jIdx < width; jIdx++) {
        if (IsHabitat(smap[iIdx][jIdx])) {
          boolean recorded = false;
          int xIdx = 0;
          while ((!recorded) && (xIdx < cageBuffer.size())) {
            recorded = InCage(cageBuffer.get(xIdx), map[iIdx][jIdx]);
            xIdx++;
          }
          if (!recorded) {
            cageBuffer.setSize(nIdx);
            cageBuffer.set(nIdx-1, InitCage((Habitat)map[iIdx][jIdx]));
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

  public Vector<Habitat> InitCage(Habitat hab) {
    Vector<Habitat> cage = new Vector<Habitat>(1);
    Habitat habitatMap;
    cage.add(hab);
    int iIdx = 0;
    while (i < cage.size()) {
      animalTemp = cage.get(iIdx);
      if (habitatMap.GetCellRow() - 1 >= 0) {
        if (map[habitatMap.GetCellRow() - 1][habitatMap.GetCellCol()].GetCellContent() == hab.GetCellContent() && !InCage(cage, map[habitatMap.GetCellRow() - 1][habitatMap.GetCellCol()])) {
          Habitat habTemp = new Habitat(hab.GetCellContent(),habitatMap.GetCellRow() - 1,habitatMap.GetCellCol());
          cage.add(habTemp);
        }
      }
      if (habitatMap.GetCellCol() + 1 < width) {
        if (map[habitatMap.GetCellRow()][habitatMap.GetCellCol() + 1].GetCellContent() == hab.GetCellContent() && !InCage(cage, map[habitatMap.GetCellRow()][habitatMap.GetCellCol() + 1])) {
          Habitat habTemp = new Habitat(hab.GetCellContent(),habitatMap.GetCellRow(),habitatMap.GetCellCol() + 1);
          cage.add(habTemp);
        }
      }
      if (habitatMap.GetCellRow() + 1 < height) {
        if (map[habitatMap.GetCellRow() + 1][habitatMap.GetCellCol()].GetCellContent() == hab.GetCellContent() && !InCage(cage, map[habitatMap.GetCellRow() + 1][habitatMap.GetCellCol()])) {
          Habitat habTemp = new Habitat(hab.GetCellContent(),habitatMap.GetCellRow() + 1,habitatMap.GetCellCol());
          cage.add(habTemp);
        }
      }
      if (habitatMap.GetCellCol() - 1 >= 0) {
        if (map[habitatMap.GetCellRow()][habitatMap.GetCellCol() - 1].GetCellContent() == hab.GetCellContent() && !InCage(cage, map[habitatMap.GetCellRow()][habitatMap.GetCellCol() - 1])) {
          Habitat habTemp = new Habitat(hab.GetCellContent(),habitatMap.GetCellRow(),habitatMap.GetCellCol() - 1);
          cage.add(habTemp);
        }
      }
      iIdx++;
    }
    System.out.println();
    return cage;
  }

  public boolean InCage(Vector<Habitat> vMap, Cell cellMap) {
    if (IsHabitat(cellMap.GetCellContent())) {
      boolean found = false;
      int iIdx = 0;
      while (!found && iIdx < vMap.size()) {
        if (cellMap.GetCellRow() == vMap.get(iIdx).GetCellRow() && cellMap.GetCellCol() == vMap.get(iIdx).GetCellCol()) {
          found = true;
        }
        iIdx++;
      }
      return (found);
    } else {
      return (false);
    }
  }

  public Cell[][] GetMap() {
    return map;
  }

  public Vector<Cage> GetCages() {
    return cages;
  }

  public int GetHeight() {
    return height;
  }

  public int GetWidth() {
    return width;
  }

  public Cell GetPlayerPos() {
    return playerPos;
  }

  public void PutInAnimal() {
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
        CheckCage(arr, animalTemp);
        break;
      }
      case 'B': {
        Panda animalTemp = new Panda(-1,-1,-1);
        CheckCage(arr, animalTemp);
        break;
      }
      case 'A': {
        Anoa animalTemp = new Anoa(-1,-1,-1);
        CheckCage(arr, animalTemp);
        break;
      }
      case 'R': {
        Rhino animalTemp = new Rhino(-1,-1,-1);
        CheckCage(arr, animalTemp);
        break;
      }
      case 'D': {
        Kangaroo animalTemp = new Kangaroo(-1,-1,-1);
        CheckCage(arr, animalTemp);
        break;
      }
      case 'L': {
        Dolphin animalTemp = new Dolphin(-1,-1,-1);
        CheckCage(arr, animalTemp);
        break;
      }
      case 'W': {
        Whale animalTemp = new Whale(-1,-1,-1);
        CheckCage(arr, animalTemp);
        break;
      }
      case 'S': {
        Shark animalTemp = new Shark(-1,-1,-1);
        CheckCage(arr, animalTemp);
        break;
      }
      case 'K': {
        Kelelawar animalTemp = new Kelelawar(-1,-1,-1);
        CheckCage(arr, animalTemp);
        break;
      }
      case 'E': {
        ElangB animalTemp = new ElangB(-1,-1,-1);
        CheckCage(arr, animalTemp);
        break;
      }
      case 'T': {
        Toucan animalTemp = new Toucan(-1,-1,-1);
        CheckCage(arr, animalTemp);
        break;
      }
      case 'P': {
        Penguin animalTemp = new Penguin(-1,-1,-1);
        CheckCage(arr, animalTemp);
        break;
      }
      case 'C': {
        Crocodile animalTemp = new Crocodile(-1,-1,-1);
        CheckCage(arr, animalTemp);
        break;
      }
      case 'N': {
        Hippopotamus animalTemp = new Hippopotamus(-1,-1,-1);
        CheckCage(arr, animalTemp);
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

  public void CheckCage(boolean arr[], Animal animal) {
    for (int jIdx = 0; jIdx < animal.GetSize(); jIdx++) {
      int iIdx = 0;
      while (iIdx < cages.size()) {
        if ((arr[iIdx] == false) && (animal.GetArrayOfHabitat()[jIdx] == cages.get(iIdx).GetHabitat()[0].GetCellContent())) {
          //System.out.println(cages.get(i).GetNeff());
          if (cages.get(iIdx).IsEmpty()) {
            arr[iIdx] = true;
          } else if ((!cages.get(iIdx).IsFull()) && (animal.GetTame() == cages.get(iIdx).GetAnimal()[0].GetTame())) {
            arr[iIdx] = true;
          }
        }
        iIdx++;
      }
    }
  }

  public void Tour() {
    int iIdx = playerPos.GetCellRow();
    int jIdx = playerPos.GetCellCol();
    TourInteract(playerPos);
    if (IsRoad(map[iIdx][jIdx + 1])) {
      Cell next = new Cell('=',iIdx, jIdx + 1);
      playerPos = next;
    } else if (IsRoad(map[iIdx + 1][jIdx])) {
      Cell next = new Cell('=',iIdx + 1, jIdx);
      playerPos = next;
    } else if (IsRoad(map[iIdx - 1][jIdx])) {
      Cell next = new Cell('=',iIdx - 1, jIdx);
      playerPos = next;
    } else if (IsRoad(map[iIdx][jIdx - 1])) {
      Cell next = new Cell('=',iIdx, jIdx - 1);
      playerPos = next;
    }
  }

  public void TourInteract(Cell pos) {
    if (pos.GetCellRow() > 0) {
      int xRow = pos.GetCellRow() - 1;
      int yCol = pos.GetCellCol();
      for (int kIdx = 0; kIdx < cages.size(); kIdx++) {
        if (cages.get(kIdx).InsideCage(xRow, yCol)) {
          if (!cages.get(kIdx).IsEmpty()) {
            System.out.println(cages.get(kIdx).GetAnimal()[0].GetContent() + ":" + cages.get(kIdx).GetAnimal()[0].GetInteract());
            cages.get(kIdx).GetAnimal()[0].GiveFood();
          }
        }
      }
    }
  }

  public void RandomEntrance() {
    Vector<Cell> ent = new Vector<Cell>();
    Vector<Cell> ex = new Vector<Cell>();
    for (int iIdx = 0; iIdx < width; iIdx++) {
      if (IsRoad(map[iIdx][0])) {
        ent.add(map[iIdx][0]);
      }
      if (IsRoad(map[iIdx][width - 1])) {
        ex.add(map[iIdx][width - 1]);
      }
    }
    for (int jIdx = 0; jIdx < height; jIdx++) {
      if (IsRoad(map[0][jIdx])) {
        ent.add(map[0][jIdx]);
      }
      if (IsRoad(map[height - 1][jIdx])) {
        ex.add(map[height - 1][jIdx]);
      }
    }
    int randidx = (int)(Math.random() * ent.size());
    playerPos = new Cell(ent.get(randidx).GetCellContent(), ent.get(randidx).GetCellRow(), ent.get(randidx).GetCellCol());
  }

  public boolean IsExit(Cell pos) {
    return (pos.GetCellRow() == height - 1 || pos.GetCellCol() == width - 1);
  }

  public boolean IsPlayer(int iIdx, int jIdx) {
    return (playerPos.GetCellRow() == iIdx && playerPos.GetCellCol() == jIdx);
  }

  public boolean IsRoad(Cell cellMap) {
    return (cellMap.GetCellContent() == '_');
  }

  public boolean IsHabitat(char cellMap) {
    return (cellMap == '^' || cellMap == '~' || cellMap == '`');
  }

  public boolean IsFacility(char cellMap) {
    return (cellMap == '#' || cellMap == '_' || cellMap == 'R');
  }
}
