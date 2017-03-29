/**
 * Created by Kebun Binatang Bandung on 3/26/17.
 */

package animal.turunananimal.binatang;

import animal.turunananimal.WaAnimal;
import java.lang.Math;

/**
 * Kelas FlyingFish adalah turunan LandAnimal dan merepresentasikan spesies FlyingFish.
 */
public class FlyingFish extends WaAnimal {
  /**
   * Konstruktor FlyingFish.
   * @param absis indeks kolom FlyingFish ditempatkan pada peta
   * @param ordinat indeks baris FlyingFish ditempatkan pada peta
   * @param id indeks penempatan Cage untuk FlyingFish
   */
  public FlyingFish(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    interaction = "*stride*";
    content = 'F';
    myWeight = 1f + (float)(Math.random() * 6 + 1);
    howMuchIEat = 5f * myWeight / 100f;
    whatIEat = 'o';
    isTame = true;
  }

  /**
   * Getter interaction FlyingFish.
   * @return String interaksi FlyingFish
   */
  public String getInteract() {
    return interaction;
  }

  /**
   * Getter massa FlyingFish.
   * @return float massa FlyingFish
   */
  public float getWeight() {
    return myWeight;
  }

  /**
   * Getter jumlah makan FlyingFish.
   * @return float jumlah makan FlyingFish
   */
  public float getEat() {
    return howMuchIEat;
  }

  /**
   * Getter jenis makanan FlyingFish.
   * @return karakter jenis makanan FlyingFish.
   */
  public char getWEat() {
    return whatIEat;
  }
}
