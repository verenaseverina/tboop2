/**
 * Created by verenaseverina on 3/25/17.
 */
public class Cell {
  private char content;
  private int cell_id_row;
  private int cell_id_col;
  private boolean entrance;
  private boolean exit;

  public Cell() {
    content = '\0';
    cell_id_row = -1;
    cell_id_col = -1;
  }
  public Cell(char _content, int x, int y) {
    content = _content;
    cell_id_row = x;
    cell_id_col = y;
  }
  public char GetCellContent() {
    return content;
  }
  public int GetCellRow() {
    return cell_id_row;
  }
  public int GetCellCol() {
    return cell_id_col;
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
