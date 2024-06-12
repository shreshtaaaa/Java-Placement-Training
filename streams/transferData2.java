import java.io.FileInputStream;
import java.io.FileOutputStream;

public class transferData2{
    public static void main(String[] args) throws Exception {
        FileOutputStream fout=new FileOutputStream("xyz.txt");
        FileInputStream fin=new  FileInputStream("pqr.txt");
        fin.transferTo(fout); //transferto method will take output as parameter
        System.out.println("transfer done successfully");
        fin.close();
        fout.close();


    }
}
//FileReader class will create input stream
//FileWriter class will create output stream