package dsa.Bits;

public class ToggleBit {
    public static void main(String[] args) {
        int n = 29 ; // 11101
        int pos = 2;  //exp op = 11001

        System.out.println("original num : " + n);
        System.out.println("Binary representation : " + Integer.toBinaryString(n));

        int result = toggleBit(n , pos);
        System.out.println("number after toggling : " + pos + " : " + result);
        System.out.println("Binary representation : " + Integer.toBinaryString(result));
    }

    public static int toggleBit(int n , int pos){
        int mask = 1<<pos ;   // 00100

        return n ^ mask ;    //11101 ^ 00100  = 11001

    }
}
