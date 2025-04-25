import java.util.*;
public class binarysearch {
    public static int binary_search(int numbers[],int key) {
        int start = 0;
        int end = numbers.length - 1;

        while(start<=end) {
            int mid = (start+end)/2;
            if(numbers[mid]==key) {
                return mid;
            }
            if(numbers[mid]<key)  {
                start = mid+1; //right
            }
            else {
                end = mid - 1; //left
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {1,4,6,3,8};
        int key = 8;
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }

        int ans = binary_search(numbers,key);
        System.out.println("the index of the key is "+ ans);
    }

    
}
