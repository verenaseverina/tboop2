package State;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Logger;

public class State {
  private char[][] map;
  private int width;
  private int height;
  
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
      height=0;
      while(stringBufferMap.charAt(i) != ' ') {
        sHeight=Character.getNumericValue(stringBufferMap.charAt(iIdx));
        height = (10 * height) + sHeight;
        iIdx++;
      }
      iIdx = iIdx + 3;

      int sWidth;
      width=0;
      while(stringBufferMap.charAt(iIdx) <= '9' && stringBufferMap.charAt(iIdx) >= '0') {
        sWidth=Character.getNumericValue(stringBufferMap.charAt(iIdx));
        width = (10 * width) + sWidth;
        iIdx++;
      }

      int kIdx = 0, lIdx = 0;
      map = new char [height][width];
      //char[] temp_string_char = stringBufferMap.toCharArray();
      int length = stringBufferMap.length();
      while (iIdx < length) {
        if (lIdx < width) {
          map[kIdx][lIdx] = stringBufferMap.charAt(iIdx);
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
  
  private void makeDefaultMap() {
    map = new char [8][8];
    width = 8;
    height = 8;    
    
    for (int iIdx = 0; iIdx < 8 ; iIdx++) {
      for (int jIdx = 0; jIdx < 8; jIdx++) {
        switch (iIdx) {
          case 0 : {
            if (j < 2) {
              map[iIdx][jIdx] = '~';
            } 
            else if (j < 3) {
              map[iIdx][jIdx] = '#';
            }
            else if (j < 6) {
              map[iIdx][jIdx] = '~';
            }
            else if (j < 8) {
              map[iIdx][jIdx] = '#';
            }
            break;
          }
          case 1 : {
            if (j < 2) {
              map[iIdx][jIdx] = '`';
            }
            else if (j < 3) {
              map[iIdx][jIdx] = '#';
            }
            else if (j < 8) {
              map[iIdx][jIdx] = '~';
            }
            break;
          }
          case 2 : {
            if (j < 3) {
              map[iIdx][jIdx] = '_';
            }
            else if (j < 4) {
              map[iIdx][jIdx] = '~';
            }
            else if (j < 5) {
              map[iIdx][jIdx] = '#';
            }
            else if (j < 8) {
              map[iIdx][jIdx] = '~';
            }
            break;
          }
          case 3 : {
            if (j < 1) {
              map[iIdx][jIdx] = '^';
            }
            else if (j < 3) {
              map[iIdx][jIdx] = '_';
            }
            else if (j < 4) {
              map[iIdx][jIdx] = '#';
            }
            else if (j < 8) {
              map[iIdx][jIdx] = '_';
            }
            break;
          }
          case 4 : {
            if (j < 1) {
              map[iIdx][jIdx] = '^';
            }
            else if (j < 3) {
              map[iIdx][jIdx] = '_';
            }
            else if (j < 4) {
              map[iIdx][jIdx] = '^';
            }
            else if (j < 6) {
              map[iIdx][jIdx] = '_';
            }
            else if (j < 8) {
              map[iIdx][jIdx] = '#';
            }
            break;
          }
          case 5 : {
            if (j < 1) {
              map[iIdx][jIdx] = '^';
            }
            else if (j < 5) {
              map[iIdx][jIdx] = '_';
            }
            else if (j < 8) {
              map[iIdx][jIdx] = '#';
            }
            break;
          }
          case 6 : {
            if (j < 5) {
              map[iIdx][jIdx] = 'R';
            }
            else if (i < 8) {
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
  
  public char[][] getMap() {
    return map;
  }


  public int getHeight() {
    return height;
  }


  public int getWidth() {
    return width;
  }
}
