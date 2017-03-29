/**
 * Created by Kebun Binatang Bandung on 3/26/17.
 */

package cell;

/**
 * Kelas sebuah block 1 meter kali 1 meter didalam Zoo.
 * <p>
 *     Suatu Cell dapat berupa Facility atau Habitat sebagai kelas
 *     turunannya. Untuk properti perbedaan dari Facility dan Habitat
 *     dapat dilihat pada dokumentasi kelas yang bersangkutan.
 * </p>
 * <p>
 *     Cell memiliki tiga atribut yaitu isi dari Cell tersebut berupa karakter
 *     dan indeks baris dan kolom yang keduanya berupa integer.
 * </p>
 * @see cell.turunancell.Facility
 * @see cell.turunancell.Habitat
 *
 * @author Kukuh Basuki Rahmat
 * @author Verena Severina
 */
public class Cell {
  /**
   * Atribut konten karakter dari Cell.
   */
  protected char content;
  /**
   * Atribut indeks baris dari Cell.
   */
  protected int cellIdRow;
  /**
   * Atribut indeks kolom dari Cell.
   */
  protected int cellIdCol;

  /**
   * Konstruktor Cell Default.
   * Memiliki nilai-nilai atribut default:
   * <ul>
   *     <li>content = \0</li>
   *     <li>cellIdRow = -1</li>
   *     <li>cellIdCol = -1</li>
   * </ul>
   */
  public Cell() {
    content = '\0';
    cellIdRow = -1;
    cellIdCol = -1;
  }

  /**
   * Konstruktor Cell dengan parameter.
   * @param contentInput nilai konten Cell
   * @param xrow baris dari Cell
   * @param ycol kolom dari Cell
   */
  public Cell(char contentInput, int xrow, int ycol) {
    content = contentInput;
    cellIdRow = xrow;
    cellIdCol = ycol;
  }

  /**
   * Getter content Cell.
   * @return karakter konten Cell
   */
  public char getCellContent() {
    return content;
  }

  /**
   * Getter cellIdRow Cell.
   * @return integer baris lokasi Cell
   */
  public int getCellRow() {
    return cellIdRow;
  }

  /**
   * Getter cellIdCol Cell.
   * @return integer kolom lokasi Cell
   */
  public int getCellCol() {
    return cellIdCol;
  }

  /**
   * Method setTrueEntranceExit.
   * @param nx adalah input dari setTrueEntranceExit
   */
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