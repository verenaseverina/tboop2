/**
 * Created by Kebun Binatang Bandung on 3/26/17.
 */

package animal.turunananimal.binatang;

import animal.turunananimal.AirAnimal;
import java.lang.Math;

/**
 * Kelas ElangB adalah turunan LandAnimal dan merepresentasikan spesies ElangB.
 */
public class ElangB extends AirAnimal {
  /**
   * Konstruktor ElangB.
   * @param absis indeks kolom ElangB ditempatkan pada peta
   * @param ordinat indeks baris ElangB ditempatkan pada peta
   * @param id indeks penempatan Cage untuk ElangB
   */
  public ElangB(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "Kiiiaaa";
    content = 'E';
    myWeight = 4f + (float)(Math.random() * 2 + 1);
    howMuchIEat = 0.4535f * myWeight / 4f;
    whatIEat = 'c';
    isTame = true;
  }

  @Override

  /**
   * Getter interaction ElangB.
   * @return String interaksi ElangB
   */
  public String getInteract() {
    return interaction;
  }

  /**
   * Getter massa ElangB.
   * @return float massa ElangB
   */
  public float getWeight() {
    return myWeight;
  }

  /**
   * Getter jumlah makan ElangB.
   * @return float jumlah makan ElangB
   */
  public float getEat() {
    return howMuchIEat;
  }

  /**
   * Getter jenis makanan ElangB.
   * @return karakter jenis makanan ElangB.
   */
  public char getWEat() {
    return whatIEat;
  }
}

