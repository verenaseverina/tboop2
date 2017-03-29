/**
 * Created by Kebun Binatang Bandung on 3/26/17.
 */
package animal.turunananimal.binatang;

import animal.turunananimal.WaterAnimal;
import java.lang.Math;

/**
 * Kelas hewan adalah turunan LandAnimal dan merepresentasikan spesies hewan
 */
public class Dolphin extends WaterAnimal {
  /**
   * Konstruktor hewan.
   * @param absis indeks kolom hewan ditempatkan pada peta
   * @param ordinat indeks baris hewan ditempatkan pada peta
   * @param id indeks penempatan Cage untuk hewan
   */
  public Dolphin(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Cuitttt";
    content = 'L';
    myWeight = 110f + (float)(Math.random() * 90 + 1);
    howMuchIEat = 2f * myWeight / 20f;
    whatIEat = 'c';
    isTame = true;
  }

  /**
   * Getter interaction Dolphin.
   * @return String interaksi Dolphin
   */
  public String getInteract() {
    return interaction;
  }

  /**
   * Getter massa Dolphin.
   * @return float massa Dolphin
   */
  public float getWeight() {
    return myWeight;
  }

  /**
   * Getter jumlah makan Dolphin.
   * @return float jumlah makan Dolphin
   */
  public float getEat() {
    return howMuchIEat;
  }

  /**
   * Getter jenis makanan Dolphin.
   * @return karakter jenis makanan Dolphin.
   */
  public char getWEat() {
    return whatIEat;
  }
}
