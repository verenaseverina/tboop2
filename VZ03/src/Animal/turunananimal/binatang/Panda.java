package animal.turunananimal.binatang;

import animal.turunananimal.LandAnimal;
import java.lang.Math;

/**
 * Kelas Panda adalah turunan LandAnimal dan merepresentasikan spesies Panda.
 */
public class Panda extends LandAnimal {
  /**
   * Konstruktor Panda.
   * @param absis indeks kolom Panda ditempatkan pada peta
   * @param ordinat indeks baris Panda ditempatkan pada peta
   * @param id indeks penempatan Cage untuk Panda
   */
  public Panda(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Mmmm";
    content = 'B';
    myWeight = 70f + (float)(Math.random() * 30 + 1);
    howMuchIEat = 38f * myWeight / 100f;
    whatIEat = 'h';
    isTame = true;
  }

  /**
   * Getter interaction Panda.
   * @return String interaksi Panda
   */
  public String getInteract() {
    return interaction;
  }

  /**
   * Getter massa Panda.
   * @return float massa Panda
   */
  public float getWeight() {
    return myWeight;
  }

  /**
   * Getter jumlah makan Panda.
   * @return float jumlah makan Panda
   */
  public float getEat() {
    return howMuchIEat;
  }

  /**
   * Getter jenis makanan Panda.
   * @return karakter jenis makanan Panda.
   */
  public char getWEat() {
    return whatIEat;
  }
}
