import java.util.ArrayList;
import java.util.List;

public class UniqueNumberArray {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        int[] nums = new int[] {1,2,2,3,4,4,5,3,1,10};

        List<Integer> duplicateList  = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            for (int j=0; j<nums.length; j++){
                if(i==j){
                    continue;
                }
                else if(nums[i] == nums[j]){
                    duplicateList.add(nums[i]);
                }
            }
        }

        for(int i: nums){
            if(!(duplicateList.contains(i))){
                System.out.println(i);
            }
        }


    }
}
