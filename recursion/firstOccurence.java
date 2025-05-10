//find the first occurence of element in an array
public class firstOccurence {

    public static int firstOccurence(int arr[], int key, int i) {
        //base case
        if(i==arr.length) {
            return -1;
        }
        if(arr[i]==key) {
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,6,5};
        System.out.println(firstOccurence(arr,5,0));
    }
}
