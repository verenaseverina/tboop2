package animal.turunananimal.binatang;

import animal.turunananimal.WaAnimal;
import java.lang.Math;

/**
 * Kelas Pelikan adalah turunan WaAnimal dan merepresentasikan spesies Pelikan.
 */
public class Pelikan extends WaAnimal {
  /**
   * Konstruktor Pelikan.
   * @param absis indeks kolom Pelikan ditempatkan pada peta
   * @param ordinat indeks baris Pelikan ditempatkan pada peta
   * @param id indeks penempatan Cage untuk Pelikan
   */
  public Pelikan(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Aaaakk";
    content = 'Z';
    myWeight = 2.8f + (float)(Math.random() * 12.2 + 1);
    howMuchIEat = 26.67f * myWeight / 100f;
    whatIEat = 'c';
    isTame = true;
  }

  /**
   * Getter interaction Pelikan.
   * @return String interaksi Pelikan
   */
  public String getInteract() {
    return interaction;
  }

  /**
   * Getter massa Pelikan.
   * @return float massa Pelikan
   */
  public float getWeight() {
    return myWeight;
  }

  /**
   * Getter jumlah makan Pelikan.
   * @return float jumlah makan Pelikan
   */
  public float getEat() {
    return howMuchIEat;
  }

  /**
   * Getter jenis makanan Pelikan.
   * @return karakter jenis makanan Pelikan.
   */
  public char getWEat() {
    return whatIEat;
  }
}


