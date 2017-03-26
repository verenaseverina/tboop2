import java.util.Vector;
import Cell.Cell;
import Cell.turunancell.Habitat;
import Animal.Animal;

public class Zoo {
  private Vector<Cage> cages;
  private Cell playerpos;
  private Cell[][] map;
  private int height;
  private int width;

  public Zoo() {

  }
  public void GetAllCage(State s) {

  }
  public Vector<Habitat> GetCage(Cell h) {

  }
  public boolean InCage(Vector<Habitat> v, Cell c) {

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
