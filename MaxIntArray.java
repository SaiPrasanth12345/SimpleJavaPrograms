import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxIntArray {

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int count = 0;
        int maxCount = 0;


        Integer[] num = new Integer[]{2, 5, 6, 1, 6, 7, 2, 5, 3, 3, 3, 4, 4, 3, 4, 3, 4, 8, 3, 5, 4, 1, 5, 2, 3};
        List<Integer> intList = Arrays.asList(num);

        intList.forEach(i -> System.out.println(i));
        Collections.sort(intList);

        int val = intList.get(0);
        int maxVal = intList.get(0);
        for (int i = 1; i < intList.size(); i++) {
            if (val == intList.get(i)) {
                count++;
            } else {
                if (count > maxCount) {
                    maxVal = intList.get(i - 1);
                    maxCount = count;
                } else {
                    count = 0;
                    val = intList.get(i);
                }
            }
        }

        System.out.println("Max val: " + maxVal);
        System.out.println("Max Count: " + (maxCount + 1));


        String x = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
