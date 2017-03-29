package animal.turunananimal.binatang;

import animal.turunananimal.WaterAnimal;
import java.lang.Math;

/**
 * Kelas Whale adalah turunan WaterAnimal dan merepresentasikan spesies Whale.
 */
public class Whale extends WaterAnimal {
  /**
   * Konstruktor Whale.
   * @param absis indeks kolom Whale ditempatkan pada peta
   * @param ordinat indeks baris Whale ditempatkan pada peta
   * @param id indeks penempatan Cage untuk Whale
   */
  public Whale(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "*Wet*";
    content = 'W';
    myWeight = 14000f + (float)(Math.random() * 2000 + 1);
    howMuchIEat = 0.667f * myWeight;
    whatIEat = 'c';
    isTame = true;
  }

  /**
   * Getter interaction Whale.
   * @return String interaksi Whale
   */
  public String getInteract() {
    return interaction;
  }

  /**
   * Getter massa Whale.
   * @return float massa Whale
   */
  public float getWeight() {
    return myWeight;
  }

  /**
   * Getter jumlah makan Whale.
   * @return float jumlah makan Whale
   */
  public float getEat() {
    return howMuchIEat;
  }

  /**
   * Getter jenis makanan Whale.
   * @return karakter jenis makanan Whale.
   */
  public char getWEat() {
    return whatIEat;
  }
}
