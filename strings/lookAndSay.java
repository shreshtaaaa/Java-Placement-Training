import java.util.Scanner;

public class lookAndSay {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        generateLookAndSaySequence(n);
    }

    public static void generateLookAndSaySequence(int n) {
        if (n <= 0) {
            return;
        }

        String current = "1";
        System.out.println(current);

        for (int i = 1; i < n; i++) {
            current = getNextSequence(current);
            System.out.println(current);
        }
    }

    public static String getNextSequence(String current) {
        String nextSequence = "";
        int length = current.length();
        int count = 1;

        for (int i = 1; i < length; i++) {
            if (current.charAt(i) == current.charAt(i - 1)) {
                count++;
            } else {
                nextSequence += count + "" + current.charAt(i - 1);
                count = 1;
            }
        }
        nextSequence += count + "" + current.charAt(length - 1);

        return nextSequence;
    }
}