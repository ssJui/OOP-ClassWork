
public class Series {
    public static void main(String[] args) {
        System.out.println("Even numbers using for-loop:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\nOdd numbers using for-loop:");
        for (int i = 1; i <= 19; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nEven numbers using while-loop:");
        int even = 2;
        while (even <= 20) {
            System.out.print(even + " ");
            even += 2;
        }

        System.out.println("\nOdd numbers using while-loop:");
        int odd = 1;
        while (odd <= 19) {
            System.out.print(odd + " ");
            odd += 2;
        }

        System.out.println("\n\nEven numbers using do-while loop:");
        even = 2;
        do {
            System.out.print(even + " ");
            even += 2;
        } while (even <= 20);

        System.out.println("\nOdd numbers using do-while loop:");
        odd = 1;
        do {
            System.out.print(odd + " ");
            odd += 2;
        } while (odd <= 19);
    }
}
