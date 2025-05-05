package dsa.Bits;

public class ClearingTheBit {
    public static void main(String[] args) {
        int n = 5 ; //0101
        int pos = 2 ;
        int bitMask = 1<<pos;  // 100

        int notBitMask = ~(bitMask);  // 011
        int newNum = notBitMask & n ;  // 0011 & 0101
        System.out.println(Integer.toBinaryString(newNum));
        System.out.println(newNum);

    }




}
