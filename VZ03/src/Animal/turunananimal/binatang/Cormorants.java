/**
 * Created by Kebun Binatang Bandung on 3/26/17.
 */
package animal.turunananimal.binatang;

import animal.turunananimal.WaAnimal;
import java.lang.Math;

/**
 * Kelas hewan adalah turunan LandAnimal dan merepresentasikan spesies hewan
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
   * Getter interaction hewan.
   * @return String interaksi hewan
   */
  public String getInteract() {
    return interaction;
  }

  /**
   * Getter massa hewan.
   * @return float massa hewan
   */
  public float getWeight() {
    return myWeight;
  }

  /**
   * Getter jumlah makan hewan.
   * @return float jumlah makan hewan
   */
  public float getEat() {
    return howMuchIEat;
  }

  /**
   * Getter jenis makanan hewan.
   * @return karakter jenis makanan hewan.
   */
  public char getWEat() {
    return whatIEat;
  }
}
