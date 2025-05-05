package dsa.Bits;

public class SetBit {
    public static void main(String[] args) {
        int n = 5 ;  //0101
        int pos = 1 ;
        int bitShift = 1<<pos;  //0010
        int newNum = bitShift | n ;
        System.out.println(newNum);
    }
}
