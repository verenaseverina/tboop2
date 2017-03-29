/**
 * Created by Kebun Binatang Bandung on 3/26/17.
 */

package animal;

/**
 * Kelas Animal adalah kelas abstrak untuk seluruh binatang.
 * Kelas Animal akan diturunkan menjadi 6 kelas lain yaitu:
 * <ol>
 *     <li>Land Animal</li>
 *     <li>Air Animal</li>
 *     <li>Water Animal</li>
 *     <li>Land Air Animal</li>
 *     <li>Water Air Animal</li>
 *     <li>Land Water Animal</li>
 * </ol>
 *
 * @see animal.turunananimal.LandAnimal
 * @see animal.turunananimal.AirAnimal
 * @see animal.turunananimal.WaterAnimal
 * @see animal.turunananimal.LaAnimal
 * @see animal.turunananimal.WaAnimal
 * @see animal.turunananimal.LwAnimal
 *
 * @author Adrian Hartarto
 * @author Winarto
 */
public abstract class Animal {
  /**
   * Atribut boolean apakah hewan jinak atau tidak.
   */
  protected boolean isTame;
  /**
   * Atribut string interaksi Animal dengan pengunjung.
   */
  protected String interaction;
  /**
   * Atribut kolom tempat lokasi hewan.
   */
  protected int absis;
  /**
   * Atribut baris tempat lokasi hewan.
   */
  protected int ordinat;
  /**
   * Atribut array alam yang dapat menjadi tempat hidup hewan.
   */
  protected char[] arrayOfHabitat;
  /**
   * Atribut karakter simbol hewan yang ditampilkan pada virtual zoo.
   */
  protected char content;
  /**
   * Atribut integer ID cage lokasi hewan tinggal.
   */
  protected int cageId;
  /**
   * Atribut berat badan hewan.
   */
  protected float myWeight;
  /**
   * Atribut seberapa banyak hewan dapat makan.
   */
  protected float howMuchIEat;
  /**
   * Atribut karakter makanan hewan. Disimbolkan dengan
   * <ul>
   *     <li>c = Carnivore</li>
   *     <li>h = Herbivore</li>
   *     <li>o = Omnivore</li>
   * </ul>
   */
  protected char whatIEat;

  /**
   * Konstruktor Animal dengan parameter.
   * @param absisin lokasi baris dari hewan
   * @param ordinatin lokasi kolom dari hewan
   * @param id ID Cage penempatan hewan
   */
  public Animal(int absisin, int ordinatin, int id) {
    absis = absisin;
    ordinat = ordinatin;
    cageId = id;
  }

  /**
   * Getter interaksi Animal.
   * @return String interaksi Animal
   */
  public abstract String getInteract();

  /**
   * Getter size hewan.
   * @return integer size Animal atau jumlah alam tempat hidup Animal
   */
  public abstract int getSize();

  /**
   * Getter isTame.
   * @return boolean nilai kebenaran kejinakkan Animal
   */
  public boolean getTame() {
    return isTame;
  }

  /**
   * Getter absis.
   * @return integer atribut absis Animal
   */
  public int getX() {
    return absis;
  }

  /**
   * Getter ordinat.
   * @return integer atribut ordinat Animal
   */
  public int getY() {
    return ordinat;
  }

  /**
   * Getter alam tempat hidup Animal.
   * @return array yang berisi seluruh simbol Habitat yang bisa menjadi tempat hidup Animal
   */
  public char[] getArrayOfHabitat() {
    return arrayOfHabitat;
  }

  /**
   * Getter content Animal.
   * @return karakter simbol yang merepresentasikan Animal di Zoo
   */
  public char getContent() {
    return content;
  }

  /**
   * Prosedur memberi makan, menuliskan seberapa banyak hewan makan
   * ke layar console.
   */
  public void giveFood() {
    System.out.println("Animal makanan sebanyak" + howMuchIEat + " kg\n");
  }

  /**
   * Prosedur move untuk menggerakan hewan pada Zoo. Berikut adalah
   * response method pada parameter yang diberikan:
   * <ol>
   *     <li>Atas</li>
   *     <li>Kanan</li>
   *     <li>Bawah</li>
   *     <li>Kiri</li>
   * </ol>
   * @param dir integer input untuk menentukan arah move yang dipilih
   */
  public void move(int dir) {
    switch (dir) {
      case 1: { //top
        ordinat -= 1;
        break;
      }
      case 2: { //right
        absis += 1;
        break;
      }
      case 3:  { //down
        ordinat += 1;
        break;
      }
      case 4: { //left
        absis -= 1;
        break;
      }
      default: {
        break;
      }
    }
  }
}

