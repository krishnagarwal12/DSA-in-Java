public class trappedWater {
    public static void trapped_water(int height[]) { //time complexity = O(n)
        //steps
        //find left max boundary
        //find right max boundary
        //find water level
        //find trapped water

        //left max boundary - array
        int n = height.length;
        int left_max[] = new int[n];
        left_max[0] = height[0];
        for(int i=1 ;i<n ;i++) {
            left_max[i]= Math.max(height[i] , left_max[i-1]);
        }

        //right max boundary - array
        int right_max[] = new int[n]; 
        right_max[n-1]= height[n-1];
        for(int i=n-2;i>=0;i--) {
            right_max[i] = Math.max(right_max[i+1], height[i]);
        }

        //loop to find water level and calculate trapped water 
        int trapped_water=0;
        int water_level=0;
        for(int i = 0;i<n;i++) {
            //water level
            water_level = Math.min(left_max[i],right_max[i]);
            //trapped water
            trapped_water = trapped_water + (water_level - height[i]);  //width multiply isiliye nhi kiye as width = 1 as given in question
            
        }
        System.out.println("the amount of trapped water = "+trapped_water);
    }

    public static void main(String args[]) {
        int height[] = {4,2,0,6,3,2,5};
        trapped_water(height);
    }
}
