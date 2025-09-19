import java.util.*;

public class MostCount {

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        int[] num = new int[] {1,3, 8, 3, 1, 2, 4, 8 ,0 ,2,2,4,6,8,1,0,3,4,5,8};
        Map<Integer,Integer> map = new HashMap<>();


        for(int i=0; i<num.length; i++) {
            map.put(num[i], map.getOrDefault(num[i], 0) + 1);
        }

        //convert Collections<Integer> to List<Integer> - simply added the below line
        List<Integer> intList = new ArrayList<>(map.values());
        //Collections.max(intList);

        int MaxVal = Collections.max(map.values());

        map.forEach((k,v) -> {
            if(v==MaxVal){
                System.out.println("Max Repeat :" + v);
                System.out.println("Max Repeat val :" + k);
            }
        });

    }
}
