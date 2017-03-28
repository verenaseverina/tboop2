package cell;

/**
 * Created by verenaseverina on 3/25/17.
 */
public class Cell {
  protected char content;
  protected int cellIdRow;
  protected int cellIdCol;

  public Cell() {
    content = '\0';
    cellIdRow = -1;
    cellIdCol = -1;
  }
  public Cell(char contentInput, int xRow, int yCol) {
    content = contentInput;
    cellIdRow = xRow;
    cellIdCol = yCol;
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
  public void SetTrueEntranceExit(int nX) {
    nX = 0;
  }
  public boolean isEntrance() {
    return false;
  }
  public boolean isExit() {
    return false;
  }
}