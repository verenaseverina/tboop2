package animal.turunananimal;

import animal.Animal;

public abstract class LwAnimal extends Animal {

  /**
   * ukuran dari Habitat LwAnimal.
   */
  protected int size = 2;

  /**
   * Constructor.
   * @param absis adalah absis posisi dari LwAnimal
   * @param ordinat adalah absis posisi dari LwAnimal
   * @param id adalah id dari kandang LwAnimal
   */
  public LwAnimal(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    arrayOfHabitat = new char[size];
    arrayOfHabitat[0] = '^';
    arrayOfHabitat[1] = '~';
  }

  /**
   * Getter interaction.
   * @return String interaction yang dimiliki oleh LwAnimal
   */
  public abstract String getInteract();

  /**
   * Getter size.
   * @return size dari Habitat tempat LwAnimal berada
   */
  public int getSize() {
    return size;
  }
}
