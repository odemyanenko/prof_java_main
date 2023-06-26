package tests.module6.test;

import java.util.*;
import java.util.concurrent.*;

public class Main3 {
  public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
    Map<String , String> map = new ConcurrentHashMap<>();
    map.put("1", "1");
    map.put("2", "1");
    map.put("3", "1");
    map.put("4", "1");
    map.put("5", "1");
    map.put("6", "1");

    Iterator<String> it = map.keySet().iterator();
    while (it.hasNext()){
      String key = it.next();
      if (key.equals("2")) {
        map.put(key + "new", "222");
      }
    }

/*
//    Exception in thread "main" java.util.concurrent.TimeoutException
//    at java.base/java.util.concurrent.FutureTask.get(FutureTask.java:204)
//    at tests.module6.test.Main3.main(Main3.java:26)

    new FutureTask<>(() -> {
      Thread.sleep(150L);
      return 42L;
    }).get(100L, TimeUnit.MILLISECONDS);*/

  }
}
