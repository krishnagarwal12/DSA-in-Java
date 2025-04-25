public class gridWays {
    public static int gridWays(int i, int j, int n, int m) {
        //base case
        if(i==n-1 && j==m-1) { //condition for last cell
            return 1;
        }
        else if(i==n || j==m) { //boundary cross condition
            return 0;
        }
        //kaam
        int w1 = gridWays(i+1,j,n,m); //down jaiga
        int w2 = gridWays(i,j+1,n,m); //right jaiga
        return w1+w2;
    }

    public static void main(String args[]) {
        int n=3,m=3;
        System.out.println("No. of ways = "+gridWays(0,0,n,m));
    }
    
}
