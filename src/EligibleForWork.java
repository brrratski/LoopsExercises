import java.util.Scanner;

public class EligibleForWork {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        double age = scanner.nextDouble();

        if (age >= 16){
            System.out.println("You are eligible to work");
        }else {
            System.out.println("You are not eligible to work. You have to be at least 16 y/o");
        }
    }
}
