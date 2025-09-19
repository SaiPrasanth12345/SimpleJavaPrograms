public class countChars {

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        //Print vowels
        String s = "I am prasanth";
        String x = s.replaceAll("[^AEIOUaeiou]", "");
        System.out.println(x);

        //count Chars
        String a= "ppppqqqrrp";
        String res="";
        int count =1;
        for(int i=0; i<a.length(); i++) {
            if(i == a.length()-1){
                res = res+ String.valueOf(a.charAt(i))+String.valueOf(count);
            }
            else if(a.charAt(i) == a.charAt(i+1)) {
                count++;
            }
            else{
                res = res+String.valueOf(a.charAt(i))+String.valueOf(count);
                count =1;
            }
        }

        System.out.println("Result:" + res);

    }
}
