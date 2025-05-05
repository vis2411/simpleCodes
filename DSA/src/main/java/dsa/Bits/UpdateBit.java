package dsa.Bits;

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        int n = 5 ; //0101
        int pos = 0 ;
        int bitMask = 1<< pos;

        if(operation==1){
            int newNumber = bitMask | n ;
            System.out.println(newNumber);
        }else {
            int newBitmask = ~(bitMask);
            int newNumber = newBitmask & n ;
            System.out.println(newNumber);
        }

    }
}
