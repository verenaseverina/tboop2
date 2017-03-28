public class Cell {
  private char content;
  private int cellIdRow;
  private int cellIdCol;
  private boolean entrance;
  private boolean exit;

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
    if (n == 0) {
      entrance = true;
    }
    else if (n == 1) {
      exit = true;
    }
  }

}
