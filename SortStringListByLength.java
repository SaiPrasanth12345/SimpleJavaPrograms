import java.util.*;

class Main {
    public static void main(String[] args) {
        String str = "Thanks for comming to Party";

        List<String> strList = Arrays.asList(str.split(" "));
        System.out.println(strList.size());
        
        strList.sort((s1, s2) -> s2.length() - s1.length());
        
        strList.forEach(s -> System.out.println(s));
        
        System.out.println(strList.size());

        // Sort List by length Using Comparator - based upon s1 & s2 lengths - in ascending order
        strList.sort((s1, s2) -> s1.length() - s2.length());
        
        strList.forEach(s -> System.out.println(s));
        
    }
}
