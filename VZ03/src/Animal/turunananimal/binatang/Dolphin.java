package animal.turunananimal.binatang;

import animal.turunananimal.WaterAnimal;
import java.lang.Math;

/**
 * Kelas Dolphin adalah turunan WaterAnimal dan merepresentasikan spesies Dolphin.
 */
public class Dolphin extends WaterAnimal {
  /**
   * Konstruktor Dolphin.
   * @param absis indeks kolom Dolphin ditempatkan pada peta
   * @param ordinat indeks baris Dolphin ditempatkan pada peta
   * @param id indeks penempatan Cage untuk Dolphin
   */
  public Dolphin(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Cuitttt";
    content = 'L';
    myWeight = 110f + (float)(Math.random() * 90 + 1);
    howMuchIEat = 2f * myWeight / 20f;
    whatIEat = 'c';
    isTame = true;
  }

  /**
   * Getter interaction Dolphin.
   * @return String interaksi Dolphin
   */
  public String getInteract() {
    return interaction;
  }

  /**
   * Getter massa Dolphin.
   * @return float massa Dolphin
   */
  public float getWeight() {
    return myWeight;
  }

  /**
   * Getter jumlah makan Dolphin.
   * @return float jumlah makan Dolphin
   */
  public float getEat() {
    return howMuchIEat;
  }

  /**
   * Getter jenis makanan Dolphin.
   * @return karakter jenis makanan Dolphin.
   */
  public char getWEat() {
    return whatIEat;
  }
}
