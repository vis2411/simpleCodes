package dsa.strings;

public class Concat {
    public static void main(String[] args) {
        String s1 = "vish";
        String s2 = "vish";
        String s3 = s1 + " " + s2 ;
        System.out.println(s3);
        System.out.println(s3.length());
        for (int i = 0 ; i< s3.length();i++){
            System.out.println(s3.charAt(i));
        }


        //.compareTo() method gives 3 output values whenever it compares two string
//        s1>s2 ---> +ve value   Hello > aello
//        s1=s2 ---> 0           Hello == Hello
//        s1<s2 ---> -ve value   aello < Hello
        if (s1.compareTo(s2)==0){System.out.println("string are equal");}
        else {System.out.println("not equal");}
        if (s1==s2){System.out.println("string are equal");}
        else {System.out.println("not equal");}
        if (new String("vish")==new String("vish"))
        {System.out.println("string are equal"); }
        else{System.out.println("not equal");}

        if(s1.equals(s2)){System.out.println("string are equal");}
        else {System.out.println("not equal");}

        String s4 = "java is good";
        System.out.println(s4.substring(0,7));

        String s5 = "1234";
        int num = Integer.parseInt(s5);
        System.out.println(num);


        int a = 12345;
        String s = Integer.toString(a);
        System.out.println(s);

    }
}
