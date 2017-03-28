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

      int i = 0;
      int sHeight;
      height=0;
      while(stringBufferMap.charAt(i) != ' ') {
        sHeight=Character.getNumericValue(stringBufferMap.charAt(i));
        height = (10 * height) + sHeight;
        i++;
      }
      i=i+3;

      int sWidth;
      width=0;
      while(stringBufferMap.charAt(i) <= '9' && stringBufferMap.charAt(i) >= '0') {
        sWidth=Character.getNumericValue(stringBufferMap.charAt(i));
        width = (10 * width) + sWidth;
        i++;
      }

      int k = 0, l = 0;
      map = new char [height][width];
      //char[] temp_string_char = stringBufferMap.toCharArray();
      int length = stringBufferMap.length();
      while (i < length) {
        if (l < width) {
          map[k][l] = stringBufferMap.charAt(i);
          l++;
          i++;
        }
        else {
          k++;
          l=0;
        }
      }
      bufferMap.close();
    } catch(Exception E) {
      MakeDefaultMap();
    }
  }
  
  private void MakeDefaultMap() {
    map = new char [8][8];
    width = 8;
    height = 8;    
    
    for (int i = 0; i < 8 ; i++) {
      for (int j = 0; j < 8; j++) {
        switch (i) {
          case 0 : {
            if (j < 2) {
              map[i][j] = '~';
            } 
            else if (j < 3) {
              map[i][j] = '#';
            }
            else if (j < 6) {
              map[i][j] = '~';
            }
            else if (j < 8) {
              map[i][j] = '#';
            }
            break;
          }
          case 1 : {
            if (j < 2) {
              map[i][j] = '`';
            }
            else if (j < 3) {
              map[i][j] = '#';
            }
            else if (j < 8) {
              map[i][j] = '~';
            }
            break;
          }
          case 2 : {
            if (j < 3) {
              map[i][j] = '_';
            }
            else if (j < 4) {
              map[i][j] = '~';
            }
            else if (j < 5) {
              map[i][j] = '#';
            }
            else if (j < 8) {
              map[i][j] = '~';
            }
            break;
          }
          case 3 : {
            if (j < 1) {
              map[i][j] = '^';
            }
            else if (j < 3) {
              map[i][j] = '_';
            }
            else if (j < 4) {
              map[i][j] = '#';
            }
            else if (j < 8) {
              map[i][j] = '_';
            }
            break;
          }
          case 4 : {
            if (j < 1) {
              map[i][j] = '^';
            }
            else if (j < 3) {
              map[i][j] = '_';
            }
            else if (j < 4) {
              map[i][j] = '^';
            }
            else if (j < 6) {
              map[i][j] = '_';
            }
            else if (j < 8) {
              map[i][j] = '#';
            }
            break;
          }
          case 5 : {
            if (j < 1) {
              map[i][j] = '^';
            }
            else if (j < 5) {
              map[i][j] = '_';
            }
            else if (j < 8) {
              map[i][j] = '#';
            }
            break;
          }
          case 6 : {
            if (j < 5) {
              map[i][j] = 'R';
            }
            else if (i < 8) {
              map[i][j] = '#';
            }
            break;
          }
          case 7 : {
            map[i][j] = '_';
            break;
          }
        }
      }
    }
  }
  
  public char[][] GetMap() {
    return map;
  }


  public int GetHeight() {
    return height;
  }


  public int GetWidth() {
    return width;
  }
}
