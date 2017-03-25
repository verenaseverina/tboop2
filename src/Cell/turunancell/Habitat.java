package Cell.turunancell;

/**
 * Created by verenaseverina on 3/25/17.
 */
import Cell.Cell;
public class Habitat extends Cell {
  public Habitat() {
    cell_id_row = -1;
    cell_id_col = -1;
    content = '\0';
  }
  public Habitat(char _content, int x, int y) {
    cell_id_row = x;
    cell_id_col = y;
    content = _content;
  }
}

