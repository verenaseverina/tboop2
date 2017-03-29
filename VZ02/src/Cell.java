public class Cell {
  /**
   * Isi karakter dari Cell.
   */
  private char content;
  /**
   * Baris dari Cell.
   */
  private int cellIdRow;
  /**
   * Kolom dari Cell.
   */
  private int cellIdCol;
  /**
   * boolean yang menyatakan apakah Cell merupakan entrance.
   */
  private boolean entrance;
  /**
   * boolean yang menyatakan apakah Cell merupakan exit.
   */
  private boolean exit;

  /**
   * Contructor.
   */
  public Cell() {
    content = '\0';
    cellIdRow = -1;
    cellIdCol = -1;
  }

  /**
   * Constructor.
   * @param contentIn karakter yang akan diassign ke Cell
   * @param xinput absis yang akan diassign ke Cell
   * @param yinput ordinat yang akan diassign ke Cell
   */
  public Cell(char contentIn, int xinput, int yinput) {
    content = contentIn;
    cellIdRow = xinput;
    cellIdCol = yinput;
  }

  /**
   * Getter Content Cell.
   * @return Content dari Cell
   */
  public char GetCellContent() {
    return content;
  }

  /**
   * Getter Baris dari Cell.
   * @return Baris dari Cell
   */
  public int GetCellRow() {
    return cellIdRow;
  }

  /**
   * Getter Kolom dari Cell.
   * @return Kolom dari Cell
   */
  public int GetCellCol() {
    return cellIdCol;
  }

  /**
   * Mengassign Cell merupakan entrance atau exit
   * @param n boolean yang menyatakan apakah Cell entrance atau exit
   */
  public void SetTrueEntranceExit(int n) {
    if (n == 0) {
      entrance = true;
    }
    else if (n == 1) {
      exit = true;
    }
  }

}
