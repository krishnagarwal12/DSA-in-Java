
//print numbers from n to 1 (decreasing order)
public class question1 {

    public static void printDec(int n) {
        //base case
        if(n==1) {
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        printDec(n);
    }
}

