package homeworks.hw_20230814.json_parser;

import homeworks.hw_20230814.models.Category;
import homeworks.hw_20230814.models.Factory;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class JSONEx {
  public static void main(String[] args) throws Exception {
    try {
      InputStream inputStream = JSONEx.class.getResourceAsStream("/report.json");
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
        System.out.println(jsonObject);

        String category = jsonObject.getString("NAME");
        String factory = jsonObject.getString("FACTORY");
//        Category category = new Category(jsonObject.getString("NAME"));
//        Factory factory = new Factory(jsonObject.getString("FACTORY"));
      }

//      List<ProductDto> productDtos = json.toJSONArray();
//      Map<String, Object> map = json.toMap();
//
//      for (String key : map.keySet()) {
//        System.out.println(key + ": " + map.get(key));
//      }

    } catch (Exception e) {
      System.out.println("Error reading or parsing JSON: " + e.getMessage());
    }
  }
}
/*
public class JsonArrayExample {
    public static void main(String[] args) {
        try {
            // Read the JSON file using a FileReader
            FileReader fileReader = new FileReader("data.json");

            // Parse the JSON using a JSONTokener
            JSONTokener tokener = new JSONTokener(fileReader);
            JSONArray jsonArray = new JSONArray(tokener);

            // Iterate through the JSON array and create objects
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String name = jsonObject.getString("name");
                int age = jsonObject.getInt("age");

                // Create an object or do something with the data
                Person person = new Person(name, age);
                System.out.println(person);
            }

            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
* */