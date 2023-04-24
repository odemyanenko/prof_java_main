package homeworks.extra_hw1_oop.encapsulation;

import java.util.*;

public class WordService {
  public String findMostFrequentWord(String text) {
    Map<String, Integer> wordMap = new LinkedHashMap<>();

    extractedWords(text, wordMap);

    return getMostFrequentWord(wordMap);
  }

  public String getMostFrequentWord(Map<String, Integer> words) {
    SortedSet<Map.Entry<String, Integer>> sortedEntries = new TreeSet<>(
            (o1, o2) -> o2.getValue() - o1.getValue()
    );

    sortedEntries.addAll(words.entrySet());

    return sortedEntries.first().getKey();
  }

  public void extractedWords(String text, Map<String, Integer> wordMap) {
    String[] words = text.split("\\W");
    for (int i = 0; i < words.length; i++) {
      String key = words[i];
      if (wordMap.containsKey(key)) {
        wordMap.put(key, wordMap.get(key) + 1);
      } else {
        wordMap.put(key, 1);
      }
    }
  }
}
