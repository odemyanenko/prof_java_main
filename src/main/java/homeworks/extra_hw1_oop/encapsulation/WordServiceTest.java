package homeworks.extra_hw1_oop.encapsulation;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordServiceTest {
  public static void main(String[] args) {
    Map<String, Integer> wordMap = new LinkedHashMap<>();
    String text = "She loves apple loves apple";

    Map<String, Integer> expectedMap = new LinkedHashMap<String, Integer>();

    expectedMap.put("She", 1);
    expectedMap.put("loves", 2);
    expectedMap.put("apple", 2);

    String exceptedWord = "loves";

    WordService service = new WordService();
    service.extractedWords(text, wordMap);

    printTestResult("Check extracted words", expectedMap, wordMap);
    printTestResult("Check get most frequency word", exceptedWord, service.getMostFrequentWord(wordMap));
    printTestResult("Check find most frequency word", exceptedWord, service.findMostFrequentWord(text));
  }

  public static void printTestResult(String message, Map<String, Integer> expectedResult, Map<String, Integer> realResult) {
    if (expectedResult.equals(realResult)) {
      System.out.println("Test " + message + " passed OK!");
    } else {
      System.out.println("Test " + message + " passed FAIL!");
      System.out.println("Expected result: " + expectedResult + " but real result: " + realResult);
    }
  }

  public static void printTestResult(String message, String expectedResult, String realResult) {
    if (expectedResult.equals(realResult)) {
      System.out.println("Test " + message + " passed OK!");
    } else {
      System.out.println("Test " + message + " passed FAIL!");
      System.out.println("Expected result: " + expectedResult + " but real result: " + realResult);
    }
  }
}
