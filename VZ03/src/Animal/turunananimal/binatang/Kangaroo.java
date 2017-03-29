/**
 * Created by Kebun Binatang Bandung on 3/26/17.
 */
package animal.turunananimal.binatang;

import animal.turunananimal.LandAnimal;
import java.lang.Math;

/**
 * Kelas Kangaroo adalah turunan LandAnimal dan merepresentasikan spesies Kangaroo
 */
public class Kangaroo extends LandAnimal {
  /**
   * Konstruktor Kangaroo.
   * @param absis indeks kolom Kangaroo ditempatkan pada peta
   * @param ordinat indeks baris Kangaroo ditempatkan pada peta
   * @param id indeks penempatan Cage untuk Kangaroo
   */
  public Kangaroo(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "*Jummpp*";
    content = 'D';
    myWeight = 18f + (float)(Math.random() * 72 + 1);
    howMuchIEat = 0.35f * myWeight / 100f;
    whatIEat = 'h';
    isTame = true;
  }

  @Override

  /**
   * Getter interaction Kangaroo.
   * @return String interaksi Kangaroo
   */
  public String getInteract() {
    return interaction;
  }

  /**
   * Getter massa Kangaroo.
   * @return float massa Kangaroo
   */
  public float getWeight() {
    return myWeight;
  }

  /**
   * Getter jumlah makan Kangaroo.
   * @return float jumlah makan Kangaroo
   */
  public float getEat() {
    return howMuchIEat;
  }

  /**
   * Getter jenis makanan Kangaroo.
   * @return karakter jenis makanan Kangaroo.
   */
  public char getWEat() {
    return whatIEat;
  }
}

