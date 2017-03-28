
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
    State s = new State();
    height = s.GetHeight();
    width = s.GetWidth();
    char[][] smap = new char[height][];
    for (int i = 0; i < width; i++) {
      smap[i] = s.GetMap()[i].clone();
    }
    map = new Cell[height][width];
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        if (IsHabitat(smap[i][j])) {
          map[i][j] = new Cell(smap[i][j], i, j);
        } else if (IsFacility(smap[i][j])) {
          map[i][j] = new Cell(smap[i][j], i, j);
          if (i == 0 || j == 0) {
            map[i][j].SetTrueEntranceExit(0);
          } else if (i == height || j == width) {
            map[i][j].SetTrueEntranceExit(1);
          }
        }
      }
    }
    InitAllCage(s);
  }

  public void InitAllCage(State s) {
    Vector<Vector<Cell>> cage_buffer = new Vector<Vector<Cell>>(1);
    char[][] smap = new char[height][];
    for (int i = 0; i < width; i++) {
      smap[i] = s.GetMap()[i].clone();
    }
    int n = 1;
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        if (IsHabitat(smap[i][j])) {
          boolean recorded = false;
          int x = 0;
          while ((!recorded) && (x < cage_buffer.size())) {
            recorded = InCage(cage_buffer.get(x), map[i][j]);
            x++;
          }
          if (!recorded) {
            cage_buffer.setSize(n);
            cage_buffer.set(n-1, InitCage(map[i][j]));
            n++;
          }
        }
      }
    }
    for (int i = 0; i < cage_buffer.size(); i++) {
      Cage cgbuf = new Cage(cage_buffer.get(i));
      cages.add(cgbuf);
    }
  }

  public Vector<Cell> InitCage(Cell hab) {
    Vector<Cell> cage = new Vector<Cell>(1);
    Cell h;
    cage.add(hab);
    int i = 0;
    while (i < cage.size()) {
      h = cage.get(i);
      if (h.GetCellRow() - 1 >= 0) {
        if (map[h.GetCellRow() - 1][h.GetCellCol()].GetCellContent() == hab.GetCellContent() && !InCage(cage, map[h.GetCellRow() - 1][h.GetCellCol()])) {
          Cell b = new Cell(hab.GetCellContent(),h.GetCellRow() - 1,h.GetCellCol());
          cage.add(b);
        }
      }
      if (h.GetCellCol() + 1 < width) {
        if (map[h.GetCellRow()][h.GetCellCol() + 1].GetCellContent() == hab.GetCellContent() && !InCage(cage, map[h.GetCellRow()][h.GetCellCol() + 1])) {
          Cell b = new Cell(hab.GetCellContent(),h.GetCellRow(),h.GetCellCol() + 1);
          cage.add(b);
        }
      }
      if (h.GetCellRow() + 1 < height) {
        if (map[h.GetCellRow() + 1][h.GetCellCol()].GetCellContent() == hab.GetCellContent() && !InCage(cage, map[h.GetCellRow() + 1][h.GetCellCol()])) {
          Cell b = new Cell(hab.GetCellContent(),h.GetCellRow() + 1,h.GetCellCol());
          cage.add(b);
        }
      }
      if (h.GetCellCol() - 1 >= 0) {
        if (map[h.GetCellRow()][h.GetCellCol() - 1].GetCellContent() == hab.GetCellContent() && !InCage(cage, map[h.GetCellRow()][h.GetCellCol() - 1])) {
          Cell b = new Cell(hab.GetCellContent(),h.GetCellRow(),h.GetCellCol() - 1);
          cage.add(b);
        }
      }
      i++;
    }
    System.out.println();
    return cage;
  }

  public boolean InCage(Vector<Cell> v, Cell c) {
    if (IsHabitat(c.GetCellContent())) {
      boolean found = false;
      int i = 0;
      while (!found && i < v.size()) {
        if (c.GetCellRow() == v.get(i).GetCellRow() && c.GetCellCol() == v.get(i).GetCellCol()) {
          found = true;
        }
        i++;
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
    Scanner S = new Scanner(System.in);
    char input_user = S.next().trim().charAt(0);

    boolean[] arr = new boolean[size];
    for (int i = 0; i < size; i++) {
      arr[i] = false;
    }

    switch (input_user) {
      case 'H': {
        Animal H = new Animal(-1,-1,-1,'H');
        CheckCage(arr, H);
        break;
      }
      case 'B': {
        Animal H = new Animal(-1,-1,-1,'B');
        CheckCage(arr, H);
        break;
      }
      case 'A': {
        Animal H = new Animal(-1,-1,-1,'A');
        CheckCage(arr, H);
        break;
      }
      case 'R': {
        Animal H = new Animal(-1,-1,-1,'R');
        CheckCage(arr, H);
        break;
      }
      case 'D': {
        Animal H = new Animal(-1,-1,-1,'D');
        CheckCage(arr, H);
        break;
      }
      case 'L': {
        Animal H = new Animal(-1,-1,-1,'L');
        CheckCage(arr, H);
        break;
      }
      case 'W': {
        Animal H = new Animal(-1,-1,-1,'W');
        CheckCage(arr, H);
        break;
      }
      case 'S': {
        Animal H = new Animal(-1,-1,-1,'S');
        CheckCage(arr, H);
        break;
      }
      case 'K': {
        Animal H = new Animal(-1,-1,-1,'K');
        CheckCage(arr, H);
        break;
      }
      case 'E': {
        Animal H = new Animal(-1,-1,-1,'E');
        CheckCage(arr, H);
        break;
      }
      case 'T': {
        Animal H = new Animal(-1,-1,-1,'T');
        CheckCage(arr, H);
        break;
      }
      case 'P': {
        Animal H = new Animal(-1,-1,-1,'P');
        CheckCage(arr, H);
        break;
      }
      case 'C': {
        Animal H = new Animal(-1,-1,-1,'C');
        CheckCage(arr, H);
        break;
      }
      case 'N': {
        Animal H = new Animal(-1,-1,-1,'N');
        CheckCage(arr, H);
        break;
      }
    }
    
    System.out.println("Kandang yang tersedia :");
    for(int i=0; i<size; i++) {
      if(arr[i]) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
    boolean found = false;
    System.out.println("Masukkan kode binatang yang ingin dimasukkan kedalam kandang: ");
    System.out.println("Untuk kandang bebas masukkan -1");
    System.out.println("Untuk membatalkan masukkan -2");
    int x;
    do {
      Scanner T = new Scanner(System.in);
      x = T.nextInt();
      found = true;
      if(x==-1 || x==-2){
        break;
      }
      if((x>=size)||(x<-2)) {
        System.out.println("Input salah, masukkan kembali input :");
        found = false;
      }
      else if(arr[x]==false && x<size && x>=0) {
        System.out.println("Input salah, masukkan kembali input :");
        found = false;
      }
    } while (!found);
    if (x==-1) {
      int i = 0;
      found = false;
      while(i<size && !found) {
        if(arr[i]) {
          found = true;
        } else {
          i++;
        }
      }
      if(found) {
        do {
          x = (int) (Math.random() * size);
        } while (arr[x] == false);
      }
      else {
        System.out.println("Tidak ada kandang yang cocok");
      }
    }

    if (x!=-2 && found) {
      cages.get(x).AddAnimal(input_user,x);
    }
  }

  public void CheckCage(boolean arr[], Animal animal) {
    for (int j = 0; j < animal.GetSize(); j++) {
      int i = 0;
      while (i < cages.size()) {
        if ((arr[i] == false) && (animal.GetArrayOfHabitat()[j] == cages.get(i).getHabitat()[0].GetCellContent())) {
          //System.out.println(cages.get(i).GetNeff());
          if (cages.get(i).isEmpty()) {
            arr[i] = true;
          } else if ((!cages.get(i).isFull()) && (animal.GetTame() == cages.get(i).getAnimal()[0].GetTame())) {
            arr[i] = true;
          }
        }
        i++;
      }
    }
  }

  public void Tour() {
    int i = playerPos.GetCellRow();
    int j = playerPos.GetCellCol();
    TourInteract(playerPos);
    if (IsRoad(map[i][j + 1])) {
      Cell next = new Cell('=',i, j + 1);
      playerPos = next;
    } else if (IsRoad(map[i + 1][j])) {
      Cell next = new Cell('=',i + 1, j);
      playerPos = next;
    } else if (IsRoad(map[i - 1][j])) {
      Cell next = new Cell('=',i - 1, j);
      playerPos = next;
    } else if (IsRoad(map[i][j - 1])) {
      Cell next = new Cell('=',i, j - 1);
      playerPos = next;
    }
  }

  public void TourInteract(Cell pos) {
    if (pos.GetCellRow() > 0) {
      int x = pos.GetCellRow() - 1;
      int y = pos.GetCellCol();
      for (int k = 0; k < cages.size(); k++) {
        if (cages.get(k).insideCage(x, y)) {
          if (!cages.get(k).isEmpty()) {
            System.out.println(cages.get(k).getAnimal()[0].GetContent() + ":" + cages.get(k).getAnimal()[0].GetInteract());
            cages.get(k).getAnimal()[0].GiveFood();
          }
        }
      }
    }
  }

  public void RandomEntrance() {
    Vector<Cell> ent = new Vector<Cell>();
    Vector<Cell> ex = new Vector<Cell>();
    for (int i = 0; i < width; i++) {
      if (IsRoad(map[i][0])) {
        ent.add(map[i][0]);
      }
      if (IsRoad(map[i][width - 1])) {
        ex.add(map[i][width - 1]);
      }
    }
    for (int j = 0; j < height; j++) {
      if (IsRoad(map[0][j])) {
        ent.add(map[0][j]);
      }
      if (IsRoad(map[height - 1][j])) {
        ex.add(map[height - 1][j]);
      }
    }
    int randidx = (int)(Math.random() * ent.size());
    playerPos = new Cell(ent.get(randidx).GetCellContent(), ent.get(randidx).GetCellRow(), ent.get(randidx).GetCellCol());
  }

  public boolean IsExit(Cell pos) {
    return (pos.GetCellRow() == height - 1 || pos.GetCellCol() == width - 1);
  }

  public boolean IsPlayer(int i, int j) {
    return (playerPos.GetCellRow() == i && playerPos.GetCellCol() == j);
  }

  public boolean IsRoad(Cell c) {
    return (c.GetCellContent() == '_');
  }

  public boolean IsHabitat(char c) {
    return (c == '^' || c == '~' || c == '`');
  }

  public boolean IsFacility(char c) {
    return (c == '#' || c == '_' || c == 'R');
  }
}
