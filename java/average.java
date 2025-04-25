import java.util.*;
public class average {
    public static double avg(double a, double b, double c) {
        double average = (a+b+c)/3;

        return average;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double avg = avg(a,b,c);
        System.out.println(avg);

   }
}
