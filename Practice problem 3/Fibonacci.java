import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        sc.close();
        
        int first = 0, second = 1; 

        System.out.print("Fibonacci Series: " + first + ", " + second);

        
        for (int i = 2; i < n; i++) {
            int next = first + second; 
            System.out.print(", " + next);
            first = second;  
            second = next;
        }
    }
}
