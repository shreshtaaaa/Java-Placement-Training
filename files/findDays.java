//no of days in the given month of any year
public class findDays {
    public static void main(String[] args) {
        int month = 2; // Month to be checked (1-12)
        int year = 2024; // Year
        int numDays = 0; // To store the number of days

        // Check for leap year
        boolean isLeapYear=(year%4 ==0 && year%100 !=0) || (year%400 == 0);

        // Calculate the number of days in the month
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (isLeapYear) {
                    numDays = 29;
                } else {
                    numDays = 28;
                }
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }

        // Print the number of days
        System.out.println("Number of days in month " + month + " of year " + year + " is " + numDays);
    }
}
