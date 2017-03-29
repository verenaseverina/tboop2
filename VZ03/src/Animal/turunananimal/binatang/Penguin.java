package animal.turunananimal.binatang;

import animal.turunananimal.LwAnimal;
import java.lang.Math;

/**
 * Kelas Penguin adalah turunan LwAnimal dan merepresentasikan spesies Penguin.
 */
public class Penguin extends LwAnimal {
  /**
   * Konstruktor Penguin.
   * @param absis indeks kolom Penguin ditempatkan pada peta
   * @param ordinat indeks baris Penguin ditempatkan pada peta
   * @param id indeks penempatan Cage untuk Penguin
   */
  public Penguin(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Sqqqaaa";
    content = 'P';
    myWeight = 27f + (float)(Math.random() * 14 + 1);
    howMuchIEat = 0.9f * myWeight / 27f;
    whatIEat = 'c';
    isTame = true;
  }

  /**
   * Getter interaction Penguin.
   * @return String interaksi Penguin
   */
  public String getInteract() {
    return interaction;
  }

  /**
   * Getter massa Penguin.
   * @return float massa Penguin
   */
  public float getWeight() {
    return myWeight;
  }

  /**
   * Getter jumlah makan Penguin.
   * @return float jumlah makan Penguin
   */
  public float getEat() {
    return howMuchIEat;
  }

  /**
   * Getter jenis makanan Penguin.
   * @return karakter jenis makanan Penguin.
   */
  public char getWEat() {
    return whatIEat;
  }
}

