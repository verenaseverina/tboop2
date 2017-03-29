/**
 * Created by Kebun Binatang Bandung on 3/26/17.
 */
import static java.lang.Thread.sleep;

import java.io.IOException;
import java.util.Scanner;


/**
 * Driver dari perangkat lunak virtual zoo.
 * @author Adrian Hartarto
 * @author Winarto
 */
public class Main {
  /**
   * Driver dari perangkat lunak virtual zoo.
   * Program mengkonstruksi sebuah objek Zoo dan ditampilkan ke layar.
   * menggunakan kelas Renderable. Lalu program menerima user input
   * untuk instruksi berikutnya yang terdiri dari:
   * <ol>
   *     <li>Tambahkan Animal.</li>
   *     <li>Tour.</li>
   *     <li>Exit.</li>
   * </ol>
   *
   * @see Renderable
   * @see Zoo
   * @throws IOException Error handling
   * @throws InterruptedException Error handling
   */
  public static void main(String[] args) throws IOException,InterruptedException {
    Zoo z = new Zoo();
    int input;
    Renderable r = new Renderable();
    Scanner tin = new Scanner(System.in);
    boolean endloop = false;
    z.randomEntrance();
    do {
      System.out.print("1.Tambahkan Animal\n2. Tour\n3. Exit\n");
      input = tin.nextInt();
      switch (input) {
        case 1: {
          r.render(z);
          z.putInAnimal();
          break;
        }
        case 2: {
          z.randomEntrance();
          r.render(z);
          while (!z.isExit(z.getPlayerPos())) {
            sleep(500);
            z.tour();
            for (int i = 0; i < z.getCages().size(); i++) {
              z.getCages().get(i).updatePosition();
            }
            r.render(z);
          }
          break;
        }
        case 3: {
          endloop = true;
          break;
        }
        default : {
          break;
        }
      }
    } while (!endloop);

  }
}
