//in ascending order
public class mergeSort {

    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSorting(int arr[], int si, int ei) {
        //base case
        if(si>=ei) {
            return;
        }
        //kaam
        int mid = si+(ei-si)/2;
        mergeSorting(arr, si, mid); //for left part
        mergeSorting(arr, mid+1, ei); //for right part
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si; //iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0; //iterator for temp array

        while(i<=mid && j<=ei) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for leftover elements of left part
        while(i<=mid) {
            temp[k++] = arr[i++];
        }

        //for leftover elements of right part
        while(j<=ei) {
            temp[k++] = arr[j++];
        }

        //copying temp[] to original array
        for(k=0,i=si;k<temp.length;k++,i++) {
            arr[i] = temp[k];
        }
    }
    public static void main(String args[]) {
        int arr[] = {6,3,9,5,2,8,-2};
        mergeSorting(arr, 0, arr.length-1);
        printArr(arr);
    }
}
