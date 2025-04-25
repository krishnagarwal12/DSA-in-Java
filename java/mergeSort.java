public class mergeSort {
    public static void mergeSort(int arr[],int si,int ei) {
        //base case
        if(si>=ei) {
            return;
        }
        int mid = si+(ei-si)/2; //(i+ei)/2 bhi use kr skte h
        mergeSort(arr,si,mid); //for sorting the left part
        mergeSort(arr,mid+1,ei); //for sorting the right part
        merge(arr,si,mid,ei); //mergingthe left and right part
    }

    public static void merge(int arr[],int si,int mid,int ei) {
        int temp[] = new int[ei-si+1];
        int i=si; //iterator for left array
        int j=mid+1; //iterator for right array
        int k=0; //iterator for temporary array

        while(i<=mid && j<=ei) {
            if(arr[i]<arr[j]) {
                temp[k]=arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //agar kuch part bach gya h left ya right array se print hona
        while(i<=mid){ //for leftover elements of 1st sorted array
            temp[k++] = arr[i++];
        }

        while(j<=ei){ //for leftover elements of 2nd sorted array
             temp[k++] = arr[j++];
        }

        //copy temp array to original array
        for(k=0,i=si;k<temp.length;k++,i++) {
            arr[i]=temp[k];
        }
    }

    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {2,5,6,2,3,1,4};
        mergeSort(arr,0,arr.length-1);
        printArray(arr);
    }

}
