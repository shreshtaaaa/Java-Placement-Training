//write a java program to create a new file and print the output as "file created successfully" 
import java.io.File;
import java.io.IOException;
public class createFile {
    public static void main(String[] args) {
        String filename= "newfile.txt";
        try {
            File myFile = new File(filename);
            if (myFile.createNewFile()) {
                System.out.println("File created successfully" +myFile.getName());
                } else {
                    System.out.println("File already exists");
                    }
                    } 
            catch (IOException e) {
                        System.out.println("An error occurred");
                        e.printStackTrace();
                        }
                        
                    
    }
}
