/**
 * Created by verenaseverina on 3/26/17.
 */
public class Renderable {
  public void Render(Zoo virtualZoo) {
    int iIdx, jIdx;
    int cageIdx, animalIdx;
    for (iIdx = 0; iIdx < virtualZoo.GetHeight(); iIdx++) {
      for (jIdx = 0; jIdx < virtualZoo.GetWidth(); jIdx++) {
        if ((searchCageIndex(virtualZoo, iIdx, jIdx)) != -999) {
          cageIdx = searchCageIndex(virtualZoo, iIdx, jIdx);
          animalIdx = searchAnimalIndex(virtualZoo, cageIdx, iIdx, jIdx);
          System.out.printf("%c", virtualZoo.GetCages().get(cageIdx).GetAnimal()[animal_idx].GetContent());
        }
        else if (virtualZoo.IsPlayer(iIdx, jIdx)) {
          System.out.printf("P");
        }
        else {
          System.out.printf("%c", virtualZoo.GetMap()[iIdx][jIdx].GetCellContent());
        }
      }
      System.out.printf("\n");
    }
      System.out.printf("\n");
  }

  public int searchCageIndex(Zoo virtualZoo, int xRow, int yCol) {
    int iIdx = 0;
    int jIdx = 0;
    boolean found = false, stop;
    int cage = -999;
    while ((iIdx < virtualZoo.GetCages().size()) && (!found)) {
      stop = false;
      while ((jIdx <=  virtualZoo.GetCages().get(iIdx).GetNeff()) && (!found) && (!stop)) {
        if (virtualZoo.GetCages().get(iIdx).IsEmpty()) {
          stop = true;
        }
        else if ((virtualZoo.GetCages().get(iIdx).GetAnimal()[jIdx].GetX() == xRow)
                && (virtualZoo.GetCages().get(iIdx).GetAnimal()[jIdx].GetY() == yCol)) {
          found = true;
          cage = iIdx;
        }
        else {
          jIdx++;
        }
      }
      iIdx++;
    }
    return cage;
  }
  public int searchAnimalIndex(Zoo virtualZoo, int iIdx, int xRow, int yCol) {
    int kIdx = 0;
    boolean found = false;
    while ((kIdx < virtualZoo.GetCages().get(iIdx).GetCageSize()) && (!found)) {
      if ((virtualZoo.GetCages().get(iIdx).GetAnimal()[k].GetX() == xRow)
              && (virtualZoo.GetCages().get(iIdx).GetAnimal()[kIdx].GetY() == yCol)) {
        found = true;
      }
      else {
        kIdx++;
      }
    }
    return kIdx;
  }
}
