package animal.turunananimal;

import animal.Animal;

public abstract class WaterAnimal extends Animal {

  /**
   * ukuran dari Habitat WaterAnimal.
   */
  protected int size = 1;

  /**
   * Constructor.
   * @param absis adalah absis posisi dari WaterAnimal
   * @param ordinat adalah absis posisi dari WaterAnimal
   * @param id adalah id dari kandang WaterAnimal
   */
  public WaterAnimal(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    arrayOfHabitat = new char[size];
    arrayOfHabitat[0] = '~';
  }

  /**
   * Getter interaction.
   * @return String interaction yang dimiliki oleh WaterAnimal
   */
  public abstract String getInteract();

  /**
   * Getter size.
   * @return size dari Habitat tempat WaterAnimal berada
   */
  public int getSize() {
    return size;
  }
}
