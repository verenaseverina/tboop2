/**
 * Created by Kebun Binatang Bandung on 3/26/17.
 */
package animal.turunananimal.binatang;

import animal.turunananimal.AirAnimal;
import java.lang.Math;

/**
 * Kelas Kelelawar adalah turunan LandAnimal dan merepresentasikan spesies Kelelawar
 */
public class Kelelawar extends AirAnimal {
  /**
   * Konstruktor Kelelawar.
   * @param absis indeks kolom Kelelawar ditempatkan pada peta
   * @param ordinat indeks baris Kelelawar ditempatkan pada peta
   * @param id indeks penempatan Cage untuk Kelelawar
   */
  public Kelelawar(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Kiiiaaa";
    content = 'K';
    myWeight = 1.2f + (float)(Math.random() * 0.2f + 1);
    howMuchIEat = myWeight;
    whatIEat = 'o';
    isTame = true;
  }

  /**
   * Getter interaction Kelelawar.
   * @return String interaksi Kelelawar
   */
  public String getInteract() {
    return interaction;
  }

  /**
   * Getter massa Kelelawar.
   * @return float massa Kelelawar
   */
  public float getWeight() {
    return myWeight;
  }

  /**
   * Getter jumlah makan Kelelawar.
   * @return float jumlah makan Kelelawar
   */
  public float getEat() {
    return howMuchIEat;
  }

  /**
   * Getter jenis makanan Kelelawar.
   * @return karakter jenis makanan Kelelawar.
   */
  public char getWEat() {
    return whatIEat;
  }
}

