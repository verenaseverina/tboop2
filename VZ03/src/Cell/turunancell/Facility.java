package cell.turunancell;

import cell.Cell;

public class Facility extends Cell {
  private boolean entrance = false;
  private boolean exit = false;

  public Facility(char contentInput, int iidx, int jidx) {
    super(contentInput, iidx, jidx);
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
    } else if (n == 1) {
      exit = true;
    }
  }
}
