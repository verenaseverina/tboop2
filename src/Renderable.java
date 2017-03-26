/**
 * Created by verenaseverina on 3/26/17.
 */
public class Renderable {
  public void Render(Zoo virtual_zoo) {
    int i, j;
    int idx, animal_idx;
    for (i = 0; i < virtual_zoo.GetHeight(); i++) {
      for (j = 0; j < virtual_zoo.GetWidth(); j++) {
        if (IsThereAnimal(virtual_zoo, i, j)) != -999) {
          idx = IsThereAnimal(virtual_zoo, i, j);
          animal_idx = FindAnimal(virtual_zoo, idx, i, j);
          System.out.println(virtual_zoo.GetCages()[idx].GetAnimal()[animal_idx].GetContent());
        }
        else if (virtual_zoo.IsPlayer(i, j)) {
          System.out.println('P');
        }
        else {
            System.out.println(virtual_zoo.GetMap()[i][j].GetCellContent());
        }
      }
    }
      System.out.println("\n");
  }

  public int IsThereAnimal(Zoo virtual_zoo, int x, int y) {
    int i = 0;
    int j = 0;
    boolean found = false, stop;
    int cage = -999;
    while ((i < virtual_zoo.GetCages().capacity()) && (!found)) {
      stop = false;
      while ((j <=  virtual_zoo.GetCages()[i].GetNeff()) && (!found) && (!stop)) {
        if (virtual_zoo.GetCages()[i].IsEmpty()) {
          stop = true;
        }
        else if ((virtual_zoo.GetCages()[i].GetAnimal()[j].GetX() == x) && (virtual_zoo.GetCages()[i].GetAnimal()[j].GetY() == y)) {
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
  public int FindAnimal(Zoo virtual_zoo, int i, int x, int y) {
    int k = 0;
    boolean found = false;
    while ((k < virtual_zoo.GetCages()[i].GetSize()) && (!found)) {
      if ((virtual_zoo.GetCages()[i].GetAnimal()[k].GetX() == x) && (virtual_zoo.GetCages()[i].GetAnimal()[k].GetY() == y)) {
        found = true;
      }
      else {
        k++;
      }
    }
    return k;
  }
}
