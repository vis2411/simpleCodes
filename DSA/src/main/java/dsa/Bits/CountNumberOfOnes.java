package dsa.Bits;

public class CountNumberOfOnes {
    public static void main(String[] args) {
        int n = 5 ; //0101
        String num = Integer.toBinaryString(n);
//        System.out.println(num);
        int count = 0 ;
        for (int i = 0 ; i< num.length() ; i++){

//            System.out.println(num.charAt(i));
            if (num.charAt(i)=='1'){
               count++;
            }

        }
        System.out.println(count);

    }
}
