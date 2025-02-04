public class Sum {
    public static void main(String[] args) {
        int evenSum = 0, oddSum = 0;

        for (int i = 2; i <= 20; i += 2) {
            evenSum += i;
        }
        for (int i = 1; i <= 19; i += 2) {
            oddSum += i;
        }
        System.out.println("Sum of even numbers using for-loop: " + evenSum);
        System.out.println("Sum of odd numbers using for-loop: " + oddSum);

        
        evenSum = 0;
        oddSum = 0;

        int even = 2;
        while (even <= 20) {
            evenSum += even;
            even += 2;
        }
        int odd = 1;
        while (odd <= 19) {
            oddSum += odd;
            odd += 2;
        }
        System.out.println("Sum of even numbers using while-loop: " + evenSum);
        System.out.println("Sum of odd numbers using while-loop: " + oddSum);

        
        evenSum = 0;
        oddSum = 0;
       
        even = 2;
        do {
            evenSum += even;
            even += 2;
        } while (even <= 20);

        odd = 1;
        do {
            oddSum += odd;
            odd += 2;
        } while (odd <= 19);

        System.out.println("Sum of even numbers using do-while-loop: " + evenSum);
        System.out.println("Sum of odd numbers using do-while-loop: " + oddSum);
    }
}
