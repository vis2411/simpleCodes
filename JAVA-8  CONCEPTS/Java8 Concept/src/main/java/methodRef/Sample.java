package methodRef;

public class Sample {
    public static void main(String[] args) {
        Inf1 i = s-> new A(s);
        i.get("from lamda expression");
        Inf1 f1 = A::new;
        f1.get("from construction reference");

    }


}

interface Inf1{
    public A get(String s);
}
class A {
    private String s ;
    A(String s){
        this.s = s;
        System.out.println("Constructor reference");
    }
}
