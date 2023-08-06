package homeworks.hw_20230801.task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Вам дан текстовый файл, содержащий список кодов продуктов в формате: <product_code>:<quantity>.
Найти все продукты с количеством больше 10 и вывести их коды и количество.
ABC123:5
XYZ789:12
DEF456:8
JKL012:15
MNO345:6
*/

public class Main {
  final static String PRODUCT_FILE_PATH = "src/main/java/homeworks/hw_20230801/task3/products.txt";

  public static void main(String[] args) {
    getProductsWithCountMore10();
  }

  private static void getProductsWithCountMore10() {
    Map<String, Integer> products = getProductListFromFile();
    products
            .entrySet()
            .stream()
            .filter(e -> e.getValue() >= 10)
            .forEach(System.out::println);
  }

  private static Map<String, Integer> getProductListFromFile() {
    Map<String, Integer> products = new HashMap<>();

    String regex = "([A-Z]{3}\\d{3})(:)(\\d+)";
    Pattern pattern = Pattern.compile(regex);

    try (BufferedReader reader = new BufferedReader(new FileReader(PRODUCT_FILE_PATH))) {
      String strLine;
      while ((strLine = reader.readLine()) != null) {
        Matcher matcher = pattern.matcher(strLine);
        String productNumber = matcher.replaceAll("$1");
        int productQuantity;
        try {
          productQuantity = Integer.parseInt(matcher.replaceAll("$3"));
        } catch (Exception e) {
          productQuantity = 0;
        }
        products.put(productNumber, productQuantity);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    return products;
  }
}