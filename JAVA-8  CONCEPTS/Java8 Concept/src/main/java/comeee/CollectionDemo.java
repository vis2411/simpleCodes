package comeee;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        TreeSet<Integer> list = new TreeSet<>(new MyComparator());
        list.add(10);
        list.add(20);
        list.add(13);
        list.add(5);
//        System.out.println("before sorting " + list);
//        Collections.sort(list);
//        System.out.println("after sorting " + list);
        System.out.println(list);
    }
}

class MyComparator implements Comparator<Integer>{
    public int compare(Integer I1, Integer I2){
        if (I1>I2){
            return -1;
        } else if (I1>I2) {
            return 1;
        }else {
            return  0;
        }
    }
}
