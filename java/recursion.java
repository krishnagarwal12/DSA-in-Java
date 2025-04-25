public class recursion {
    public static void printDec(int n) {
        if(n==1) {
           System.out.println(n);
           return;
        }
        System.out.println(n);
        printDec(n-1);
    }
    public static void printInc(int n) {
        if(n==1) {
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static int factorial(int n) {
        int fac;
        if(n==1) {
            return n;
        }
        fac = n * factorial(n-1);
        return fac;
    }
    public static int sum(int n) {
        int s;
        if(n==1) {
            return 1;
        }
        s=n+sum(n-1);
        return s;
    }
    public static int fibonacci(int n) {
        if(n==0) {
            return 0;
        }
        if(n==1) {
            return 1;
        }
        int fib=fibonacci(n-2) +fibonacci(n-1);
        return fib;
    }
    public static boolean isSorted(int arr[],int i) {
        if(i==arr.length-1) {
            return true;
        }
        if(arr[i]>arr[i+1]) {
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static int firstOccurance(int arr[],int key,int i) {
        if(i==arr.length) {
            return -1;
        }
        if(arr[i]==key) {
            return i;
        }
        return firstOccurance(arr,key,i+1);

    }
    public static int lastOccurance(int arr[],int key, int i) {
        if(i==arr.length) {
            return -1;
        }
        int isFound=lastOccurance(arr,key,i+1);
        if(isFound==-1 && arr[i]==key) {
            return i;
        }
        return isFound;
    }
    public static int xToPowerN(int x,int n) {
        if(n==0) {
            return 1;
        }
        int ans=x*xToPowerN(x,n-1);
        return ans;

    }
    public static int optimizedPower(int x,int n) { //O(logn)
        if(n==0) {
            return 1;
        }
        int halfPower=optimizedPower(x,n/2);
        int halfPowerSquare=halfPower*halfPower;
        //if n is odd
        if(n%2 != 0) {
            halfPowerSquare = x * halfPowerSquare;
        }
        return halfPowerSquare;
    }
    
    public static void main(String args[]) {
        //printDec(10);
        //printInc(5);
        //System.out.println(factorial(4));
        //System.out.println(sum(5));
        //System.out.println(fibonacci(3));
        int arr[]={1,2,5,4,6,5};
        //System.out.println(isSorted(arr,0));
        //System.out.println(firstOccurance(arr,5,0));
        //System.out.println(lastOccurance(arr,5,0));
        //System.out.println(xToPowerN(2,10));
        System.out.println(optimizedPower(2,10));

    }
}

