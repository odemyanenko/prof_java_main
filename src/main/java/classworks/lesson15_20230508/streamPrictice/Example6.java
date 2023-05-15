package classworks.lesson15_20230508.streamPrictice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example6 {
  public static void main(String[] args) {
    List<Phone>  phoneList = new ArrayList<>();
    phoneList.add(new Phone("iPhone", 1000));
    phoneList.add(new Phone("Samsung", 950));
    phoneList.add(new Phone("Huawei", 750));
    phoneList.add(new Phone("Motorola", 500));
    phoneList.add(new Phone("Nokia", 620));
    phoneList.add(new Phone("Xiaomi", 900));


    System.out.println(phoneList.stream()
            .filter(x -> x.getPrice() > 700)
            .map(x -> x.getModel())
            .collect(Collectors.toSet()));



  }
}

class Phone{
  private String model;
  private double price;

  public Phone(String model, double price) {
    this.model = model;
    this.price = price;
  }

  public String getModel() {
    return model;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Phone{" +
            "model='" + model + '\'' +
            ", price=" + price +
            '}';
  }
}