package classworks.lesson19_20230522.exceptions;

import java.util.ArrayList;

public class OutOfMemoryExample {
  public static void main(String[] args) {

    OutOfMemoryExample example = new OutOfMemoryExample();

    ArrayList newList = new ArrayList();
    int count = 0 ;

    while (true) {
      newList.add(example.newStringArray());
      count++;
    }
  }

  String[] newStringArray(){
    String[] newArray = new String[1_000_000];
    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = "afgjkashkgfjahfkghafksgjhaskfghaskgfkajsdghkjasdhgbalsjkgv";
    }
    return  newArray;
  }

}