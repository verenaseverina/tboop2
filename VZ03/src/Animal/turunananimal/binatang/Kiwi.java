package animal.turunananimal.binatang;

import animal.turunananimal.LaAnimal;
import java.lang.Math;

/**
 * Kelas Kiwi adalah turunan LaAnimal dan merepresentasikan spesies Kiwi.
 */
public class Kiwi extends LaAnimal {
  /**
   * Konstruktor Kiwi.
   * @param absis indeks kolom Kiwi ditempatkan pada peta
   * @param ordinat indeks baris Kiwi ditempatkan pada peta
   * @param id indeks penempatan Cage untuk Kiwi
   */
  public Kiwi(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "*walk and fly slightly*";
    content = 'I';
    myWeight = 1f + (float)(Math.random() * 2 + 1);
    howMuchIEat = 5f * myWeight / 100f;
    whatIEat = 'o';
    isTame = true;
  }

  /**
   * Getter interaction Kiwi.
   * @return String interaksi Kiwi
   */
  public String getInteract() {
    return interaction;
  }

  /**
   * Getter massa Kiwi.
   * @return float massa Kiwi
   */
  public float getWeight() {
    return myWeight;
  }

  /**
   * Getter jumlah makan Kiwi.
   * @return float jumlah makan Kiwi
   */
  public float getEat() {
    return howMuchIEat;
  }

  /**
   * Getter jenis makanan Kiwi.
   * @return karakter jenis makanan Kiwi.
   */
  public char getWEat() {
    return whatIEat;
  }
}
