public class bintodec(int binNum) {
    int n = binNum;
    int decNum = 0;
    int pow = 0;
    int lastDigit = 0;

    while(binNum>0) {
        lastDigit = binNum%10;
        decNum = decNum + (lastDigit* (int)Math.pow(2,pow));
        pow++;
        binNum = binNum/10;


    }
    return decNum;
    
}


public static void main binarytodecimal(String args[]) {
    int n = bintodec(101);
    
}
