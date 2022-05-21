import java.util.Scanner;

public class WeekdaysExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayNumber;
        String daySuffix = "th";
        String dayOfWeek = null;
        System.out.println("Enter a digit between 1-7");
        dayNumber = scanner.nextInt();


        switch (dayNumber) {
            case 1:
                daySuffix = "st";
                dayOfWeek = "Monday";
                break;

            case 2:
                daySuffix = "nd";
                dayOfWeek = "Tuesday";
                break;

            case 3:
                daySuffix = "rd";
                dayOfWeek = "Wednesday";
                break;

            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:

                dayOfWeek = "Friday";
                break;
            case 6:

                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                System.out.println("This is not a valid day of week");


        }
        if (dayNumber > 0 && dayNumber < 8){
        System.out.format("The %d-%s day of the week is %s", dayNumber, daySuffix, dayOfWeek);
        }
    }
}
