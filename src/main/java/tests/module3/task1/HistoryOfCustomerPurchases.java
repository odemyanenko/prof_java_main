package tests.module3.task1;

import java.util.*;

public class HistoryOfCustomerPurchases {
  Map<Date, List<String>> list = new HashMap<>();

  public Map<Date, List<String>> getList() {
    return Collections.unmodifiableMap(list);
  }

  public void add(Date date, List<String> list){
    this.list.put(date, list);
  }

  @Override
  public String toString() {
    return "HistoryOfCustomerPurchases{" +
            "list=" + list +
            '}';
  }
}
