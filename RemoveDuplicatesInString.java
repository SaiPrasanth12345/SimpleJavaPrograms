import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesInString {

    public static void main(String[] args) {
        String name="MisssiSippi";
        String x= "";

        StringBuilder sb = new StringBuilder();
        List<Character> arrayList = new ArrayList<>();

        for(char c: name.toCharArray()){
            if(!(arrayList.contains(c))){
                arrayList.add(c);
                sb.append(c);
                x= x+String.valueOf(c);
            }
        }

        System.out.println("X: "+x);



    }
}
