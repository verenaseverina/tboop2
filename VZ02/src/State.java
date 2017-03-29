/**
 * Created by Kebun Binatang Bandung on 3/26/17.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Logger;

/**
 * Kelas untuk memuat peta dari file eksternal atau default
 * apabila terjadi error.
 * @author Kukuh Basuki Rahmat
 * @author Adrian Hartarto
 */
public class State {
  /**
   * Atribut peta yang direpresentasikan sebagai matriks karakter.
   */
  private char[][] map;
  /**
   * Atribut integer width zoo.
   */
  private int width;
  /**
   * Atribut integer height zoo.
   */

  private int height;

  /**
   * Konstruktor State untuk membaca peta.
   * <p>
   * Apabila ditemukan file bernama {@code map.txt},
   * Pertama dilakukan parsing untuk membaca width dan height zoo.
   * Lalu file dibaca perbaris dan dimasukkan ke buffer.
   * Setelah itu value dari buffer dipindahkan ke map satu-persatu.
   * </p>
   * <p>
   * Apabila file tidak ditemukan, program menginisiasi default map
   * dengan prosedur makeDefaultMap()
   * </p>
   */
  public State() {
    //BufferedReader bufferMap;
    // bufferMap = new BufferedReader(new FileReader("src/map.txt"));
    try (BufferedReader bufferMap = new BufferedReader(new FileReader("VZ03/src/map.txt"))) {
      StringBuilder stringBuilderMap = new StringBuilder();
      String line = bufferMap.readLine();

      while (line != null) {
        stringBuilderMap.append(line);
        line = bufferMap.readLine();
      }
      String stringBufferMap;
      stringBufferMap = stringBuilderMap.toString();
      //System.out.printf(stringBufferMap);

      int iIdx = 0;
      int sHeight;
      height = 0;
      while(stringBufferMap.charAt(iIdx) != ' ') {
        sHeight = Character.getNumericValue(stringBufferMap.charAt(iIdx));
        height = (10 * height) + sHeight;
        iIdx++;
      }
      iIdx = iIdx+3;

      int sWidth;
      width = 0;
      while(stringBufferMap.charAt(iIdx) <= '9' && stringBufferMap.charAt(iIdx) >= '0') {
        sWidth = Character.getNumericValue(stringBufferMap.charAt(iIdx));
        width = (10 * width) + sWidth;
        iIdx++;
      }

      int kIdx = 0, lIdx = 0;
      map = new char [height][width];
      //char[] temp_string_char = stringBufferMap.toCharArray();
      int length = stringBufferMap.length();
      while (iIdx < length) {
        if (lIdx < width) {
          map[kIdx][lIdx] = stringBufferMap.charAt(i);
          lIdx++;
          iIdx++;
        }
        else {
          kIdx++;
          lIdx=0;
        }
      }
      bufferMap.close();
    } catch(Exception E) {
      makeDefaultMap();
    }
  }

  /**
   * Prosedur untuk membuat map default apabila file {@code map.txt}
   * tidak ditemukan.
   */
  private void makeDefaultMap() {
    map = new char [8][8];
    width = 8;
    height = 8;    
    
    for (int iIdx = 0; iIdx < 8 ; iIdx++) {
      for (int jIdx = 0; jIdx < 8; jIdx++) {
        switch (iIdx) {
          case 0 : {
            if (jIdx < 2) {
              map[iIdx][jIdx] = '~';
            } 
            else if (jIdx < 3) {
              map[iIdx][jIdx] = '#';
            }
            else if (jIdx < 6) {
              map[iIdx][jIdx] = '~';
            }
            else if (jIdx < 8) {
              map[iIdx][jIdx] = '#';
            }
            break;
          }
          case 1 : {
            if (jIdx < 2) {
              map[iIdx][jIdx] = '`';
            }
            else if (jIdx < 3) {
              map[iIdx][jIdx] = '#';
            }
            else if (jIdx < 8) {
              map[iIdx][jIdx] = '~';
            }
            break;
          }
          case 2 : {
            if (jIdx < 3) {
              map[iIdx][jIdx] = '_';
            }
            else if (jIdx < 4) {
              map[iIdx][jIdx] = '~';
            }
            else if (jIdx < 5) {
              map[iIdx][jIdx] = '#';
            }
            else if (jIdx < 8) {
              map[iIdx][jIdx] = '~';
            }
            break;
          }
          case 3 : {
            if (jIdx < 1) {
              map[iIdx][jIdx] = '^';
            }
            else if (jIdx < 3) {
              map[iIdx][jIdx] = '_';
            }
            else if (jIdx < 4) {
              map[iIdx][jIdx] = '#';
            }
            else if (jIdx < 8) {
              map[iIdx][jIdx] = '_';
            }
            break;
          }
          case 4 : {
            if (jIdx < 1) {
              map[iIdx][jIdx] = '^';
            }
            else if (jIdx < 3) {
              map[iIdx][jIdx] = '_';
            }
            else if (jIdx < 4) {
              map[iIdx][jIdx] = '^';
            }
            else if (jIdx < 6) {
              map[iIdx][jIdx] = '_';
            }
            else if (jIdx < 8) {
              map[iIdx][jIdx] = '#';
            }
            break;
          }
          case 5 : {
            if (jIdx < 1) {
              map[iIdx][jIdx] = '^';
            }
            else if (jIdx < 5) {
              map[iIdx][jIdx] = '_';
            }
            else if (jIdx < 8) {
              map[iIdx][jIdx] = '#';
            }
            break;
          }
          case 6 : {
            if (jIdx < 5) {
              map[iIdx][jIdx] = 'R';
            }
            else if (iIdx < 8) {
              map[iIdx][jIdx] = '#';
            }
            break;
          }
          case 7 : {
            map[iIdx][jIdx] = '_';
            break;
          }
        }
      }
    }
  }

  /**
   * Getter atribut map.
   * @return matriks char atribut map
   */
  public char[][] getMap() {
    return map;
  }

  /**
   * Getter atribut height.
   * @return integer atribut height
   */
  public int getHeight() {
    return height;
  }

  /**
   * Getter atribut width.
   * @return integer atribut width
   */
  public int getWidth() {
    return width;
  }
}
