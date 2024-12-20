import java.util.*;

public class Circle {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        sc.close();

        double area = Math.PI * Math.pow(radius, 2);

        System.out.println(area);

    }
}
