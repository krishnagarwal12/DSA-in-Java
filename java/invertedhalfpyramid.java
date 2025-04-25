public class invertedhalfpyramid {
    public static void main(String args[]) {
        int i;
        int j;
        int k;

        for(i=4;i>=1;i--) {
            for(j=1;j<=4;j++) {
                if(j==i){
                    for(k=j;k<=4;k++) 
                    {
                       System.out.print("*");
                    }
                }
                else {
                    System.out.print(" ");
                }
                
            }
            
            System.out.println();
        }
    }
    
}
