/**
 * Created by Kebun Binatang Bandung on 3/26/17.
 */
package animal.turunananimal.binatang;

import animal.turunananimal.LwAnimal;
import java.lang.Math;

/**
 * Kelas Crocodile adalah turunan LandAnimal dan merepresentasikan spesies Crocodile
 */
public class Crocodile extends LwAnimal {
  /**
   * Konstruktor Crocodile.
   * @param absis indeks kolom Crocodile ditempatkan pada peta
   * @param ordinat indeks baris Crocodile ditempatkan pada peta
   * @param id indeks penempatan Cage untuk Crocodile
   */
  public Crocodile(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Rrrrr";
    content = 'C';
    myWeight = 400f + (float)(Math.random() * 300 + 1);
    howMuchIEat = 2f * myWeight / 700f;
    whatIEat = 'c';
    isTame = false;
  }

  /**
   * Getter interaction Crocodile.
   * @return String interaksi Crocodile
   */
  public String getInteract() {
    return interaction;
  }

  /**
   * Getter massa Crocodile.
   * @return float massa Crocodile
   */
  public float getWeight() {
    return myWeight;
  }

  /**
   * Getter jumlah makan Crocodile.
   * @return float jumlah makan Crocodile
   */
  public float getEat() {
    return howMuchIEat;
  }

  /**
   * Getter jenis makanan Crocodile.
   * @return karakter jenis makanan Crocodile.
   */
  public char getWEat() {
    return whatIEat;
  }
}
