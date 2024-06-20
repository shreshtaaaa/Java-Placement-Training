import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class transferData {

    public static void main(String[] args) {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try {
            int i;
            fin = new FileInputStream("abc.txt"); // Open existing file for reading
            fout = new FileOutputStream("pqr.txt"); // Create or overwrite file for writing

            // Read from fin and write to fout
            while ((i = fin.read()) != -1) {
                System.out.print((char) i); // Print character to console
                fout.write(i); // Write character to output file
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e.getMessage());
        } finally {
            // Close the file input stream
            if (fin != null) {
                try {
                    fin.close();
                } catch (IOException e) {
                    System.out.println("Error closing input file: " + e.getMessage());
                }
            }
            // Close the file output stream
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    System.out.println("Error closing output file: " + e.getMessage());
                }
            }
        }
    }
}



// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.io.FileOutputStream;
// import java.io.IOException;

// public class transferData {

//     public static void main(String[] args) throws IOException,FileNotFoundException {
//         int i;
//         FileInputStream fin=new FileInputStream("abc.txt"); //in write mode file will automatically be created
//         FileOutputStream fout=new FileOutputStream("pqr.txt");
//         while((i=fin.read())!=-1)
//        { 
//         System.out.print((char)i);
//     } //if we dont write char it return ascii value of the file
//         fin.close();
//     }
// }

