/**
 * Kelas untuk menampilkan Zoo dan state saat ini dari Zoo.
 * Kelas dan seluruh methodnya menerima parameter Zoo.
 * @author Verena Severina
 * @author Winarto
 */
public class Renderable {
  /**
   * Menampilkan Zoo yang diterima sebagai parameter method.
   * @param virtualZoo Zoo yang akan ditampilkan di layar console.
   */
  public void render(Zoo virtualZoo) {
    int iidx;
    int jidx;
    int cgIdx;
    int anIdx;
    for (iidx = 0; iidx < virtualZoo.getHeight(); iidx++) {
      for (jidx = 0; jidx < virtualZoo.getWidth(); jidx++) {
        if ((searchCageIndex(virtualZoo, iidx, jidx)) != -999) {
          cgIdx = searchCageIndex(virtualZoo, iidx, jidx);
          anIdx = searchAnimalIndex(virtualZoo, cageIdx, iidx, jidx);
          System.out.printf("%c", virtualZoo.getCages().get(cgIdx).getAnimal()[anIdx].GetContent());
        } else if (virtualZoo.isPlayer(iidx, jidx)) {
          System.out.printf("P");
        } else {
          System.out.printf("%c", virtualZoo.getMap()[iidx][jidx].getCellContent());
        }
      }
      System.out.printf("\n");
    }
    System.out.printf("\n");
  }

  /**
   * Mencari dikandang indeks berapa animal dengan posisi baris x dan kolom y
   * ditemukan.
   *
   * @param virtualZoo Zoo yang ditinjau
   * @param xrow Baris posisi Animal
   * @param ycol Kolom posisi Animal
   * @return integer indeks detemukannya animal
   */
  public int searchCageIndex(Zoo virtualZoo, int xrow, int ycol) {
    int iidx = 0;
    int jidx = 0;
    boolean found = false;
    boolean stop;
    int cage = -999;
    while ((iidx < virtualZoo.getCages().size()) && (!found)) {
      stop = false;
      while ((jidx <=  virtualZoo.getCages().get(iidx).getNeff()) && (!found) && (!stop)) {
        if (virtualZoo.getCages().get(iidx).isEmpty()) {
          stop = true;
        } else if ((virtualZoo.getCages().get(iidx).getAnimal()[jidx].getX() == xrow)
                && (virtualZoo.getCages().get(iidx).getAnimal()[jidx].getY() == ycol)) {
          found = true;
          cage = iidx;
        } else {
          jidx++;
        }
      }
      iidx++;
    }
    return cage;
  }

  /**
   * Memberikan nilai indeks animal dari cage ke i yang ditemukan
   * pada posisi baris x dan kolom y.
   *
   * @param virtualZoo Zoo yang ditinjau
   * @param iidx Indeks cage yang ditinjau
   * @param xrow Baris posisi Animal
   * @param ycol Kolom posisi Animal
   * @return integer indeks animal pada posisi x,y dan cage indeks i
   */
  public int searchAnimalIndex(Zoo virtualZoo, int iidx, int xrow, int ycol) {
    int kidx = 0;
    boolean found = false;
    while ((kidx < virtualZoo.getCages().get(iidx).getCageSize()) && (!found)) {
      if ((virtualZoo.getCages().get(iidx).getAnimal()[kidx].getX() == xrow)
              && (virtualZoo.getCages().get(iidx).getAnimal()[kidx].getY() == ycol)) {
        found = true;
      } else {
        kidx++;
      }
    }
    return kidx;
  }
}