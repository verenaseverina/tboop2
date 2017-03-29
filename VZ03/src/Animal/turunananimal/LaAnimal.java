package animal.turunananimal;

import animal.Animal;

public abstract class LaAnimal extends Animal {

  /**
   * ukuran dari Habitat LaAnimal.
   */
  protected int size = 2;

  /**
   * Constructor.
   * @param absis adalah absis posisi dari LaAnimal
   * @param ordinat adalah absis posisi dari LaAnimal
   * @param id adalah id dari kandang LaAnimal
   */
  public LaAnimal(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    arrayOfHabitat = new char[size];
    arrayOfHabitat[0] = '^';
    arrayOfHabitat[1] = '`';
  }

  /**
   * Getter interaction.
   * @return String interaction yang dimiliki oleh LaAnimal
   */
  public abstract String getInteract();

  /**
   * Getter size.
   * @return size dari Habitat tempat LaAnimal berada
   */
  public int getSize() {
    return size;
  }
}
