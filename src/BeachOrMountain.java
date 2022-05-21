import java.util.Scanner;

public class BeachOrMountain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int trip = scanner.nextInt();

        switch (trip) {
            case 1:
                System.out.println("Beach");
                System.out.println("Enter you budget");
                double budget = scanner.nextDouble();
                if (budget < 50) {
                    System.out.println("Bulgaria is your destination");
                } else {
                    System.out.println("You should go outside Bulgaria ");
                }
                break;
            case 2:
                System.out.println("Mountain");
                System.out.println("Enter you budget");
                double budget1 = scanner.nextDouble();
                if (budget1 < 30) {
                    System.out.println("You should visit the Bulgarian mountains");
                } else {
                    System.out.println("You should go outside Bulgaria");
                }
                break;
            default:
                System.out.println("There is no information about this type of vacation..Enter 1 or 2! ");
                System.out.println("1 is for beach ");
                System.out.println("2 is for mountain");
        }

    }
}

