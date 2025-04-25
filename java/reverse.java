import java.util.*;

//print the reverse of a no.
public class reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int lastDigit = 0;

        while(n>0) {
            lastDigit = n%10;
            rev = (rev*10)+lastDigit;
            n=n/10;
        }
        System.out.println(rev);
        System.out.println();
    }
    
}
