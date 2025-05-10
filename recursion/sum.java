//print sum of first n natural numbers
public class sum {
    public static int sum(int n) {
        //base case
        if(n==0) {
            return 0;
        }
        int snm1 = sum(n-1);
        int sn = n + snm1;
        return sn;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(sum(n));
    }
}
