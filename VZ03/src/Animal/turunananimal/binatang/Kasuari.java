/**
 * Created by Kebun Binatang Bandung on 3/26/17.
 */

package animal.turunananimal.binatang;

import animal.turunananimal.LaAnimal;
import java.lang.Math;

/**
 * Kelas Kasuari adalah turunan LaAnimal dan merepresentasikan spesies Kasuari.
 */
public class Kasuari extends LaAnimal {
  /**
   * Konstruktor Kasuari.
   * @param absis indeks kolom Kasuari ditempatkan pada peta
   * @param ordinat indeks baris Kasuari ditempatkan pada peta
   * @param id indeks penempatan Cage untuk Kasuari
   */
  public Kasuari(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Arrrrkkkk";
    content = 'Y';
    myWeight = 25f + (float)(Math.random() * 34 + 1);
    howMuchIEat = 5f * myWeight / 100f;
    whatIEat = 'o';
    isTame = true;
  }

  /**
   * Getter interaction Kasuari.
   * @return String interaksi Kasuari
   */
  public String getInteract() {
    return interaction;
  }

  /**
   * Getter massa Kasuari.
   * @return float massa Kasuari
   */
  public float getWeight() {
    return myWeight;
  }

  /**
   * Getter jumlah makan Kasuari.
   * @return float jumlah makan Kasuari
   */
  public float getEat() {
    return howMuchIEat;
  }

  /**
   * Getter jenis makanan Kasuari.
   * @return karakter jenis makanan Kasuari.
   */
  public char getWEat() {
    return whatIEat;
  }
}
