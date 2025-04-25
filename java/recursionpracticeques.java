public class recursionpracticeques {
    public static void allOccurances(int arr[],int key,int i) { 
        //base case
        if(i==arr.length) {
            return;
        }
        if(arr[i]==key) {
            System.out.println(i);
        }
        allOccurances(arr,key,i+1);

    }

    public static void numberToString(int n) {
        String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        //base case
        if(n==0) {
            return;
        }
        int lastDigit = n%10;
        numberToString(n/10);
        System.out.print(digits[lastDigit]+" ");

    }

    public static int lengthOfString(String str) {
        //base case
        if(str.length()==0) {
            return 0;
        }
        String remainingStr = str.substring(1);
        return lengthOfString(remainingStr)+1;
    }

    public static void main(String args[]) {
        //int arr[] = {1,2,5,6,3,2,7,2,2};
        //allOccurances(arr,2,0);
        //numberToString(12340);
        System.out.println(lengthOfString("krishna"));
    }
}
