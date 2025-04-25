public class dectobin {
    public static void dtob(int decNum) {
        int n = decNum;
        int bin = 0;
        int r= 0;
        int pow = 0;

        while(n>0) {
            r= n%2;
            bin = bin+ (r* (int)Math.pow(10, pow));
            pow++;
            n = n/2;

        }

        System.out.println("the binary conversion of "+ decNum + "is" + bin);


    }

    public static void main(String args[]) {
        dtob(5);
    }
}
