public class reverseno {
    //print the reverse of a no.
    public static void main(String args[]) {
        int n = 120804;
        while (n>0) {
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n=n/10;
        }
        System.out.println();
    }
    
}
