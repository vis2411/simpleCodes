package dsa.Bits;

public class MultipleOfTwo {
    public static void main(String[] args) {
        int num = 8 ; // 1000    num - 1 = 0111    16 8 4 2 1
        if(isPowerOfTwo(num)==true){
            System.out.println(num   +" num is power of two");
        }else {
            System.out.println(num + " num is not power of two");
        }

    }
    public static boolean isPowerOfTwo(int num ){
        return (num>0)&&((num & (num-1))==0);   //0000
    }


}
