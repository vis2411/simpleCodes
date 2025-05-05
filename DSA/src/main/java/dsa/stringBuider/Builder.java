package dsa.stringBuider;

//Strings are immutable in java variables are stored in stack or heap
public class Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("vish");

        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'c');
        System.out.println(sb);

        sb.insert(1,'c');
        System.out.println(sb);

        sb.delete(1,2);
        System.out.println(sb);

        sb.append(" abc");
        System.out.println(sb.length());



    }
}
