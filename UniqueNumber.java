import java.util.ArrayList;
import java.util.List;

public class UniqueNumber {
    public static void main(String[] args) {
        String name="MisssiSippi";

        int[] nums = new int[] {1,2,2,3,4,4,5,3,1,10};

        List<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {

            if(i==nums.length-1){
                if(!arrayList.contains(nums[i])){arrayList.add(nums[i]);}
            }
            else{
                for(int j=0; j<nums.length; j++){
                    if(j==i){continue;}
                    else if(nums[i] == nums[j]){break;}
                    else if(j==nums.length-1){arrayList.add(nums[i]);}
                }
            }
        }

        arrayList.forEach(i -> System.out.println(i));
    }
}
