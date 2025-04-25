public class merge_sorted_array {
    public static void main(String args[]) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int x1=nums1.length;
        int n=nums2.length;
        int i=2;
        int x=x1-1;
        int j=n-1;
        while(i>=0 && j>=0) {
            if(nums1[i]>nums2[j]) {
                nums1[x]=nums1[i];
                x--;
                i--;
            }
            else{ 
                nums1[x]=nums2[j];
                x--;
                j--;
            }
        }
        for(int k=0;k<x1;k++) {
            System.out.println(nums1[k]);
        }
    }
}
