//here file should already be existing

//here file should already be existing

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class inputStream {
public static void main(String[] args) throws IOException,FileNotFoundException {
FileInputStream fin=new FileInputStream("abc.txt"); //in write mode file will automatically be created
int i;
while((i=fin.read())!=-1)
{
System.out.println((char)i);
} //if we dont write char it return ascii value of the file
fin.close();
}
}