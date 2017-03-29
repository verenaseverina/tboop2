import java.lang.Math;
import java.util.Vector;

/**
 * Kelas yang merepresentasikan sebuah kandang pada Zoo.
 * Kelas Cage memiliki kumpulan habitat yang ada pada cage tersebut beserta
 * jumlahnya, selain itu kelas juga menyimpan kumpulan hewan yang ada di
 * dalam kandang beserta jumlah dari hewan yang ada di dalam Cage.
 *
 * @author Adrian Hartarto
 * @author Verena Severina
 */
public class Cage {
  /**
   * Atribut array of Habitat dari Cage.
   */
  private Cell[] arrayOfHabitat;
  /**
   * Atribut array of Animal dari Cage.
   */
  private Animal[] arrayOfAnimal;
  /**
   * Atribut ukuran cage atau banyaknya Cell Habitat.
   */
  private int cageSize;
  /**
   * Atribut banyaknya Animal didalam Cage.
   */
  private int animalNeff;

  /**
   * Menciptakan cage dari kumpulan Habitat dalam bentuk Vector.
   *
   * @param buf Vector habitat yang ada didalam cage
   */
  public Cage(Vector<Cell> buf) {
    cageSize = buf.size();
    arrayOfHabitat = new Cell[buf.size()];
    for (int iidx = 0; iidx < cageSize; iidx++) {
      arrayOfHabitat[iidx] = buf.elementAt(iidx);
    }
    animalNeff = -1;
    double tempManyAnimal = 0.3 * cageSize;
    int manyAnimal = (int) Math.floor(tempManyAnimal);
    arrayOfAnimal = new Animal[manyAnimal];
  }

  /**
   * Getter cageSize.
   * @return Integer banyaknya Habitat dalam Cage
   */
  public int getCageSize() {
    return cageSize;
  }

  /**
   * Getter arrayOfAnimal.
   * @return Array of Animal seluruh hewan dalam Cage
   */
  public Animal[] getAnimal() {
    return arrayOfAnimal;
  }

  /**
   * Getter arrayOfHabitat.
   * @return Array of Habitat seluruh habitat dalam Cage
   */
  public Cell[] getHabitat() {
    return arrayOfHabitat;
  }

  /**
   * Getter animalNeff.
   * @return Integer jumlah hewan dalam Cage
   */
  public int getNeff() {
    return animalNeff;
  }

  /**
   * Memasukkan suatu hewan dalam kadang tertentu.
   *
   * @param animal Hewan yang akan dimasukkan dalam Cage, direpresentasiakan
   *               dengan kode satu karakter.
   * @param iidx ID Cage tempat hewan akan ditempatkan
   */
  public void addAnimal(char animal, int iidx) {
    int positionIndex = 0;
    int xrow;
    int ycol;
    do {
      positionIndex = (int) Math.floor(Math.random() * cageSize);
      xrow = arrayOfHabitat[positionIndex].getCellRow();
      ycol = arrayOfHabitat[positionIndex].getCellCol();
    } while (containAnimal(xrow, ycol));
    animalNeff++;
    switch (animal) {
      case 'H' : {
        arrayOfAnimal[animalNeff] = new Animal(xrow, ycol, iidx,'H');
        break;
      }
      case 'B' : {
        arrayOfAnimal[animalNeff] = new Animal(xrow, ycol, iidx,'B');
        break;
      }
      case 'A' : {
        arrayOfAnimal[animalNeff] = new Animal(xrow, ycol, iidx,'A');
        break;
      }
      case 'R' : {
        arrayOfAnimal[animalNeff] = new Animal(xrow, ycol, iidx,'R');
        break;
      }
      case 'D' : {
        arrayOfAnimal[animalNeff] = new Animal(xrow, ycol, iidx,'D');
        break;
      }
      case 'L' : {
        arrayOfAnimal[animalNeff] = new Animal(xrow, ycol, iidx,'L');
        break;
      }
      case 'W' : {
        arrayOfAnimal[animalNeff] = new Animal(xrow, ycol, iidx,'W');
        break;
      }
      case 'S' : {
        arrayOfAnimal[animalNeff] = new Animal(xrow, ycol, iidx,'S');
        break;
      }
      case 'K' : {
        arrayOfAnimal[animalNeff] = new Animal(xrow, ycol, iidx,'K');
        break;
      }
      case 'E' : {
        arrayOfAnimal[animalNeff] = new Animal(xrow, ycol, iidx,'E');
        break;
      }
      case 'T' : {
        arrayOfAnimal[animalNeff] = new Animal(xrow, ycol, iidx,'T');
        break;
      }
      case 'P' : {
        arrayOfAnimal[animalNeff] = new Animal(xrow, ycol, iidx,'P');
        break;
      }
      case 'C' : {
        arrayOfAnimal[animalNeff] = new Animal(xrow, ycol, iidx,'C');
        break;
      }
      case 'N' : {
        arrayOfAnimal[animalNeff] = new Animal(xrow, ycol, iidx,'N');
        break;
      }
      case 'O' : {
        arrayOfAnimal[animalNeff] = new Animal(xrow, ycol, iidx,'O');
        break;
      }
      case 'Y' : {
        arrayOfAnimal[animalNeff] = new Animal(xrow, ycol, iidx,'Y');
        break;
      }
      case 'I' : {
        arrayOfAnimal[animalNeff] = new Animal(xrow, ycol, iidx,'I');
        break;
      }
      case 'F' : {
        arrayOfAnimal[animalNeff] = new Animal(xrow, ycol, iidx,'F');
        break;
      }
      case 'Z' : {
        arrayOfAnimal[animalNeff] = new Animal(xrow, ycol, iidx,'Z');
        break;
      }
      case 'M' : {
        arrayOfAnimal[animalNeff] = new Animal(xrow, ycol, iidx,'M');
        break;
      }
      default : {
        break;
      }
    }
  }

  /**
   * Menentukan apakah suatu posisi xrow, ycol dalam peta sedang diisi oleh Animal.
   * @param xrow baris yang ditinjau
   * @param ycol kolom yang ditinjau
   * @return boolean kebenaran suaut peta xrow, ycol sedang diisi Animal
   */
  public boolean containAnimal(int xrow, int ycol) {
    boolean found = false;
    int iidx = 0;
    double tempManyAnimal = 0.3 * cageSize;
    int manyAnimal = (int) Math.floor(tempManyAnimal);
    if (!isEmpty()) {
      while ((iidx < manyAnimal) && (!found) && (iidx < animalNeff + 1)) {
        if ((xrow == arrayOfAnimal[iidx].getX()) && (ycol == arrayOfAnimal[iidx].getY())) {
          found = true;
        } else {
          iidx++;
        }
      }
    }
    return found;
  }

  /**
   * Memeriksa apakah suatu lokasi pada peta termasuk dalam Cage.
   *
   * @param xrow baris Cell yang ditinjau
   * @param ycol kolom Cell yang ditinjau
   * @return Boolean kebenaran suatu Cell dengan indeks xrow, ycol berada didalam kandang
   */
  public boolean insideCage(int xrow, int ycol) {
    int iidx = 0;
    boolean found = false;
    while (!found && iidx < cageSize) {
      if (xrow == arrayOfHabitat[iidx].getCellRow() && ycol == arrayOfHabitat[iidx].getCellCol()) {
        found = true;
      } else {
        iidx++;
      }
    }
    return found;
  }

  /**
   * Memberikan posisi baru dari suatu Animal. Membuat posisi Animal
   * terus berubah pada iterasi Tour Zoo. Algoritma pergerakan Animal
   * diimplementasi secara brute-force dengan urutan:
   * <ol>
   *     <li>Memanggil method Animal move(1).</li>
   *     <li>Memanggil method Animal move(2).</li>
   *     <li>Memanggil method Animal move(3).</li>
   *     <li>Memanggil method Animal move(4).</li>
   * </ol>
   */
  public void updatePosition() {
    for (int iidx = 0; iidx <= animalNeff; iidx++) {
      boolean found = false;
      int jidx = 1;
      int xrow;
      int ycol;
      while (!found) {
        if (jidx == 1) {
          ycol = arrayOfAnimal[iidx].getY() - 1;
          int tempX = arrayOfAnimal[iidx].getX();
          if (!containAnimal(tempX, ycol) && insideCage(tempX, ycol)) {
            System.out.println(jidx);
            arrayOfAnimal[iidx].move(1);
            found = true;
          }
          jidx = jidx + 1;
        } else if (jidx == 2) {
          xrow = arrayOfAnimal[iidx].getX() + 1;
          System.out.println(jidx);
          int tempY = arrayOfAnimal[iidx].getY();
          if (!containAnimal(xrow, tempY) && insideCage(xrow, tempY)) {
            arrayOfAnimal[iidx].move(2);
            found = true;
          }
          jidx = jidx + 1;
        } else if (jidx == 3) {
          ycol = arrayOfAnimal[iidx].getY() + 1;
          int tempX = arrayOfAnimal[iidx].getX();
          if (!containAnimal(tempX, ycol) && insideCage(tempX, ycol)) {
            arrayOfAnimal[iidx].move(3);
            found = true;
          }
          jidx = jidx + 1;
        } else if (jidx == 4) {
          xrow = arrayOfAnimal[iidx].getX() - 1;
          int tempY = arrayOfAnimal[iidx].getY();
          if (!containAnimal(xrow, tempY) && insideCage(xrow, tempY)) {
            arrayOfAnimal[iidx].move(4);
            found = true;
          }
          jidx = jidx + 1;
        } else {
          found = true;
          System.out.println(jidx);
        }
      }
    }
  }

  /**
   * Peninjauan apakah suatu Cage tidak memiliki Animal.
   * @return boolean apakah suatu Cage tidak memiliki binatang
   */
  public boolean isEmpty() {
    return (animalNeff == -1);
  }

  /**
   * Peninjauan apakah suatu Cage sudah penuh dan tidak bisa diisi Animal lagi.
   * @return boolean kebenaran apakah suatu Cage telah penuh
   */
  public boolean isFull() {
    double tempManyAnimal = 0.3 * cageSize;
    int manyAnimal = (int) Math.floor(tempManyAnimal);
    return (manyAnimal == animalNeff + 1);
  }
}