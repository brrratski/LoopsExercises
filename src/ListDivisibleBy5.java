public class ListDivisibleBy5 {
    public static void main(String[] args) {
        int list1[] = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        int i, x;

        for (i = 0; i < list1.length; i++) {
            x = list1[i];
            if (x > 150) {
            } else if (x % 5 == 0) {
                System.out.println(x);
            }
        }
    }
}
