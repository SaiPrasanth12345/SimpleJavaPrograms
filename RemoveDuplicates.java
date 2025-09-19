import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] num = new int[] {1,3, 8, 3, 1, 2, 4, 8 ,0 ,2};
        int[] remDuplicate = new int[num.length];
        int pos = 0;

        for(int i =0; i<num.length; i++) {
            int x = num[i];
            boolean duplicate = false;

            for (int j = 0; j < remDuplicate.length; j++) {
                if (remDuplicate[j] == x) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                remDuplicate[pos] = x;
                pos++;
            }
        }

        for (int i=0; i<remDuplicate.length; i++) {
            System.out.println(remDuplicate[i]);
        }

    }
}
