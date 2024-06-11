import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = 0;
        String trash = ""; // for bad input

        System.out.print("Enter your birth month (1-12): ");
        if (in.hasNextInt()) {
            month = in.nextInt();
            in.nextLine(); // clear the buffer
        } else {
            trash = in.nextLine(); // read as a String
            System.out.println("Invalid input. Please enter a valid month value.");
            return;
        }

        String monthName;
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid";
                break;
        }

        if (month >= 1 && month <= 12) {
            System.out.println("Your birth month is: " + monthName + " (" + month + ")");
        } else {
            System.out.println("You entered an incorrect month value: " + month);
        }
    }
}