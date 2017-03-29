/**
 * Created by Kebun Binatang Bandung on 3/26/17.
 */

/**
 * Kelas Animal adalah kelas untuk seluruh hewan di Zoo.
 */
public class Animal {
  private String interaction;
  private char content;
  private int positionX;
  private int positionY;
  private int cageId;
  private float myWeight;
  private float howMuchIEat;
  private char whatIEat;
  private boolean isTame;
  private char[] arrayOfHabitat;
  private int sizeOfHabitat;
  private String type;

  /**
   * Constructor Animal dengan parameter.
   * @param posX Kolom dari Animal
   * @param posY Baris dari Animal
   * @param id Cage ID penempatan Animal
   * @param con Content Animal
   */
  public Animal(int posX, int posY, int id,char con) {
    positionX = posX;
    positionY = posY;
    cageId = id;
    content = con;

    switch (content) {
      case 'H': {
        sizeOfHabitat = 1;
        arrayOfHabitat = new char[sizeOfHabitat];
        arrayOfHabitat[0] = '^';

        interaction = "Roooarrrr";
        myWeight = 90f + (float)(Math.random() * 220 + 1);
        howMuchIEat = 7.23f * myWeight / 100f;
        whatIEat = 'c';
        isTame = false;
        type = "LandAnimal";
        break;
      }
      case 'B': {
        sizeOfHabitat = 1;
        arrayOfHabitat = new char[sizeOfHabitat];
        arrayOfHabitat[0] = '`';

        interaction = "Mmmm";
        myWeight = 70f + (float) (Math.random() * 30 + 1);
        howMuchIEat = 38f * myWeight / 100f;
        whatIEat = 'h';
        isTame = true;
        type = "LandAnimal";
        break;
      }
      case 'A': {
        sizeOfHabitat = 1;
        arrayOfHabitat = new char[sizeOfHabitat];
        arrayOfHabitat[0] = '`';

        interaction = "Grrrr";
        myWeight = 150f + (float) (Math.random() * 150 + 1);
        howMuchIEat = 5f * myWeight / 100f;
        whatIEat = 'h';
        isTame = true;
        type = "LandAnimal";
        break;
      }
      case 'R': {
        sizeOfHabitat = 1;
        arrayOfHabitat = new char[sizeOfHabitat];
        arrayOfHabitat[0] = '^';

        interaction = "Woooo";
        myWeight = 900f + (float)(Math.random() * 1400f + 1);
        howMuchIEat = 7.23f * myWeight / 100f;
        whatIEat = 'h';
        isTame = false;
        type = "LandAnimal";
        break;
      }
      case 'D': {
        sizeOfHabitat = 1;
        arrayOfHabitat = new char[sizeOfHabitat];
        arrayOfHabitat[0] = '^';

        interaction = "*Jummpp*";
        myWeight = 18f + (float) (Math.random() * 72 + 1);
        howMuchIEat = 0.35f * myWeight / 100f;
        whatIEat = 'h';
        isTame = true;
        type = "LandAnimal";
        break;
      }
      case 'L': {
        sizeOfHabitat = 1;
        arrayOfHabitat = new char[sizeOfHabitat];
        arrayOfHabitat[0] = '~';

        interaction = "Cuitttt";
        myWeight = 110f + (float) (Math.random() * 90 + 1);
        howMuchIEat = 2f * myWeight / 20f;
        whatIEat = 'c';
        isTame = true;
        type = "WaterAnimal";
        break;
      }
      case 'W': {
        sizeOfHabitat = 1;
        arrayOfHabitat = new char[sizeOfHabitat];
        arrayOfHabitat[0] = '~';

        interaction = "*Wet*";
        myWeight = 14000f + (float)(Math.random() * 2000 + 1);
        howMuchIEat = 0.667f * myWeight;
        whatIEat = 'c';
        isTame = true;
        type = "WaterAnimal";
        break;
      }
      case 'S': {
        sizeOfHabitat = 1;
        arrayOfHabitat = new char[sizeOfHabitat];
        arrayOfHabitat[0] = '~';

        interaction = "*Wett*";
        myWeight = 21500f + (float)(Math.random() * 8500 + 1);
        howMuchIEat = 0.0667f * myWeight;
        whatIEat = 'c';
        isTame = false;
        type = "WaterAnimal";
        break;
      }
      case 'K': {
        sizeOfHabitat = 1;
        arrayOfHabitat = new char[sizeOfHabitat];
        arrayOfHabitat[0] = '`';

        interaction = "Kiiiaaa";
        myWeight = 1.2f + (float) (Math.random() * 0.2f + 1);
        howMuchIEat = myWeight;
        whatIEat = 'o';
        isTame = true;
        type = "AirAnimal";
        break;
      }
      case 'E': {
        sizeOfHabitat = 1;
        arrayOfHabitat = new char[sizeOfHabitat];
        arrayOfHabitat[0] = '`';

        interaction = "Kiiiaaa";
        myWeight = 4f + (float) (Math.random() * 2 + 1);
        howMuchIEat = 0.4535f * myWeight / 4f;
        whatIEat = 'c';
        isTame = true;
        type = "AirAnimal";
        break;
      }
      case 'T': {
        sizeOfHabitat = 1;
        arrayOfHabitat = new char[sizeOfHabitat];
        arrayOfHabitat[0] = '`';

        interaction = "Kwwaakk";
        myWeight = 0.592f + (float)(Math.random() * 0.168f + 1);
        howMuchIEat = 0.5f * myWeight / 100f;
        whatIEat = 'o';
        isTame = true;
        type = "AirAnimal";
        break;
      }
      case 'P': {
        sizeOfHabitat = 2;
        arrayOfHabitat = new char[sizeOfHabitat];
        arrayOfHabitat[0] = '~';
        arrayOfHabitat[1] = '^';

        interaction = "Sqqqaaa";
        myWeight = 27f + (float)(Math.random() * 14 + 1);
        howMuchIEat = 0.9f * myWeight / 27f;
        whatIEat = 'c';
        isTame = true;
        type = "LWAnimal";
        break;
      }
      case 'C': {
        sizeOfHabitat = 2;
        arrayOfHabitat = new char[sizeOfHabitat];
        arrayOfHabitat[0] = '^';
        arrayOfHabitat[1] = '~';

        interaction = "Rrrrr";
        myWeight = 400f + (float) (Math.random() * 300 + 1);
        howMuchIEat = 2f * myWeight / 700f;
        whatIEat = 'c';
        isTame = false;
        type = "LWAnimal";
        break;
      }
      case 'N': {
        sizeOfHabitat = 2;
        arrayOfHabitat = new char[sizeOfHabitat];
        arrayOfHabitat[0] = '^';
        arrayOfHabitat[1] = '~';

        interaction = "Grooowwll";
        myWeight = 1400f + (float) (Math.random() * 1800 + 1);
        howMuchIEat = 40f * myWeight / 2400f;
        whatIEat = 'h';
        isTame = true;
        type = "LWAnimal";
        break;
      }
      case 'M': {
        sizeOfHabitat = 2;
        arrayOfHabitat = new char[sizeOfHabitat];
        arrayOfHabitat[0] = '~';
        arrayOfHabitat[1] = '`';

        interaction = "*fly and swim*";
        myWeight = 2.5f + (float) (Math.random() * 2.5 + 1);
        howMuchIEat = 10f * myWeight / 100f;
        whatIEat = 'c';
        isTame = true;
        type = "WAAnimal";
        break;
      }
      case 'F': {
        sizeOfHabitat = 2;
        arrayOfHabitat = new char[sizeOfHabitat];
        arrayOfHabitat[0] = '~';
        arrayOfHabitat[1] = '`';

        interaction = "*stride*";
        myWeight = 1f + (float) (Math.random() * 6 + 1);
        howMuchIEat = 5f * myWeight / 100f;
        whatIEat = 'o';
        isTame = true;
        type = "WAAnimal";
        break;
      }
      case 'Y': {
        sizeOfHabitat = 2;
        arrayOfHabitat = new char[sizeOfHabitat];
        arrayOfHabitat[0] = '^';
        arrayOfHabitat[1] = '`';

        interaction = "Arrrrkkkk";
        myWeight = 25f + (float) (Math.random() * 34 + 1);
        howMuchIEat = 5f * myWeight / 100f;
        whatIEat = 'o';
        isTame = true;
        type = "LAAnimal";
        break;
      }
      case 'I': {
        sizeOfHabitat = 2;
        arrayOfHabitat = new char[sizeOfHabitat];
        arrayOfHabitat[0] = '^';
        arrayOfHabitat[1] = '`';

        interaction = "*walk and fly slightly*";
        myWeight = 1f + (float) (Math.random() * 2 + 1);
        howMuchIEat = 5f * myWeight / 100f;
        whatIEat = 'o';
        isTame = true;
        type = "LAAnimal";
        break;
      }
      case 'O': {
        sizeOfHabitat = 2;
        arrayOfHabitat = new char[sizeOfHabitat];
        arrayOfHabitat[0] = '^';
        arrayOfHabitat[1] = '`';

        interaction = "Nguuukkk";
        myWeight = 25f + (float) (Math.random() * 34 + 1);
        howMuchIEat = 5f * myWeight / 100f;
        whatIEat = 'o';
        isTame = true;
        type = "LAAnimal";
        break;
      }
      case 'Z': {
        sizeOfHabitat = 2;
        arrayOfHabitat = new char[sizeOfHabitat];
        arrayOfHabitat[0] = '~';
        arrayOfHabitat[1] = '`';

        interaction = "Aaaakk";
        myWeight = 2.8f + (float) (Math.random() * 12.2 + 1);
        howMuchIEat = 26.67f * myWeight / 100f;
        whatIEat = 'c';
        isTame = true;
        type = "WAAnimal";
        break;
      }
      default : {
        break;
      }
    }
  }

  /**
   * Getter Animal Interation.
   * @return String interaksi Animal
   */
  public String getInteract() {
    return interaction;
  }

  /**
   * Getter size habitat.
   * @return integer besar habitat Animal
   */
  public int getSizeOfHabitat() {
    return sizeOfHabitat;
  }

  /**
   * Getter content Animal.
   * @return karakter konten Animal
   */
  public char getContent() {
    return content;
  }

  /**
   * Getter massa Animal.
   * @return float massa Animal
   */
  public float getWeight() {
    return myWeight;
  }

  /**
   * Getter HowMuchIEat.
   * @return float jumlah hewan makan
   */
  public float getEat() {
    return howMuchIEat;
  }

  /**
   * Getter cage ID Animal.
   * @return integer ID Cage Animal
   */
  public int getId() {
    return cageId;
  }

  /**
   * Getter pengelompokan makanan hewan.
   * @return karakter makanan hewan
   */
  public char getWEat() {
    return whatIEat;
  }

  /**
   * Getter posisi X hewan.
   * @return integer positionX
   */
  public int getX() {
    return positionX;
  }

  /**
   * Getter posisi Y hewan.
   * @return integer positionY
   */
  public int getY() {
    return positionY;
  }

  /**
   * Getter kejinakkan hewan.
   * @return boolean apakah hewan jinak
   */
  public boolean getTame() {
    return isTame;
  }

  /**
   * Getter array of Habitat.
   * @return array of char Cage hewan
   */
  public char[] getArrayOfHabitat() {
    return arrayOfHabitat;
  }

  /**
   * Getter Size hewan.
   * @return array of char alam tempat hidup hewan
   */
  public int getSize() {
    return sizeOfHabitat;
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
        positionY -=  1;
        break;
      }
      case 2: { //right
        positionX +=  1;
        break;
      }
      case 3: { //down
        positionY +=  1;
        break;
      }
      case 4: { //left
        positionX -=  1;
        break;
      }
      default : {
        break;
      }
    }
  }

  /**
   * Interaksi memberikan makan kepada hewan. Menulis jumlah hewan makan ke layar.
   */
  public void giveFood() {
    System.out.println("Animal makan sebanyak" + howMuchIEat + " kg\n");
  }
}
