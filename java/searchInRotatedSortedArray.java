public class searchInRotatedSortedArray {
    public static int search(int arr[], int si, int ei, int target) {
        //base case
        if(si>ei) { //invalid, target not found
            return -1;
        }
        int mid = si+(ei-si)/2; //(si+ei)/2 bhi kr skte h

        //case found
        if(arr[mid]==target) {
            return mid;
        }

        //agar mid L1 pe lie krta h
        if(arr[si]<=arr[mid]) {
            //case a:l1 ke left mai hai target
            if(arr[si]<=target && target<=arr[mid] ) {
                return search(arr,si,mid-1,target);
            }

            //case b : mid ke right part mai target
            else {
                return search(arr,mid+1,ei,target);
            }
        }

        else { //if mid lies on line 2
            //case c : l2 ke right part mai target h
            if(arr[mid]<=target && target<=arr[ei]) {
                return search(arr,mid+1,ei,target);
            }
            //case d : mid ke left part pe lie krta h
            else{
                return search(arr,si,mid-1,target);
            }

        }
    }
    public static void main(String args[]) {
        int arr[] = {4,5,6,7,0,1,2};
        int target =0;
        System.out.println(search(arr,0,arr.length-1,target));
    }
}
