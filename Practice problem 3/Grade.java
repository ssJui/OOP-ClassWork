import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's letter grade (e.g., 3.5): ");
        double letterGrade = scanner.nextDouble();

        System.out.print("Has the student completed the semester? (true/false): ");
        boolean semesterCompleted = scanner.nextBoolean();

        if (letterGrade >= 3.5) {
            if (semesterCompleted) {
                System.out.println("Congratulations! You have received a medal!");
            } else {
                System.out.println("Complete the semester to receive a medal.");
            }
        } else {
            System.out.println("Sorry, you need a higher letter grade to receive a medal.");
        }

        System.out.print("\nEnter percentage of target sales achieved: ");
        double salesPercentage = scanner.nextDouble();

        System.out.print("Enter attendance percentage: ");
        double attendancePercentage = scanner.nextDouble();

        double bonus = 0; 

        if (salesPercentage >= 95) {
            if (attendancePercentage == 100) {
                bonus = 60;
            } else if (attendancePercentage >= 90) {
                bonus = 40;
            }
        } else if (salesPercentage >= 80) {
            if (attendancePercentage == 100) {
                bonus = 40;
            } else if (attendancePercentage >= 90) {
                bonus = 20;
            }
        } else {
            bonus = 5;
        }

        System.out.println("You have received a " + bonus + "% bonus! 🎉");

        scanner.close();
    }
}
