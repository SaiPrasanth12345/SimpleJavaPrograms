import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        List<String> strList = new ArrayList<>();
        Collections.addAll(strList, "Thanks", "For", "Comming","to","Party");
        
        System.out.println(strList.size());

        // Sort List by length Using Comparator - based upon s1 & s2 lengths - in ascending order
        strList.sort((s1, s2) -> s1.length() - s2.length());
        
        strList.forEach(s -> System.out.println(s));
        
    }
}
