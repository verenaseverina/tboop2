
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nim_13515091
 */
public class State {
  private char[][] map;
  private int width;
  private int height;
  
  /*
  public static void main(String[] args){
    
  }
 */
  public State() throws FileNotFoundException, IOException {
    BufferedReader buffer_map;
    buffer_map = new BufferedReader(new FileReader("src/map.txt"));
    try {
      StringBuilder string_builder_map = new StringBuilder();
      String line = buffer_map.readLine();
     
      while (line != null) {
        string_builder_map.append(line);
        string_builder_map.append(System.lineSeparator());
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
      i=i+2;
      
      int s_width;
      width=0;
      while(string_buffer_map.charAt(i) != '\n') {
        s_width=Character.getNumericValue(string_buffer_map.charAt(i));
        width = (10 * width) + s_width;
        i++;
      }
      
      int k = 0, l = 0;
      map = new char [height][width];
      while (string_buffer_map.charAt(i) != '\0') {
        if (string_buffer_map.charAt(i) !='\n') {
          map[k][l] = string_buffer_map.charAt(i);
          l++;
        }
        else {
          k++;
        }
      }   
    } finally {
        buffer_map.close();
    }
  }
  
  private void MakeDefaultMap() {
    map = new char [8][8];
    
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
          }
          case 6 : {
            if (j < 5) {
              map[i][j] = 'R';
            }
            else if (i < 8) {
              map[i][j] = '#';
            }
          }
          case 7 : {
            map[i][j] = '_';
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
