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
  public Cell(char _content, int x, int y) {
    content = _content;
    cellIdRow = x;
    cellIdCol = y;
  }
  public char GetCellContent() {
    return content;
  }
  public int GetCellRow() {
    return cellIdRow;
  }
  public int GetCellCol() {
    return cellIdCol;
  }
  public void SetTrueEntranceExit(int n) {
    n = 0;
  }
  public boolean IsEntrance() {
    return false;
  }
  public boolean IsExit() {
    return false;
  }
}