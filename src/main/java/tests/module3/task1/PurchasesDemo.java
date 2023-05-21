package tests.module3.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/*

Создайте класс "История покупок клиента".
В классе должно быть поле, тип которого Map.
Ключи Map - даты заказа, значения - список заказанных наименований.

В основной программе создайте истории покупок для нескольких клиентов.
С помощью Stream API нужно получить перечень всех наименований без повторений,
которые участвовали в заказах за прошедшие 30 дней от текущей даты.
Перечень должен быть отсортирован по алфавиту. Выведите перечень в консоль.

*/

public class PurchasesDemo {
  public static void main(String[] args) throws ParseException {

    Map<String, HistoryOfCustomerPurchases> purchasesList = new HashMap<>();

    FillData(purchasesList);

    List<String> latestPurchases = getLatestPurchases(purchasesList);
    System.out.println("Result : " + latestPurchases);
  }

  private static List<String> getLatestPurchases(Map<String, HistoryOfCustomerPurchases> list) {
    Date dateBefore30Days = getDateBefore30Days();

    List<String> collect = list.entrySet()
            .stream()
            .map(e -> e.getValue().getList().entrySet())
            .flatMap(Collection::stream)
            .filter(e-> e.getKey().after(dateBefore30Days))
            .map(Map.Entry::getValue)
            .flatMap(Collection::stream)
            .distinct()
            .sorted()
            .collect(Collectors.toList());

    return collect;
  }

  private static Date getDateBefore30Days() {
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.DAY_OF_MONTH, -30);

    return calendar.getTime();
  }

  private static void FillData(Map<String, HistoryOfCustomerPurchases> list) throws ParseException {
    HistoryOfCustomerPurchases purchases1 = new HistoryOfCustomerPurchases();
    purchases1.add(new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH).parse("2023/03/21"), Arrays.asList("Cheese", "Butter"));
    purchases1.add(new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH).parse("2023/05/01"), Arrays.asList("Laptop", "Mouse"));
    purchases1.add(new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH).parse("2023/05/02"), Arrays.asList("Rise", "Milk", "Bread"));

    HistoryOfCustomerPurchases purchases2 = new HistoryOfCustomerPurchases();
    purchases2.add(new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH).parse("2022/05/01"), Arrays.asList("Coffee", "Tea"));
    purchases2.add(new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH).parse("2023/05/01"), Arrays.asList("USB-Hard-Drive", "Cover"));
    purchases2.add(new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH).parse("2023/05/12"), Arrays.asList("Laptop"));

    list.put("Sydorov", purchases1);
    list.put("Ivanov", purchases2);

    System.out.println(list);
  }
}
