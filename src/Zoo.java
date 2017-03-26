import java.util.Vector;
import java.lang.Math;
import Cell.Cell;
import Cell.turunancell.Habitat;
import Animal.Animal;

public class Zoo {
  private Vector<Cage> cages;
  private Cell playerpos;
  private Cell[][][] map;
  private int height;
  private int width;

  public Zoo() {
    State s;
    height = s.GetHeight();
    width = s.GetWidth();
    char[][] smap = new char[height][];
    for(int i=0;i < width;i++) {
      smap[i] = s.GetMap()[i].clone();
    }
    map = new Cell[height][width][];
    for(int i = 0;i < height;i++) {
      for(int j = 0;j < width;j++) {
        if(IsHabitat(smap[i][j])) {
          map[i][j] = new Habitat(smap[i][j],i,j);
        }
        else if (IsFacility(smap[i][j])) {
          map[i][j] = new Facility(smap[i][j],i,j);
          if(i==0||j==0)
            map[i][j][0].set_true(0);
          else if(i==height||j==width)
            map[i][j][0].set_true(1);
        }
      }
    }
    GetAllCage(s);
  }
  public void GetAllCage(State s) {
    Vector<Vector<Habitat>> cage_buffer(1);
    char[][] smap = new char[height][];
    for(int i=0;i<width;i++) {
      smap[i] = s.GetMap()[i].clone();
    }
    int n = 1;
    for(int i=0;i<height;i++) {
      for(int j=0;j<width;j++) {
        if(IsHabitat(smap[i][j])) {
          boolean recorded = false;
          int x = 0;
          while((!recorded) && (x < cage_buffer.size())) {
            recorded = InCage(cage_buffer[x],map[i][j]);
            x++;
          }
          if(!recorded) {
            cage_buffer.setSize(n);
            cage_buffer[n-1] = GetCage(map[i][j]);
            n++;
          }
        }
      }
    }
    for(int i=0;i<cage_buffer.size();i++) {
      Cage cgbuf(cage_buffer.size(),cage_buffer[i]);
      cages.add(cgbuf);
    }
  }
  public Vector<Habitat> GetCage(Cell hab) {
    Vector<Habitat> cage(1);
    Habitat h;
    cage.add(hab);
    int i = 0;
    while(i<cage.size())
    {
      h=cage.get(i);
      if(h.GetCellRow()-1>=0){
        if(map[h.GetCellRow()-1][h.GetCellCol()][0].GetCellContent()==hab.GetCellContent()&&!InCage(cage,map[h.GetCellRow()-1][h.GetCellCol()]))
        {
          Habitat b(hab.GetCellContent(),h.GetCellRow()-1,h.GetCellCol());
          cage.add(b);
        }
      }
      if(h.GetCellCol()+1<width){
        if(map[h.GetCellRow()][h.GetCellCol()+1][0].GetCellContent()==hab.GetCellContent()&&!InCage(cage,map[h.GetCellRow()][h.GetCellCol()+1]))
        {
          Habitat b(hab.GetCellContent(),h.GetCellRow(),h.GetCellCol()+1);
          cage.add(b);
        }
      }
      if(h.GetCellRow()+1<height){
        if(map[h.GetCellRow()+1][h.GetCellCol()][0].GetCellContent()==hab.GetCellContent()&&!InCage(cage,map[h.GetCellRow()+1][h.GetCellCol()]))
        {
          Habitat b(hab.GetCellContent(),h.GetCellRow()+1,h.GetCellCol());
          cage.add(b);
        }
      }
      if(h.GetCellCol()-1>=0){
        if(map[h.GetCellRow()][h.GetCellCol()-1][0].GetCellContent()==hab.GetCellContent()&&!InCage(cage,map[h.GetCellRow()][h.GetCellCol()-1]))
        {
          Habitat b(hab.GetCellContent(),h.GetCellRow(),h.GetCellCol()-1);
          cage.add(b);
        }
      }
      i++;
    }
    return cage;
  }
  public boolean InCage(Vector<Habitat> v, Cell c) {
    if(IsHabitat(c.GetCellContent())) {
      boolean found=false;
      int i=0;
      while(!found && i<v.size())
      {
        if(c.GetCellRow()==v.get(i).GetCellRow() && c.GetCellCol()==v.get(i).GetCellCol())
          found=true;
        i++;
      }
      return(found);
    }
    else {
      return(false);
    }
  }
  public Cell[][][] GetMap() {
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
    return playerpos;
  }

  public void PutInAnimal() {

  }
  public void CheckCage(boolean[] arr, Animal[] animal) {

  }
  public void Tour() {

  }
  public void TourInteract(Cell pos) {

  }
  public void RandomEntrance() {
    Vector<Cell> ent = new Vector<Cell>();
    Vector<Cell> ex = new Vector<Cell>();
    for(int i=0;i<width;i++)
    {
  	  if(IsRoad(map[i][0]))
  	    ent.add(map[i][0]);
      if(IsRoad(map[i][width-1]))
  	    ex.add(map[i][width-1]);
    }
    for(int j=0;j<height;j++)
    {
  	  if(IsRoad(map[0][j]))
  	    ent.add(map[0][j]);
      if(IsRoad(map[height-1][j]))
  	    ex.add(map[height-1][j]);
    }
    int randidx = Math.random()*ent.size();
    playerpos = ent.get(randidx);
  }
  public boolean Exit(Cell pos) {
    return (pos.GetCellRow() == height-1 || pos.GetCellCol() == width-1);
  }
  public boolean IsPlayer(int i, int j) {
    return (playerpos.GetCellRow() == i && playerpos.GetCellCol() == j);
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
