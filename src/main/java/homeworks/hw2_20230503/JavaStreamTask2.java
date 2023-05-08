package homeworks.hw2_20230503;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaStreamTask2 {
  public static void main(String[] args) {
    List<Item> itemList = new ArrayList<>();
    itemList.add(new Item("New", 33.5));
    itemList.add(new Item("City", 14));
    itemList.add(new Item("Window", 13));
    itemList.add(new Item("Phone", 43));
    itemList.add(new Item("Milk", 15));
    itemList.add(new Item("Bun", 1));
    itemList.add(new Item("Table", 30));
    itemList.add(new Item("Sun", 11));
    itemList.add(new Item("Door", 14));
    itemList.add(new Item("Paper", 43));
    itemList.add(new Item("Phone", 31));

    System.out.println("Task. Создать коллекцию наименований телефонов у которых цена более 10");
    System.out.println("- с дублированием названий: ");
    List<String> phonesWithDuplicate = itemList.stream()
            .filter(item -> item.getPrice() > 10)
            .map(Item::getName)
            .toList();
    System.out.println(phonesWithDuplicate);

    System.out.println("- уникальные называния: ");
    List<String> phonesUniq = itemList.stream()
            .filter(item -> item.getPrice() > 10)
            .map(Item::getName)
            .distinct()
            .toList();
    System.out.println(phonesUniq);
  }
}

class Item {
  private String name;
  private double price;

  public String getName() {
    return name;
  }

  public Item(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
