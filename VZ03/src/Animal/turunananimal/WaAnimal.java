package animal.turunananimal;

import animal.Animal;

public abstract class WaAnimal extends Animal {

  /**
   * ukuran dari Habitat WaAnimal.
   */
  protected int size = 2;

  /**
   * Constructor.
   * @param absis adalah absis posisi dari WaAnimal
   * @param ordinat adalah absis posisi dari WaAnimal
   * @param id adalah id dari kandang WaAnimal
   */
  public WaAnimal(int absis, int ordinat, int id) {
    super(absis,ordinat,id);
    arrayOfHabitat = new char[size];
    arrayOfHabitat[0] = '~';
    arrayOfHabitat[1] = '`';
  }

  /**
   * Getter interaction.
   * @return String interaction yang dimiliki oleh WaAnimal
   */
  public abstract String getInteract();

  /**
   * Getter size.
   * @return size dari Habitat tempat WaAnimal berada
   */
  public int getSize() {
    return size;
  }
}
