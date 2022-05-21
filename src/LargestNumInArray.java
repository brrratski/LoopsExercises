import java.util.Scanner;

public class LargestNumInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, max;

        System.out.print("Enter the number of elements in the array:");

        n = scanner.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {

            a[i] = scanner.nextInt();

        }

        max = a[0];

        for (int i = 0; i < n; i++) {
            if (max < a[i]) {

                max = a[i];

            }
        }
        System.out.println("Maximum value in the array is:" + max);

    }
}
