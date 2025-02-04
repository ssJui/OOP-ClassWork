import java.util.*;

public class Scale {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        double C = sc.nextDouble();
        sc.close();

        double F = (C * 9/5) + 32;

        System.out.println(F);

    }
}
