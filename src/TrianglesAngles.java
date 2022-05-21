import java.util.Scanner;

public class TrianglesAngles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double angleA, angleB, angleC, sumAngles;

        System.out.println("Add angleA: ");
        angleA = scanner.nextDouble();

        System.out.println("Add angleB: ");
        angleB = scanner.nextDouble();

        System.out.println("Add angleC: ");
        angleC = scanner.nextDouble();

        sumAngles = angleA + angleB + angleC;

        if ((angleA > 0) && (angleB > 0) && (angleC > 0)) {
            if (sumAngles == 180) {
                System.out.println("The triangle is possible");

                if ( angleA == 90 || angleB == 90 || angleC == 90){
                    System.out.println("The triangle is right-angled");
                }else if ( angleA < 90 && angleB < 90 && angleC < 90){
                    System.out.println("The triangle is acute");
                }else  {
                    System.out.println("The triangle is obtuse");
                }

                if (angleA == 60 && angleB == 60 && angleC == 60){
                    System.out.println("The triangle is equilateral ");
                } else if ( angleA == angleB || angleB == angleC || angleC == angleA ) {
                    System.out.println("The triangle is isosceles");
                } else {
                    System.out.println("the triangle is multifaceted");
                };

            } else {
                System.out.println("The triangle is not possible");
                System.out.println("The sum of the angles should be 180");
            }


        } else {
            System.out.println("The triangle is not possible");
            System.out.println("Enter positive values for each angle! ");
        }



    }
}

