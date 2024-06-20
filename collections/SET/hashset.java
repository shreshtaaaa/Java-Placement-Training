package SET;
//it is unordered
import java.util.HashSet;

public class hashset{
    public static void main(String[] args) {
        HashSet <String> set1=new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("cherry");
        set1.add("apple");
        set1.add("date");
        System.out.println(set1);
    }
}