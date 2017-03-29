package animal.turunananimal.binatang;

import animal.turunananimal.LandAnimal;
import java.lang.Math;

/**
 * Kelas Rhino adalah turunan LandAnimal dan merepresentasikan spesies Rhino.
 */
public class Rhino extends LandAnimal {
  /**
   * Konstruktor Rhino.
   * @param absis indeks kolom Rhino ditempatkan pada peta
   * @param ordinat indeks baris Rhino ditempatkan pada peta
   * @param id indeks penempatan Cage untuk Rhino
   */
  public Rhino(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Woooo";
    content = 'R';
    myWeight = 900f + (float)(Math.random() * 1400f + 1);
    howMuchIEat = 7.23f * myWeight / 100f;
    whatIEat = 'h';
    isTame = false;
  }

  /**
   * Getter interaction Rhino.
   * @return String interaksi Rhino
   */
  public String getInteract() {
    return interaction;
  }

  /**
   * Getter massa Rhino.
   * @return float massa Rhino
   */
  public float getWeight() {
    return myWeight;
  }

  /**
   * Getter jumlah makan Rhino.
   * @return float jumlah makan Rhino
   */
  public float getEat() {
    return howMuchIEat;
  }

  /**
   * Getter jenis makanan Rhino.
   * @return karakter jenis makanan Rhino.
   */
  public char getWEat() {
    return whatIEat;
  }
}

