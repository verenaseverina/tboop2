/**
 * Created by verenaseverina on 3/26/17.
 */
public class Renderable {
  public void Render(Zoo virtual_zoo) {
    int i, j;
    int cage_idx, animal_idx;
    for (i = 0; i < virtual_zoo.GetHeight(); i++) {
      for (j = 0; j < virtual_zoo.GetWidth(); j++) {
        if ((SearchCageIndex(virtual_zoo, i, j)) != -999) {
          cage_idx = SearchCageIndex(virtual_zoo, i, j);
          animal_idx = SearchAnimalIndex(virtual_zoo, cage_idx, i, j);
          System.out.printf("%c", virtual_zoo.GetCages().elementAt(cage_idx).GetAnimal()[animal_idx].GetContent());
        }
        else if (virtual_zoo.IsPlayer(i, j)) {
          System.out.printf("P");
        }
        else {
            System.out.printf("%c", virtual_zoo.GetMap()[i][j].GetCellContent());
        }
      }
    }
      System.out.printf("\n");
  }

  public int SearchCageIndex(Zoo virtual_zoo, int x, int y) {
    int i = 0;
    int j = 0;
    boolean found = false, stop;
    int cage = -999;
    while ((i < virtual_zoo.GetCages().capacity()) && (!found)) {
      stop = false;
      while ((j <=  virtual_zoo.GetCages().elementAt(i).GetNeff()) && (!found) && (!stop)) {
        if (virtual_zoo.GetCages().elementAt(i).IsEmpty()) {
          stop = true;
        }
        else if ((virtual_zoo.GetCages().elementAt(i).GetAnimal()[j].GetX() == x)
                && (virtual_zoo.GetCages().elementAt(i).GetAnimal()[j].GetY() == y)) {
          found = true;
          cage = i;
        }
        else {
          j++;
        }
      }
      i++;
    }
    return cage;
  }
  public int SearchAnimalIndex(Zoo virtual_zoo, int i, int x, int y) {
    int k = 0;
    boolean found = false;
    while ((k < virtual_zoo.GetCages().elementAt(i).GetCageSize()) && (!found)) {
      if ((virtual_zoo.GetCages().elementAt(i).GetAnimal()[k].GetX() == x)
              && (virtual_zoo.GetCages().elementAt(i).GetAnimal()[k].GetY() == y)) {
        found = true;
      }
      else {
        k++;
      }
    }
    return k;
  }
}
