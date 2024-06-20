//write a java prgm to get file length(size) and file path o/p-> file path is: /home/file1.txt file size is: 0 bytes
import java.io.File;

public class lengthAndPath {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "newfile.txt";

        // Create a File object
        File file = new File(filePath);

        // Check if the file exists
        if (file.exists()) {
            // Get the file path
            String absolutePath = file.getAbsolutePath();

            // Get the file length (size)
            long fileSize = file.length();

            // Print the file path and size
            System.out.println("File path is: " + absolutePath);
            System.out.println("File size is: " + fileSize + " bytes");
        } else {
            System.out.println("File does not exist.");
        }
    }
}
