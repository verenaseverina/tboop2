package cell.turunancell;

/**
 * Created by verenaseverina on 3/26/17.
 */
import cell.Cell;
public class Facility extends Cell {
  private boolean entrance = false;
  private boolean exit = false;

  public Facility(char contentInput, int iIdx, int jIdx) {
    super(contentInput, iIdx, jIdx);
  }
  public boolean isEntrance() {
    return entrance;
  }
  public boolean isExit() {
    return exit;
  }
  public void setTrue(int n) {
    if (n == 0) {
      entrance = true;
    }
    else if (n == 1) {
      exit = true;
    }
  }
}
