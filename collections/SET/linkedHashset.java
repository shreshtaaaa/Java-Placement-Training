//it follows the insertion order.. duplicate wont be allowed

package SET;
import java.util.LinkedHashSet;

public class linkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lh=new LinkedHashSet<>();
        lh.add(10);
        lh.add(20);
        lh.add(30);
        lh.add(40);
        lh.add(50);
        System.out.println(lh);
    }
}
