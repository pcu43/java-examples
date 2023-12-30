import java.util.*;

public class CW0003 {
    
  public static void main(String[] args) {
    System.out.printf("zero=%d\n", parseInt("zero"));
    System.out.printf("one=%d\n", parseInt("one"));
    System.out.printf("ten=%d\n", parseInt("ten"));
  }

  public static int parseInt(String numStr) {

/*
"one" => 1
"twenty" => 20
"two hundred forty-six" => 246
"seven hundred eighty-three thousand nine hundred and nineteen" => 783919

{a} million {b} thousand {c} hundred [and] {d}

*/

    Map<String,Integer> values = new HashMap<>();
    values.put("zero", 0);
    values.put("one", 1);
    values.put("two", 2);
    values.put("three", 3);
    values.put("four", 4);
    values.put("five", 5);
    values.put("six", 6);
    values.put("seven", 7);
    values.put("eight", 8);
    values.put("nine", 9);
    values.put("ten", 10);
    values.put("eleven", 11);
    values.put("twelve", 12);
    values.put("thirteen", 13);
    values.put("fourteen", 14);
    values.put("fifteen", 15);
    values.put("sixteen", 16);
    values.put("seventeen", 17);
    values.put("eighteen", 18);
    values.put("nineteen", 19);
    values.put("twenty", 20);
    values.put("thirty", 30);
    values.put("forty", 40);
    values.put("fifty", 50);
    values.put("sixty", 60);
    values.put("seventy", 70);
    values.put("eighty", 80);
    values.put("ninety", 90);
    values.put("hundred", 100);
    values.put("thousand", 1000);
    values.put("million", 1000000);

    int n = -1;

    numStr = numStr.toLowerCase();
    String[] tokens = numStr.split("[\\s+]");
    if (tokens.length == 1) {
      if (values.containsKey(tokens[0])) {
        return values.get(tokens[0]);
      } else {
        return -1;
      }
    }
      
    return n;

  }
}
