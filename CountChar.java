import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountChar {
    public static void main(String[] args) {
        String name="MisssiSippi";

        Map<Character,Integer> intMap = new HashMap<>();

        int x = 20 + +9 * -10 + +4 + -13 + +19;
        System.out.println("Value of x: "+ x);

        double a = 0.1 + 0.2;
        System.out.println("Value of a:"+a);

        String str3 = new String("Hello World");
        String str4 = new String("Hello World");
        // value is false, as newString() creates a new memory every time
        System.out.println("Value is :"+ (str3==str4));

        String str1 = "Hello World";
        String str2 = "Hello World";
        // value is true, as both objects are referenced to same memory
        System.out.println("Value is :"+ (str1==str2));


        str1.concat("abc");
        System.out.println("After concat Value is :"+ str1);


        final int j = 10;
        System.out.println(j + 1);

        Integer int_data = 10;
        System.out.println("ByteValue:" +int_data.byteValue());

        for(int i=0; i<name.length();i++) {
            char c = name.charAt(i);
            if(intMap.containsKey(c)) {
                intMap.put(c, intMap.get(c)+1);
            }
            else{
                intMap.put(c, 1);
            }
        }

        intMap.forEach((k,v) -> System.out.println("Key: "+k + " Value: "+v));
    }

}
