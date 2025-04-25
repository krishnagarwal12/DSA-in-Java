public class diagonalsum {
    public static void first_process(int matrix[][]) { //O(n^2)
        //iss process mai overlapping wala condition mai alag se kuch condition nhi likhna padega
        int sum=0;
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                if(i==j){
                    sum= sum+matrix[i][j];
            
                }
                else if(i+j==matrix.length-1) {
                    sum= sum+matrix[i][j];
                }
            }
        }
        System.out.println(sum);

    }

    public static void second_process(int matrix[][]) {
        int sum=0;
        for(int i=0;i<matrix.length;i++) {
            //primary diagonal
            sum = sum+ matrix[i][i];
            //secondary diagonal
            if(i != matrix.length-1-i) {
                sum = sum+ matrix[i][matrix.length-1-i];
            }
            
        }

        System.out.println(sum);
    }
    public static void main(String args[]) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}  };
        first_process(matrix);   
        second_process(matrix);               
    }
}
