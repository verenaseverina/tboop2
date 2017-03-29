package animal.turunananimal.binatang;

import animal.turunananimal.AirAnimal;
import java.lang.Math;

/**
 * Kelas Toucan adalah turunan AirAnimal dan merepresentasikan spesies Toucan.
 */
public class Toucan extends AirAnimal {
  /**
   * Konstruktor Toucan.
   * @param absis indeks kolom Toucan ditempatkan pada peta
   * @param ordinat indeks baris Toucan ditempatkan pada peta
   * @param id indeks penempatan Cage untuk Toucan
   */
  public Toucan(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Kwwaakk";
    content = 'T';
    myWeight = 0.592f + (float)(Math.random() * 0.168f + 1);
    howMuchIEat = 0.5f * myWeight / 100f;
    whatIEat = 'o';
    isTame = true;
  }

  /**
   * Getter interaction Toucan.
   * @return String interaksi Toucan
   */
  public String getInteract() {
    return interaction;
  }

  /**
   * Getter massa Toucan.
   * @return float massa Toucan
   */
  public float getWeight() {
    return myWeight;
  }

  /**
   * Getter jumlah makan Toucan.
   * @return float jumlah makan Toucan
   */
  public float getEat() {
    return howMuchIEat;
  }

  /**
   * Getter jenis makanan Toucan.
   * @return karakter jenis makanan Toucan.
   */
  public char getWEat() {
    return whatIEat;
  }
}

