/**
 * Created by Kebun Binatang Bandung on 3/26/17.
 */

package state;

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

      int iidx = 0;
      int sheight;
      height = 0;
      while (stringBufferMap.charAt(iidx) != ' ') {
        sheight = Character.getNumericValue(stringBufferMap.charAt(iidx));
        height = (10 * height) + sheight;
        iidx++;
      }
      iidx = iidx + 3;

      int swidth;
      width = 0;
      while (stringBufferMap.charAt(iidx) <= '9' && stringBufferMap.charAt(iidx) >= '0') {
        swidth = Character.getNumericValue(stringBufferMap.charAt(iidx));
        width = (10 * width) + swidth;
        iidx++;
      }

      int kidx = 0;
      int lidx = 0;
      map = new char [height][width];
      //char[] temp_string_char = stringBufferMap.toCharArray();
      int length = stringBufferMap.length();
      while (iidx < length) {
        if (lidx < width) {
          map[kidx][lidx] = stringBufferMap.charAt(iidx);
          lidx++;
          iidx++;
        } else {
          kidx++;
          lidx = 0;
        }
      }
      bufferMap.close();
    } catch (Exception ex) {
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

    for (int iidx = 0; iidx < 8 ; iidx++) {
      for (int jidx = 0; jidx < 8; jidx++) {
        switch (iidx) {
          case 0 : {
            if (jidx < 2) {
              map[iidx][jidx] = '~';
            } else if (jidx < 3) {
              map[iidx][jidx] = '#';
            } else if (jidx < 6) {
              map[iidx][jidx] = '~';
            } else if (jidx < 8) {
              map[iidx][jidx] = '#';
            }
            break;
          }
          case 1 : {
            if (jidx < 2) {
              map[iidx][jidx] = '`';
            } else if (jidx < 3) {
              map[iidx][jidx] = '#';
            } else if (jidx < 8) {
              map[iidx][jidx] = '~';
            }
            break;
          }
          case 2 : {
            if (jidx < 3) {
              map[iidx][jidx] = '_';
            } else if (jidx < 4) {
              map[iidx][jidx] = '~';
            } else if (jidx < 5) {
              map[iidx][jidx] = '#';
            } else if (jidx < 8) {
              map[iidx][jidx] = '~';
            }
            break;
          }
          case 3 : {
            if (jidx < 1) {
              map[iidx][jidx] = '^';
            } else if (jidx < 3) {
              map[iidx][jidx] = '_';
            } else if (jidx < 4) {
              map[iidx][jidx] = '#';
            } else if (jidx < 8) {
              map[iidx][jidx] = '_';
            }
            break;
          }
          case 4 : {
            if (jidx < 1) {
              map[iidx][jidx] = '^';
            } else if (jidx < 3) {
              map[iidx][jidx] = '_';
            } else if (jidx < 4) {
              map[iidx][jidx] = '^';
            } else if (jidx < 6) {
              map[iidx][jidx] = '_';
            } else if (jidx < 8) {
              map[iidx][jidx] = '#';
            }
            break;
          }
          case 5 : {
            if (jidx < 1) {
              map[iidx][jidx] = '^';
            } else if (jidx < 5) {
              map[iidx][jidx] = '_';
            } else if (jidx < 8) {
              map[iidx][jidx] = '#';
            }
            break;
          }
          case 6 : {
            if (jidx < 5) {
              map[iidx][jidx] = 'R';
            } else if (jidx < 8) {
              map[iidx][jidx] = '#';
            }
            break;
          }
          case 7 : {
            map[iidx][jidx] = '_';
            break;
          }
          default : {
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
