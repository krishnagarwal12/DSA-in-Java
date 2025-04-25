public class bintodec {
    public static void btod(int binNum) {
        int n = binNum;
        int dec = 0;
        int pow = 0;
        int lastDigit = 0;

        while(binNum>0) {
            lastDigit = binNum%10;
            dec = dec+(lastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }

        System.out.println("bin to dec of "+ n + " is "+ dec);
    }

    public static void main(String args[]) {
        btod(101);

    }
    
}
