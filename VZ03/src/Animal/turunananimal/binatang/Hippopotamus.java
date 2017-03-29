/**
 * Created by Kebun Binatang Bandung on 3/26/17.
 */

package animal.turunananimal.binatang;

import animal.turunananimal.LwAnimal;
import java.lang.Math;

/**
 * Kelas Hippopotamus adalah turunan LwAnimal dan merepresentasikan spesies Hippopotamus.
 */
public class Hippopotamus extends LwAnimal {
  /**
   * Konstruktor Hippopotamus.
   * @param absis indeks kolom Hippopotamus ditempatkan pada peta
   * @param ordinat indeks baris Hippopotamus ditempatkan pada peta
   * @param id indeks penempatan Cage untuk Hippopotamus
   */
  public Hippopotamus(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Grooowwll";
    content = 'N';
    myWeight = 1400f + (float)(Math.random() * 1800 + 1);
    howMuchIEat = 40f * myWeight / 2400f;
    whatIEat = 'h';
    isTame = true;
  }

  /**
   * Getter interaction Hippopotamus.
   * @return String interaksi Hippopotamus
   */
  public String getInteract() {
    return interaction;
  }

  /**
   * Getter massa Hippopotamus.
   * @return float massa Hippopotamus
   */
  public float getWeight() {
    return myWeight;
  }

  /**
   * Getter jumlah makan Hippopotamus.
   * @return float jumlah makan Hippopotamus
   */
  public float getEat() {
    return howMuchIEat;
  }

  /**
   * Getter jenis makanan Hippopotamus.
   * @return karakter jenis makanan Hippopotamus.
   */
  public char getWEat() {
    return whatIEat;
  }
}

