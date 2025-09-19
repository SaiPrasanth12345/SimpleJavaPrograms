import java.util.*;

public class UniqueWords {

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        String name = "Welcome to Geeks for Geeks today";
        String[] split = name.split(" ");
        List<String> duplicateList = new ArrayList<>();


        for(int i=0; i<split.length-1; i++) {
            for(int j=i+1; j<split.length; j++) {
                if(split[i].equalsIgnoreCase(split[j])){
                    duplicateList.add(split[i]);
                }
            }
        }

        for(int i=0; i<split.length; i++) {
            if(!(duplicateList.contains(split[i]))){
                System.out.println(split[i]);
            }
        }
    }
}
