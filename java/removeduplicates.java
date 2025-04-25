public class removeduplicates {
    public static void main(String args[]) {
        //int nums[]=new int[7];
        int nums[] = {0,1,1,1,2,2,3};
        int i=0,temp=0;
        for(int j=1;j<nums.length;j++) {
            if(nums[i]<nums[j]) {
                temp=nums[i+1];
                nums[i+1]=nums[j];
                nums[j]=temp;;
                i++;
            }
        }
        for(int j=0;j<=i;j++) {
            System.out.println(nums[j]);
        }
    }
    
}
