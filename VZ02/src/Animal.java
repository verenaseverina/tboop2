public class Animal {
  private String interaction;
  private char content;
  private int positionX;
  private int positionY;
  private int cageID;
  private float myWeight;
  private float howMuchIEat;
  private char whatIEat;
  private boolean isTame;
  private char[] arrayOfHabitat;
  private int sizeOfHabitat;
  private String type;

  public Animal(int posX, int posY, int id,char con) {
    positionX = posX;
    positionY = posY;
    cageID = id;
    content = con;

    switch(content) {
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
    }
  }

  public String GetInteract() {
    return interaction;
  }

  public int GetSizeOfHabitat() {
    return sizeOfHabitat;
  }

  public char GetContent() {
    return content;
  }

  public float GetWeight() {
    return myWeight;
  }

  public float GetEat() {
    return howMuchIEat;
  }

  public int GetID() {
    return cageID;
  }

  public int GetWEat() {
    return whatIEat;
  }

  public int GetX() {
    return positionX;
  }

  public int GetY() {
    return positionY;
  }

  public boolean GetTame() {
    return isTame;
  }

  public char[] GetArrayOfHabitat() {
    return arrayOfHabitat;
  }

  public int GetSize() {
    return sizeOfHabitat;
  }

  public void Move(int dir) {
    switch(dir) {
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
    }
  }
  public void GiveFood() {
    System.out.println("Animal makan sebanyak" + howMuchIEat + " kg\n");
  }
}
