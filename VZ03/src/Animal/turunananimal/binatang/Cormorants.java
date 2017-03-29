/**
 * Created by Kebun Binatang Bandung on 3/26/17.
 */

package animal.turunananimal.binatang;

import animal.turunananimal.WaAnimal;
import java.lang.Math;

/**
 * Kelas hewan adalah turunan WaAnimal dan merepresentasikan spesies hewan.
 */
public class Cormorants extends WaAnimal {
  /**
   * Konstruktor hewan.
   * @param absis indeks kolom hewan ditempatkan pada peta
   * @param ordinat indeks baris hewan ditempatkan pada peta
   * @param id indeks penempatan Cage untuk hewan
   */
  public Cormorants(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "*fly and swim*";
    content = 'M';
    myWeight = 2.5f + (float)(Math.random() * 2.5 + 1);
    howMuchIEat = 10f * myWeight / 100f;
    whatIEat = 'c';
    isTame = true;
  }


  /**
   * Getter interaction Cormorants.
   * @return String interaksi Cormorants
   */
  public String getInteract() {
    return interaction;
  }

  /**
   * Getter massa Cormorants.
   * @return float massa Cormorants
   */
  public float getWeight() {
    return myWeight;
  }

  /**
   * Getter jumlah makan Cormorants.
   * @return float jumlah makan Cormorants
   */
  public float getEat() {
    return howMuchIEat;
  }

  /**
   * Getter jenis makanan Cormorants.
   * @return karakter jenis makanan Cormorants.
   */
  public char getWEat() {
    return whatIEat;
  }
}
