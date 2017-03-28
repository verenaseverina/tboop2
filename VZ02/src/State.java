import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Logger;

public class State {
  private char[][] map;
  private int width;
  private int height;
  
  public State() {
    //BufferedReader buffer_map;
    // buffer_map = new BufferedReader(new FileReader("src/map.txt"));
    try (BufferedReader buffer_map = new BufferedReader(new FileReader("VZ03/src/map.txt"))) {
      StringBuilder string_builder_map = new StringBuilder();
      String line = buffer_map.readLine();

      while (line != null) {
        string_builder_map.append(line);
        line = buffer_map.readLine();
      }
      String string_buffer_map;
      string_buffer_map = string_builder_map.toString();
      //System.out.printf(string_buffer_map);

      int i = 0;
      int s_height;
      height=0;
      while(string_buffer_map.charAt(i) != ' ') {
        s_height=Character.getNumericValue(string_buffer_map.charAt(i));
        height = (10 * height) + s_height;
        i++;
      }
      i=i+3;

      int s_width;
      width=0;
      while(string_buffer_map.charAt(i) <= '9' && string_buffer_map.charAt(i) >= '0') {
        s_width=Character.getNumericValue(string_buffer_map.charAt(i));
        width = (10 * width) + s_width;
        i++;
      }

      int k = 0, l = 0;
      map = new char [height][width];
      //char[] temp_string_char = string_buffer_map.toCharArray();
      int length = string_buffer_map.length();
      while (i < length) {
        if (l < width) {
          map[k][l] = string_buffer_map.charAt(i);
          l++;
          i++;
        }
        else {
          k++;
          l=0;
        }
      }
      buffer_map.close();
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
