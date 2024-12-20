import java.util.*;

public class eqTriangle {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        double arm = sc.nextDouble();
        sc.close();

        double area = (Math.sqrt(3) / 4) * Math.pow(arm, 2);

        System.out.println(area);

    }
}
