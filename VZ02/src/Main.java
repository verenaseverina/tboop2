/**
 * Created by Kebun Binatang Bandung on 3/26/17.
 */
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Thread.sleep;
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
               while(!z.IsExit(z.GetPlayerPos())) {
                 sleep(500);
                 z.Tour();
                 for(int i= 0;i<z.GetCages().size();i++) {
                   z.GetCages().get(i).updatePosition();
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
