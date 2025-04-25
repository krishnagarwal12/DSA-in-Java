import java.util.*;
public class factorialfunction {
    //calculate the factorial of a no. using function
    public static int factorial(int a) {
        int f = 1;
        for(int i=1;i<=a;i++) {
            f = f*i;
        }
        return f;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = sc.nextInt();
        int f = factorial(n);
        System.out.println("Factorial is "+f);

    }
    
}
