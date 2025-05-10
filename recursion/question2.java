//print numbers from n to 1 (increasing order)
public class question2 {

    public static void printInc(int n) {
        //base case
        if(n==1) {
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]) {
        int n=5;
        printInc(n);
    }
}
