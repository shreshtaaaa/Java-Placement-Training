import java.io.FileWriter;

public class transferData3 {
    public static void main(String[] args) throws Exception {
        FileWriter fw=new FileWriter("new.txt");
        fw.write("this is my new file");
        System.out.println("write operation done");
        fw.close();
    }
}
