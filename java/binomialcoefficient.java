import java.util.*;
public class binomialcoefficient {
    //calculate the binomial coefficient using function
    public static double factorial(int a) {
        int f =1;
        for (int i=1;i<=a;i++) {
            f=f*i;
        }
        return f;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 nos.");
        int n = sc.nextInt();
        int r = sc.nextInt();
        double f1 = factorial(n);
        double f2 = factorial(r);
        double f3 = factorial(n-r);
        double f = f1/(f2*f3);
        System.out.println("Binomial coefficient is "+f);
    }
    
}
