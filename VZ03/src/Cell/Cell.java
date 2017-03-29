package cell;

public class Cell {
  protected char content;
  protected int cellIdRow;
  protected int cellIdCol;

  public Cell() {
    content = '\0';
    cellIdRow = -1;
    cellIdCol = -1;
  }

  public Cell(char contentInput, int xrow, int ycol) {
    content = contentInput;
    cellIdRow = xrow;
    cellIdCol = ycol;
  }

  public char getCellContent() {
    return content;
  }

  public int getCellRow() {
    return cellIdRow;
  }

  public int getCellCol() {
    return cellIdCol;
  }

  public void setTrueEntranceExit(int nx) {
    nx = 0;
  }

  public boolean isEntrance() {
    return false;
  }

  public boolean isExit() {
    return false;
  }
}