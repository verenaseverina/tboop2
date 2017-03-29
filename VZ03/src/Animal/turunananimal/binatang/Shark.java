package animal.turunananimal.binatang;

import animal.turunananimal.WaterAnimal;
import java.lang.Math;

/**
 * Kelas Shark adalah turunan WaterAnimal dan merepresentasikan spesies Shark.
 */
public class Shark extends WaterAnimal {
  /**
   * Konstruktor Shark.
   * @param absis indeks kolom Shark ditempatkan pada peta
   * @param ordinat indeks baris Shark ditempatkan pada peta
   * @param id indeks penempatan Cage untuk Shark
   */
  public Shark(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "*Wett*";
    content = 'S';
    myWeight = 21500f + (float)(Math.random() * 8500 + 1);
    howMuchIEat = 0.0667f * myWeight;
    whatIEat = 'c';
    isTame = false;
  }

  /**
   * Getter interaction Shark.
   * @return String interaksi Shark
   */
  public String getInteract() {
    return interaction;
  }

  /**
   * Getter massa Shark.
   * @return float massa Shark
   */
  public float getWeight() {
    return myWeight;
  }

  /**
   * Getter jumlah makan Shark.
   * @return float jumlah makan Shark
   */
  public float getEat() {
    return howMuchIEat;
  }

  /**
   * Getter jenis makanan Shark.
   * @return karakter jenis makanan Shark.
   */
  public char getWEat() {
    return whatIEat;
  }
}

