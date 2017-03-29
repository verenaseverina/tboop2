/**
 * Created by Kebun Binatang Bandung on 3/26/17.
 */
package cell.turunancell;

import cell.Cell;

/**
 * Kelas Habitat sebagai tempat tinggal binatang dan merupakan unsur utama Cage.
 *
 * @author Adrian Hartarto
 * @author Kukuh Basuki Rahmat
 */
public class Habitat extends Cell {
  /**
   * Konstruktor Habitat tanpa parameter.
   */
  public Habitat() {
    super();
  }

  /**
   * Konstruktor Habitat dengan parameter.
   * @param contentInput karakter simbol dari Habitat
   * @param xrow integer urutan baris pada map untuk Habitat
   * @param ycol integer urutan kolom pada map untuk Habitat
   */
  public Habitat(char contentInput, int xrow, int ycol) {
    super(contentInput, xrow, ycol);
  }
}

