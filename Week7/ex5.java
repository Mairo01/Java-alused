package Week7;

import java.util.HashMap;

public class ex5 {
  public static void main(String[] args) {
    HashMap<String, String> test = new HashMap<String, String>();
    
    test.put("matti", "mage");
    test.put("mikael", "mixu");
    test.put("arto", "arppa");
    
    System.out.println(test.get("mikael"));
  }
}
