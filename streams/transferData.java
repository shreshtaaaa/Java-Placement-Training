import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class transferData {

    public static void main(String[] args) throws IOException,FileNotFoundException {
        int i;
        FileInputStream fin=new FileInputStream("abc.txt"); //in write mode file will automatically be created
        FileOutputStream fout=new FileOutputStream("pqr.txt");
        while((i=fin.read())!=-1)
       { 
        System.out.println((char)i);
    } //if we dont write char it return ascii value of the file
        fin.close();
    }
}

