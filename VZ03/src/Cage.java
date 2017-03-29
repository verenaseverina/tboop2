/**
 * Created by Kebun Binatang Bandung on 3/26/17.
 */
import animal.Animal;
import animal.turunananimal.binatang.Anoa;
import animal.turunananimal.binatang.Cormorants;
import animal.turunananimal.binatang.Crocodile;
import animal.turunananimal.binatang.Dolphin;
import animal.turunananimal.binatang.ElangB;
import animal.turunananimal.binatang.FlyingFish;
import animal.turunananimal.binatang.Hippopotamus;
import animal.turunananimal.binatang.Kangaroo;
import animal.turunananimal.binatang.Kasuari;
import animal.turunananimal.binatang.Kelelawar;
import animal.turunananimal.binatang.Kiwi;
import animal.turunananimal.binatang.Ostrich;
import animal.turunananimal.binatang.Panda;
import animal.turunananimal.binatang.Pelikan;
import animal.turunananimal.binatang.Penguin;
import animal.turunananimal.binatang.Rhino;
import animal.turunananimal.binatang.Shark;
import animal.turunananimal.binatang.Tiger;
import animal.turunananimal.binatang.Toucan;
import animal.turunananimal.binatang.Whale;
import cell.turunancell.Habitat;
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
  private Habitat[] arrayOfHabitat;
  /**
   * Atribut array of Animal dari Cage.
   */
  private Animal[] arrayOfAnimal;
  /** .
   * Atribut ukuran cage atau banyaknya Cell Habitat.
   */
  private int cageSize;
  /** .
   * Atribut banyaknya Animal didalam Cage.
   */
  private int animalNeff;

  /**
   * Menciptakan cage dari kumpulan Habitat dalam bentuk Vector.
   *
   * @param buf Vector habitat yang ada didalam cage
   */
  public Cage(Vector<Habitat> buf) {
    cageSize = buf.size();
    arrayOfHabitat = new Habitat[buf.size()];
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
  public Habitat[] getHabitat() {
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
        arrayOfAnimal[animalNeff] = new Tiger(xrow, ycol, iidx);
        break;
      }
      case 'B' : {
        arrayOfAnimal[animalNeff] = new Panda(xrow, ycol, iidx);
        break;
      }
      case 'A' : {
        arrayOfAnimal[animalNeff] = new Anoa(xrow, ycol, iidx);
        break;
      }
      case 'R' : {
        arrayOfAnimal[animalNeff] = new Rhino(xrow, ycol, iidx);
        break;
      }
      case 'D' : {
        arrayOfAnimal[animalNeff] = new Kangaroo(xrow, ycol, iidx);
        break;
      }
      case 'L' : {
        arrayOfAnimal[animalNeff] = new Dolphin(xrow, ycol, iidx);
        break;
      }
      case 'W' : {
        arrayOfAnimal[animalNeff] = new Whale(xrow, ycol, iidx);
        break;
      }
      case 'S' : {
        arrayOfAnimal[animalNeff] = new Shark(xrow, ycol, iidx);
        break;
      }
      case 'K' : {
        arrayOfAnimal[animalNeff] = new Kelelawar(xrow, ycol, iidx);
        break;
      }
      case 'E' : {
        arrayOfAnimal[animalNeff] = new ElangB(xrow, ycol, iidx);
        break;
      }
      case 'T' : {
        arrayOfAnimal[animalNeff] = new Toucan(xrow, ycol, iidx);
        break;
      }
      case 'P' : {
        arrayOfAnimal[animalNeff] = new Penguin(xrow, ycol, iidx);
        break;
      }
      case 'C' : {
        arrayOfAnimal[animalNeff] = new Crocodile(xrow, ycol, iidx);
        break;
      }
      case 'N' : {
        arrayOfAnimal[animalNeff] = new Hippopotamus(xrow, ycol, iidx);
        break;
      }
      case 'O' : {
        arrayOfAnimal[animalNeff] = new Ostrich(xrow, ycol, iidx);
        break;
      }
      case 'Y' : {
        arrayOfAnimal[animalNeff] = new Kasuari(xrow, ycol, iidx);
        break;
      }
      case 'I' : {
        arrayOfAnimal[animalNeff] = new Kiwi(xrow, ycol, iidx);
        break;
      }
      case 'F' : {
        arrayOfAnimal[animalNeff] = new FlyingFish(xrow, ycol, iidx);
        break;
      }
      case 'Z' : {
        arrayOfAnimal[animalNeff] = new Pelikan(xrow, ycol, iidx);
        break;
      }
      case 'M' : {
        arrayOfAnimal[animalNeff] = new Cormorants(xrow, ycol, iidx);
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
          if (!containAnimal(arrayOfAnimal[iidx].getX(), ycol)
                  && insideCage(arrayOfAnimal[iidx].getX(), ycol)) {
            System.out.println(jidx);
            arrayOfAnimal[iidx].move(1);
            found = true;
          }
          jidx = jidx + 1;
        } else if (jidx == 2) {
          xrow = arrayOfAnimal[iidx].getX() + 1;
          System.out.println(jidx);
          if (!containAnimal(xrow, arrayOfAnimal[iidx].getY())
                  && insideCage(xrow, arrayOfAnimal[iidx].getY())) {
            arrayOfAnimal[iidx].move(2);
            found = true;
          }
          jidx = jidx + 1;
        } else if (jidx == 3) {
          ycol = arrayOfAnimal[iidx].getY() + 1;
          if (!containAnimal(arrayOfAnimal[iidx].getX(), ycol)
                  && insideCage(arrayOfAnimal[iidx].getX(), ycol)) {
            arrayOfAnimal[iidx].move(3);
            found = true;
          }
          jidx = jidx + 1;
        } else if (jidx == 4) {
          xrow = arrayOfAnimal[iidx].getX() - 1;
          if (!containAnimal(xrow, arrayOfAnimal[iidx].getY())
                  && insideCage(xrow, arrayOfAnimal[iidx].getY())) {
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