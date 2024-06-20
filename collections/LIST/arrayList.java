
//comprehensive mechanism to store multiple data together
//framework-readymade architecture
//collection interface is available inside java.util package
//child interfaces of collection interface-list,queue,set,map
//list-arraylist,linkedlist,vector //vector-stack is childclass of vector
//queue-arraydeque,priorityqueue
//set-hashset,linkedhashset,treeset
//map-hashmap,linkedhashmap,treemap (these are all classes..)

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Object> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30.67);
        a1.add("hello");
        a1.add(true);
        a1.add(null);
        System.out.println(a1);
        a1.add(33);
        a1.add(25);
        System.out.println(a1);

        Iterator<Object> itr = a1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
