public class Avg {
    public static void main(String[] args) {
        
        double[] numbers = {10.5, 20.3, 30.7, 40.2, 50.0}; 

        double sum = 0; 

        for (double num : numbers) {
            sum += num;
        }

        double average = sum / numbers.length;

        System.out.println("The average is: " + average);
    }
}
