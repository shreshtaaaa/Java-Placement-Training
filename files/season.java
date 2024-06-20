//dsiplay season of any month
//note.. spring-march to may
//summer-june to august
//autumn-sept to nov
//winter-dec to feb
import java.util.Scanner;

public class season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month number (1-12): ");
        int month = scanner.nextInt();

        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Invalid month";
        }

        System.out.println("Season: " + season);
    }
}
