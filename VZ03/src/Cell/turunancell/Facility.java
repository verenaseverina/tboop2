/**
 * Created by Kebun Binatang Bandung on 3/26/17.
 */

package cell.turunancell;

import cell.Cell;

/**
 * Kelas spesifikasi Cell sebagai Facility untuk pengunjung.
 * <p>
 *     Kelas Facility memiliki atribut berupa boolean atau nilai
 *     kebenaran exit dan entrance.
 * </p>
 * @author Winarto
 * @authir Verena Severina
 */
public class Facility extends Cell {
  /**
   * Atribut entrance bernilai true apabila Facility adalah pintu masuk Zoo.
   */
  private boolean entrance = false;
  /**
   * Atribut exit bernilai true apabila Facility adalah pintu keluar Zoo.
   */
  private boolean exit = false;

  /**
   * Konstruktor Facility.
   * @param contentInput simbol dari Facility
   * @param iidx urutan baris dari Facility
   * @param jidx urutan kolom dari Facility
   */
  public Facility(char contentInput, int iidx, int jidx) {
    super(contentInput, iidx, jidx);
  }

  /**
   * Getter atribut entrance.
   * @return boolean eantrace
   */
  public boolean isEntrance() {
    return entrance;
  }

  /**
   * Getter atribut exit.
   * @return boolean exit
   */
  public boolean isExit() {
    return exit;
  }

  /**
   * Memberikan nilai true untuk entrance atau exit pada suatu Facility.
   * @param n integer command untuk memilih atribut yang di set true,
   *          1 untuk entrance dan 2 untuk exit.
   */
  public void setTrue(int n) {
    if (n == 0) {
      entrance = true;
    } else if (n == 1) {
      exit = true;
    }
  }
}
