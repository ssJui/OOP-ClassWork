public class OddEven {
    public static void main(String[] args) {
        
        int[] numbers = {10, 23, 45, 66, 78, 91, 34, 55, 89, 100}; 

        int evenCount = 0, oddCount = 0; 

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++; 
            } else {
                oddCount++; 
            }
        }

        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
    }
}
