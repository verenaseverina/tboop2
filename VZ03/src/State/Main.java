/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author nim_13515091
 */
public class Main {
  public static void main(String[] args) throws FileNotFoundException {     
      State S = new State();
      
      for (int q = 0; q < S.GetHeight(); q++) {
        for (int w = 0; w < S.GetWidth(); w++) {
          System.out.print(S.GetMap()[q][w]);
        }
        System.out.println();
      }
      
      System.out.println(S.GetHeight());
      System.out.println(S.GetWidth());
      System.out.println('s');
      
  }
}
