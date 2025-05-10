public class tilingProblem {

    public static int tiling(int n) { //floor size = 2 x n
        //base case
        if(n==0 || n==1) {
            return 1;
        }

        //vertical choice
        int fnm1 = tiling(n-1);

        //horizontal choice
        int fnm2 = tiling(n-2);
        int totalWays = fnm1 + fnm2;

        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
}