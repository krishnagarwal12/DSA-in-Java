public class hollowrectangle {
    public static void main(String args[]) {
        System.out.println("*****");
        int i;
        int j;

        for(i=1;i<=4;i++) {
            for(j=1;j<=5;j++) {
                if(j==1 || j==5) {
                    System.out.print("*");

                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
        System.out.println("*****");
        
    }
}
