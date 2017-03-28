/**
 * Created by verenaseverina on 3/25/17.
 */
import java.util.Vector;
import java.lang.Math;
import cell.turunancell.Habitat;
import animal.Animal;
import animal.turunananimal.binatang.*;

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
   * Atribut array of Habitat dari Cage
   */
  private Habitat[] arrayOfHabitat;
  /**
   * Atribut array of Animal dari Cage
   */
  private Animal[] arrayOfAnimal;
  /**
   * Atribut ukuran cage atau banyaknya Cell Habitat
   */
  private int cageSize;
  /**
   * Atribut banyaknya Animal didalam Cage
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
    for (int iIdx = 0; iIdx < cageSize; iIdx++) {
      arrayOfHabitat[iIdx] = buf.elementAt(iIdx);
    }
    animalNeff = -1;
    double tempManyAnimal = 0.3 * cageSize;
    int manyAnimal = (int) Math.floor(tempManyAnimal);
    arrayOfAnimal = new Animal[manyAnimal];
  }

  /**
   * Getter cageSize
   * @return Integer banyaknya Habitat dalam Cage
   */
  public int getCageSize() {
    return cageSize;
  }

  /**
   * Getter arrayOfAnimal
   * @return Array of Animal seluruh hewan dalam Cage
   */
  public Animal[] getAnimal() {
    return arrayOfAnimal;
  }

  /**
   * Getter arrayOfHabitat
   * @return Array of Habitat seluruh habitat dalam Cage
   */
  public Habitat[] getHabitat() {
    return arrayOfHabitat;
  }

  /**
   * Getter animalNeff
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
   * @param iIdx ID Cage tempat hewan akan ditempatkan
   */
  public void AddAnimal(char animal, int iIdx) {
    int positionIndex = 0;
    int xRow, yCol;
    do {
      positionIndex = (int) Math.floor(Math.random() * cageSize);
      xRow = arrayOfHabitat[positionIndex].getCellRow();
      yCol = arrayOfHabitat[positionIndex].getCellCol();
    } while (containAnimal(xRow, yCol));
    animalNeff++;
    switch(animal) {
      case 'H' : {
        arrayOfAnimal[animalNeff] = new Tiger(xRow, yCol, iIdx);
        break;
      }
      case 'B' : {
        arrayOfAnimal[animalNeff] = new Panda(xRow, yCol, iIdx);
        break;
      }
      case 'A' : {
        arrayOfAnimal[animalNeff] = new Anoa(xRow, yCol, iIdx);
        break;
      }
      case 'R' : {
        arrayOfAnimal[animalNeff] = new Rhino(xRow, yCol, iIdx);
        break;
      }
      case 'D' : {
        arrayOfAnimal[animalNeff] = new Kangaroo(xRow, yCol, iIdx);
        break;
      }
      case 'L' : {
        arrayOfAnimal[animalNeff] = new Dolphin(xRow, yCol, iIdx);
        break;
      }
      case 'W' : {
        arrayOfAnimal[animalNeff] = new Whale(xRow, yCol, iIdx);
        break;
      }
      case 'S' : {
        arrayOfAnimal[animalNeff] = new Shark(xRow, yCol, iIdx);
        break;
      }
      case 'K' : {
        arrayOfAnimal[animalNeff] = new Kelelawar(xRow, yCol, iIdx);
        break;
      }
      case 'E' : {
        arrayOfAnimal[animalNeff] = new ElangB(xRow, yCol, iIdx);
        break;
      }
      case 'T' : {
        arrayOfAnimal[animalNeff] = new Toucan(xRow, yCol, iIdx);
        break;
      }
      case 'P' : {
        arrayOfAnimal[animalNeff] = new Penguin(xRow, yCol, iIdx);
        break;
      }
      case 'C' : {
        arrayOfAnimal[animalNeff] = new Crocodile(xRow, yCol, iIdx);
        break;
      }
      case 'N' : {
        arrayOfAnimal[animalNeff] = new Hippopotamus(xRow, yCol, iIdx);
        break;
      }
      case 'O' : {
        arrayOfAnimal[animalNeff] = new Ostrich(xRow, yCol, iIdx);
        break;
      }
      case 'Y' : {
        arrayOfAnimal[animalNeff] = new Kasuari(xRow, yCol, iIdx);
        break;
      }
      case 'I' : {
        arrayOfAnimal[animalNeff] = new Kiwi(xRow, yCol, iIdx);
        break;
      }
      case 'F' : {
        arrayOfAnimal[animalNeff] = new FlyingFish(xRow, yCol, iIdx);
        break;
      }
      case 'Z' : {
        arrayOfAnimal[animalNeff] = new Pelikan(xRow, yCol, iIdx);
        break;
      }
      case 'M' : {
        arrayOfAnimal[animalNeff] = new Cormorants(xRow, yCol, iIdx);
        break;
      }
    }
  }

  /**
   * Menentukan apakah suatu posisi xRow, yCol dalam peta sedang diisi oleh Animal
   * @param xRow baris yang ditinjau
   * @param yCol kolom yang ditinjau
   * @return boolean kebenaran suaut peta xRow, yCol sedang diisi Animal
   */
  public boolean containAnimal(int xRow, int yCol) {
    boolean found = false;
    int iIdx = 0;
    double tempManyAnimal = 0.3 * cageSize;
    int manyAnimal = (int) Math.floor(tempManyAnimal);
    if(!isEmpty()) {
      while ((iIdx < manyAnimal) && (!found) && (iIdx < animalNeff+1)) {
        if ((xRow == arrayOfAnimal[iIdx].getX()) && (yCol == arrayOfAnimal[iIdx].getY())) {
          found = true;
        }
      else {
          iIdx++;
        }
      }
    }
    return found;
  }

  /**
   * Memeriksa apakah suatu lokasi pada peta termasuk dalam Cage.
   *
   * @param xRow baris Cell yang ditinjau
   * @param yCol kolom Cell yang ditinjau
   * @return Boolean kebenaran suatu Cell dengan indeks xRow, yCol berada
   * didalam kandang
   */
  public boolean insideCage(int xRow, int yCol) {
    int iIdx = 0;
    boolean found = false;
    while(!found && iIdx < cageSize) {
      if(xRow == arrayOfHabitat[iIdx].getCellRow() && yCol == arrayOfHabitat[iIdx].getCellCol()) {
        found = true;
      }
      else {
        iIdx++;
      }
    }
    return found;
  }

  /**
   * Memberikan posisi baru dari suatu Animal. Membuat posisi Animal
   * terus berubah pada iterasi Tour Zoo. Algoritma pergerakan Animal
   * diimplementasi secara brute-force dengan urutan:
   * <ol>
   *     <li>Memanggil method Animal Move(1).</li>
   *     <li>Memanggil method Animal Move(2).</li>
   *     <li>Memanggil method Animal Move(3).</li>
   *     <li>Memanggil method Animal Move(4).</li>
   * </ol>
   */
  public void updatePosition() {
    for(int iIdx=0; iIdx<=animalNeff; iIdx++) {
      boolean found = false;
      int jIdx = 1;
      int xRow,yCol;
      while(!found) {
          if(jIdx == 1) {
            yCol = arrayOfAnimal[iIdx].getY() - 1;
            if (!containAnimal(arrayOfAnimal[iIdx].getX(), yCol) && insideCage(arrayOfAnimal[iIdx].getX(), yCol)) {
              System.out.println(jIdx);
              arrayOfAnimal[iIdx].Move(1);
              found = true;
            }
            jIdx = jIdx + 1;
          }else if(jIdx == 2) {
            xRow = arrayOfAnimal[iIdx].getX() + 1;
            System.out.println(jIdx);
            if (!containAnimal(xRow, arrayOfAnimal[iIdx].getY()) && insideCage(xRow, arrayOfAnimal[i].getY())) {
             arrayOfAnimal[iIdx].Move(2);
             found = true;
            }
            jIdx = jIdx+1;
          }
          else if(jIdx == 3) {
            yCol = arrayOfAnimal[iIdx].getY() + 1;
            if (!containAnimal(arrayOfAnimal[iIdx].getX(), yCol) && insideCage(arrayOfAnimal[iIdx].getX(), yCol)) {
             arrayOfAnimal[iIdx].Move(3);
             found = true;
            }
            jIdx = jIdx+1;
          }
          else if(jIdx == 4) {
            xRow = arrayOfAnimal[iIdx].getX() - 1;
            if (!containAnimal(xRow, arrayOfAnimal[iIdx].getY()) && insideCage(xRow, arrayOfAnimal[iIdx].getY())) {
             arrayOfAnimal[iIdx].Move(4);
             found = true;
            }
            jIdx = jIdx+1;
          }
          else {
            found = true;
            System.out.println(jIdx);
          }
        }
      }
  }

  /**
   * Peninjauan apakah suatu Cage tidak memiliki Animal
   * @return boolean apakah suatu Cage tidak memiliki binatang
   */
  public boolean isEmpty() {
    return (animalNeff == -1);
  }

  /**
   * Peninjauan apakah suatu Cage sudah penuh dan tidak bisa diisi Animal
   * lagi
   * @return boolean kebenaran apakah suatu Cage telah penuh
   */
  public boolean isFull() {
    double tempManyAnimal = 0.3 * cageSize;
    int manyAnimal = (int) Math.floor(tempManyAnimal);
    return (manyAnimal == animalNeff+1);
  }
}