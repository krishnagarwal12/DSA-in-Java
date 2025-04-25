import java.util.*;
public class primerange {
    public static String checkPrime(int n) {
        int c=0;

        for(int i = 1;i<=n/2 ; i++) {
            if (n%i == 0) {
                c=c+1;
            }
        }
        
        if (c==1) {
            return ("PRIME");
            
        }
        else {
            return ("NOT PRIME");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter range");
        int n = sc.nextInt();
        for (int i = 2;i<=n;i++) {
            String result = checkPrime(i);
            if (result=="PRIME") {
                System.out.println(i);
            }
        }
    }
}
