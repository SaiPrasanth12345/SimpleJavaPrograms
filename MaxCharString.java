import java.util.ArrayList;
import java.util.List;

public class MaxCharString {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        String s= " Thisisabiggameforusandweneedtowinthismatch";

        int maxcount =0;
        int len = s.length();
        char c = 0;

        for(int i=0; i<s.length(); i++) {
            char x = s.charAt(i);
            String y = s.replace(String.valueOf(x),"");
            int count = len - y.length();

            if(count > maxcount) {
                maxcount = count;
                c = x;
            }
        }

        System.out.println("Maxcount: "+ maxcount);
        System.out.println("char c: "+ c);

    }
}
