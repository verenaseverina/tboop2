package animal.turunananimal;

import animal.Animal;

public abstract class AirAnimal extends Animal {

  /**
   * ukuran dari Habitat AirAnimal.
   */
  protected int size = 1;

  /**
   * Constructor.
   * @param absis adalah absis posisi dari AirAnimal
   * @param ordinat adalah absis posisi dari AirAnimal
   * @param id adalah id dari kandang AirAnimal
   */
  public AirAnimal(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    arrayOfHabitat = new char[size];
    arrayOfHabitat[0] = '`';
  }

  /**
   * Getter interaction.
   * @return String interaction yang dimiliki oleh AirAnimal
   */
  public abstract String getInteract();

  /**
   * Getter size.
   * @return size dari Habitat tempat AirAnimal berada
   */
  public int getSize() {
    return size;
  }
}
