package animal.turunananimal;

import animal.Animal;

public abstract class LandAnimal extends Animal {

  /**
   * ukuran dari Habitat LandAnimal.
   */
  protected int size = 1;

  /**
   * Constructor.
   * @param absis adalah absis posisi dari LandAnimal
   * @param ordinat adalah absis posisi dari LandAnimal
   * @param id adalah id dari kandang LandAnimal
   */
  public LandAnimal(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    arrayOfHabitat = new char[size];
    arrayOfHabitat[0] = '^';
  }

  /**
   * Getter interaction.
   * @return String interaction yang dimiliki oleh LandAnimal
   */
  public abstract String getInteract();

  /**
   * Getter size.
   * @return size dari Habitat tempat LandAnimal berada
   */
  public int getSize() {
    return size;
  }
}
