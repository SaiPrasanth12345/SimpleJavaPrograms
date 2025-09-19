public class SortArray {

    public static void main(String[] args) {

        int[] numArr = new int[] {2,9,7,1, 4, 6,3};

        for (int i=0; i <numArr.length-1; i++){
            for (int j=i+1; j <numArr.length; j++) {
                if (numArr[i] > numArr[j]) {
                    int x = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = x;
                }
            }
        }

        for (int i=0; i <numArr.length; i++){
            System.out.println(numArr[i]);
        }
    }
}
