import java.io.File;

public class readFile {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "newfile.txt";

        // Create a File object
        File file = new File(filePath);

        // Check if the file can be read
        if (file.exists() && file.canRead()) {
            System.out.println("File " + filePath + " can be read.");
        } else {
            System.out.println("File " + filePath + " cannot be read.");
        }
    }
}
