import java.util.*;

//write a program to find factorial of a no.
public class factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n = sc.nextInt();
        int factorial = 1;

        for(int i = 1; i<=n ;i++) {
            factorial = factorial*i;
        
        }
        System.out.println("factorial is "+factorial);
    }
    
}
