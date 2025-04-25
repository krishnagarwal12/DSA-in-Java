public class bitmanipulation {
    public static void oddOreven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }

    public static int GetIthBit(int n, int i) {
        int bitmask = 1<<i;
        if((n & bitmask) == 0) {
            return 0;
        }
        else {
            return 1;
        }
    }

    public static int SetIthBit(int n, int i) {
        int bitmask = (n | (1<<i));
        //System.out.println(bitmask);
        return bitmask;

    }
    public static int ClearIthBit(int n, int i) {
        int bitmask = ~(1<<i);
        return (n & bitmask);
    }
    public static int UpdateIthBit(int n, int i, int newBit) { //1st process
        if(newBit == 0) {
            return ClearIthBit(n,i);
        }
        else{
            return SetIthBit(n,i);
        }
    }
    public static void update(int n, int i, int newBit) { //2nd process
        n= ClearIthBit(n,i);
        int bitmask = newBit << i;
        System.out.println(n|bitmask);

    }
    public static void ClearLastIBits(int n, int i) {
        int bitmask = (~0) << i;
        System.out.println(n & bitmask);
    }
    public static void ClearRangeOfBits(int n, int i, int j) {
        int a = (~0) << (j+1);
        int b = (1<<i) -1;
        int bitmask = a|b;
        System.out.println(n&bitmask);
    }
    public static boolean isPowerOfTwo(int n) {
        return ((n&(n-1)) == 0);
    }
    public static void CountSetBits(int n) {
        int count = 0;
        while(n>0) {
           if((n&1) !=0) { //checking our LSB(least significant bit)
            count++;
           }
           n = n>>1;
        }
        System.out.println(count);
    }
    public static void FastExpo(int a,int n) { //a=no. , n=power
        int ans=1;
        while(n>0) {
            if((n&1)!=0) {
                ans = ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        System.out.println(ans);

    }
    
    public static void main(String args[]) {
        int n=6;
        //oddOreven(n);
        //System.out.println(GetIthBit(10,3));
        //SetIthBit(10,2);
        //System.out.println(ClearIthBit(10,1));
        //System.out.println(UpdateIthBit(10,2,1));
        //update(10,2,1);
        //ClearLastIBits(15,2);
        //ClearRangeOfBits(10,2,4);
        //System.out.println(isPowerOfTwo(7));
        //CountSetBits(15);
        FastExpo(3,5);
    }
}
