public class assignment21 {
    public static void Swapping(int x, int y) {
        System.out.println("before swappping "+x+" "+y);
        //swapping using xor
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.println("after swappping "+x+" "+y);
    }
    /*-x = ~x + 1;
    -~x = x + 1 (by replacing x by ~x) */
    public static void addOneToNumber(int n) { //important
        int n1 = -(~n);
        System.out.println(n1);
    }
    public static void main(String args[]) {
        //Swapping(3,4);
        addOneToNumber(4);

    }
}
