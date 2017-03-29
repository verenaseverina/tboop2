/**
 * Created by Kebun Binatang Bandung on 3/26/17.
 */
package animal.turunananimal.binatang;

import animal.turunananimal.LandAnimal;
import java.lang.Math;

/**
 * Kelas Anoa adalah turunan LandAnimal dan merepresentasikan spesies Anoa
 */
public class Anoa extends LandAnimal {
  /**
   * Konstruktor Anoa.
   * @param absis indeks kolom Anoa ditempatkan pada peta
   * @param ordinat indeks baris Anoa ditempatkan pada peta
   * @param id indeks penempatan Cage untuk Anoa
   */
  public Anoa(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Grrrr";
    content = 'A';
    myWeight = 150f + (float)(Math.random() * 150 + 1);
    howMuchIEat = 5f * myWeight / 100f;
    whatIEat = 'h';
    isTame = true;
  }

  /**
   * Getter interaction Anoa.
   * @return String interaksi Anoa
   */
  public String getInteract() {
    return interaction;
  }

  /**
   * Getter massa Anoa.
   * @return float massa Anoa
   */
  public float getWeight() {
    return myWeight;
  }

  /**
   * Getter jumlah makan Anoa.
   * @return float jumlah makan Anoa
   */
  public float getEat() {
    return howMuchIEat;
  }

  /**
   * Getter jenis makanan Anoa.
   * @return karakter jenis makanan Anoa.
   */
  public char getWEat() {
    return whatIEat;
  }
}