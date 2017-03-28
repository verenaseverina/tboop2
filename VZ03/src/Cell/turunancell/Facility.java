package cell.turunancell;

/**
 * Created by verenaseverina on 3/26/17.
 */
import cell.Cell;
public class Facility extends Cell {
  private boolean entrance = false;
  private boolean exit = false;

  public Facility(char _content, int i, int j) {
    super(_content, i, j);
  }
  public boolean IsEntrance() {
    return entrance;
  }
  public boolean IsExit() {
    return exit;
  }
  public void SetTrue(int n) {
    if (n == 0) {
      entrance = true;
    }
    else if (n == 1) {
      exit = true;
    }
  }
}
