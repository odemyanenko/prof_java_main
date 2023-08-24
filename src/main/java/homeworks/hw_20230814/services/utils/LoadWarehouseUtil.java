package homeworks.hw_20230814.services.utils;

import homeworks.hw_20230814.models.Category;
import homeworks.hw_20230814.models.Factory;
import homeworks.hw_20230814.models.Product;
import homeworks.hw_20230814.repositories.WarehouseRepository;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LoadWarehouseUtil {

  public static void getDataFromJSON(WarehouseRepository repository, String file){
    if (repository == null) {
      throw new IllegalArgumentException("Repository cannot be null!");
    }
    try {
      InputStream inputStream = LoadWarehouseUtil.class.getResourceAsStream(file);
      assert inputStream != null;
      BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
      StringBuilder stringBuilder = new StringBuilder();
      String line;

      while ((line = reader.readLine()) != null) {
        stringBuilder.append(line);
      }

      JSONArray jsonArray = new JSONArray(stringBuilder.toString());

      for (int i = 0; i < jsonArray.length(); i++) {
        JSONObject jsonObject = jsonArray.getJSONObject(i);

        String category = jsonObject.getString("CATEGORY");
        String factory = jsonObject.getString("FACTORY");
        boolean isDebt = jsonObject.getBoolean("ISDEBT");
        String product = jsonObject.getString("NAME");

        Category categoryObj = repository.addCategory(category.split("#")[0]);
        Factory factoryObj = repository.addFactory(factory.split("#")[0], isDebt);

        Product productObj = new Product(
                Integer.parseInt(product.split("#")[1]),
                product.split("#")[0],
                factoryObj,
                categoryObj,
                jsonObject.getBoolean("ISPACKED"),
                jsonObject.getBoolean("ISADV"),
                jsonObject.getBigDecimal("PRICE"),
                jsonObject.getDouble("MARGIN"),
                jsonObject.getInt("QUANTITY")
        );

        repository.addProduct(productObj);
      }
    } catch (Exception e) {
      System.out.println("Error reading or parsing JSON: " + e.getMessage());
    }
  }
}
