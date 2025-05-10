public class xPowern {

    public static int power(int x, int n) {
        //base case
        if(n==0) {                      
            return 1;
        }
        
        int ans = x * power(x,n-1);
        return ans;
    }

    public static int optimizedPower(int x, int n) {
        //base case
        if(n==0) {
            return 1;
        }

        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        //n is odd
        if(n%2 != 0) {
            halfPowerSq = x*halfPowerSq;
        }

        return halfPowerSq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(optimizedPower(x,n));
    }
}
