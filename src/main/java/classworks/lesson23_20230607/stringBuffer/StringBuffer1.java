package classworks.lesson23_20230607.stringBuffer;

import java.util.Arrays;

public class StringBuffer1 {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer();

//    sb.append(new Integer(2));
    sb.append("; ");
    sb.append(true);
    sb.append("; ");
    sb.append(Arrays.asList(1,2,3));
    sb.append("; ");

    System.out.println(sb);
  }
}