package dsa.Bits;

public class CheckOnes {
    public static void main(String[] args) {
        int n = 5;
        String newNum = Integer.toBinaryString(n);
//        System.out.println(newNum);
//        System.out.println(newNum.length());
        int i;
        int count = 0;
        for (i = 0; i < newNum.length(); i++) {
            if (newNum.charAt(i) == '1') {
                count++;
            }
        }
        System.out.println(count);

    }
}