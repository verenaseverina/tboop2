package animal.turunananimal.binatang;

import animal.turunananimal.LandAnimal;
import java.lang.Math;

/**
 * Kelas Tiger adalah turunan LandAnimal dan merepresentasikan spesies Tiger.
 */
public class Tiger extends LandAnimal {
  /**
   * Konstruktor Tiger.
   * @param absis indeks kolom Tiger ditempatkan pada peta
   * @param ordinat indeks baris Tiger ditempatkan pada peta
   * @param id indeks penempatan Cage untuk Tiger
   */
  public Tiger(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Roooarrrr";
    content = 'H';
    myWeight = 90f + (float)(Math.random() * 220 + 1);
    howMuchIEat = 7.23f * myWeight / 100f;
    whatIEat = 'c';
    isTame = false;
  }

  /**
   * Getter interaction Tiger.
   * @return String interaksi Tiger
   */
  public String getInteract() {
    return interaction;
  }

  /**
   * Getter massa Tiger.
   * @return float massa Tiger
   */
  public float getWeight() {
    return myWeight;
  }

  /**
   * Getter jumlah makan Tiger.
   * @return float jumlah makan Tiger
   */
  public float getEat() {
    return howMuchIEat;
  }

  /**
   * Getter jenis makanan Tiger.
   * @return karakter jenis makanan Tiger.
   */
  public char getWEat() {
    return whatIEat;
  }
}

