public class palindrome {
    public static void pali(int a) {
        int r=0;
        int n=a;
        int newNum=0;

        while(a>0) {
            r=a%10;
            newNum= (newNum* 10) + r;
            a=a/10;
        }

        if (newNum==n) {
            System.out.println(n+"is a palindrome no.");

        }
        else{
            System.out.println(n+"is not a palindrome no.");
        } 
            
    }

    public static void main(String args[]) {
        pali(123);
    }
}
