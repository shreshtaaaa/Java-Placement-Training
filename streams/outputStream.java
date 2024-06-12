//read and write streams
//whatever is reading input is read stream and delivering output is write stream.. but these are limited to console only..
//with read and write streams we can direct the output to any webpage or file or anywhere and is not just limited to console
//stream-> flow of data
//class->FileInputStream-System.in, FileOutputStream-System.out
//BufferedReader-System.in, BufferedWriter-System.out

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class outputStream{
    public static void main(String[] args) throws IOException,FileNotFoundException {
        FileOutputStream fout=new FileOutputStream("abc.txt"); //in write mode file will automatically be created
        String z="this is my new file";
        byte[] z1 =z.getBytes();
        fout.write(z1);
        System.out.println("write operation successful");
        fout.close();
    }
}