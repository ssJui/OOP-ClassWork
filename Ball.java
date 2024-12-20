import java.util.*;

public class Ball {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        sc.close();

        double Volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println(Volume);
    }
}
