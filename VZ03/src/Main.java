import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
  public static void main(String[] args) throws IOException,InterruptedException {
      Zoo z = new Zoo();
      int input;
      Renderable r = new Renderable();
      Scanner T = new Scanner(System.in);
      boolean endloop = false;
      z.RandomEntrance();
      do {
          System.out.print("1.Tambahkan Animal\n2. Tour\n3. Exit\n");
          input = T.nextInt();
          switch (input) {
              case 1: {
                  r.Render(z);
                  z.PutInAnimal();
                  break;
              }
              case 2: {
                  z.RandomEntrance();
                  r.Render(z);
                  while(!z.Exit(z.GetPlayerPos())) {
                      sleep(500);
                      z.Tour();
                      for(int i= 0;i<z.GetCages().size();i++) {
                          z.GetCages().get(i).UpdatePosition();
                      }
                      r.Render(z);
                  }
                  break;
              }
              case 3: {
                  endloop = true;
                  break;
              }
          }
      } while(!endloop);
      
  }
}
