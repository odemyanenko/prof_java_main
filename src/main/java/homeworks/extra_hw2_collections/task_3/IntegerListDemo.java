package homeworks.extra_hw2_collections.task_3;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {
  private List<Integer> list = new ArrayList<>();

  public List<Integer> getList() {
    return new ArrayList<>(list);
  }

  public void addElements(Integer startElement, Integer endElement){
    list.add(0, startElement);
    list.add(endElement);
  }

  public boolean deleteElement(Integer element){
    return list.remove(element);
  }

  public int deleteElement(int index){
    return list.remove(index);
  }

  public void printElements(){
    System.out.println("List elements:");
    for (int i = 0; i < list.size(); i++) {
      System.out.println("(" + i + ") " + list.get(i));
    }
  }
}
