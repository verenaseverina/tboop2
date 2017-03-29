package animal.turunananimal.binatang;

import animal.turunananimal.LaAnimal;
import java.lang.Math;

/**
 * Kelas Ostrich adalah turunan LaAnimal dan merepresentasikan spesies Ostrich.
 */
public class Ostrich extends LaAnimal {
  /**
   * Konstruktor Ostrich.
   * @param absis indeks kolom Ostrich ditempatkan pada peta
   * @param ordinat indeks baris Ostrich ditempatkan pada peta
   * @param id indeks penempatan Cage untuk Ostrich
   */
  public Ostrich(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Nguuukkk";
    content = 'O';
    myWeight = 25f + (float)(Math.random() * 34 + 1);
    howMuchIEat = 5f * myWeight / 100f;
    whatIEat = 'o';
    isTame = true;
  }

  /**
   * Getter interaction Ostrich.
   * @return String interaksi Ostrich
   */
  public String getInteract() {
    return interaction;
  }

  /**
   * Getter massa Ostrich.
   * @return float massa Ostrich
   */
  public float getWeight() {
    return myWeight;
  }

  /**
   * Getter jumlah makan Ostrich.
   * @return float jumlah makan Ostrich
   */
  public float getEat() {
    return howMuchIEat;
  }

  /**
   * Getter jenis makanan Ostrich.
   * @return karakter jenis makanan Ostrich.
   */
  public char getWEat() {
    return whatIEat;
  }
}
