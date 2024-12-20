import java.util.*;

public class Triangle{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        double height = sc.nextDouble();
        sc.close();

        double area = 0.5 * base * height;

        System.out.println(area);

    }
}