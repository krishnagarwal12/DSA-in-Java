//------------------------------------QUESTION------------------------------------------
//Check if the problem can be solved and print only one solution to N queens problem

public class nQueens2 { 
    public static boolean nQueens(char board[][],int row) {
        //base case
        if(row==board.length) {
            //printBoard(board);
            count++;
            return true;
        }
        //column loop
        for(int j=0;j<board.length;j++) {
            if(isSafe(board,row,j)) {
                board[row][j]='Q';
                if(nQueens(board,row+1)){ //aap ek queen baitha diye.agar aap aur (n-1) queens bhi baitha skte ho(jo aapko yeh func se pta chal rha h) toh matlb solution is possible
                    return true;
                } //function call
                board[row][j]='x'; //backtracking step
            }
        }
        return false;
    }

    public static boolean isSafe(char board[][], int row, int col) {
        //vertical up
        for(int i=row-1;i>=0;i--) {
            if(board[i][col]=='Q') {
                return false;
            }
        }
        //diagonal left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--) {
            if(board[i][j]=='Q') {
                return false;
            }
        }
        //diagonal right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++) {
            if(board[i][j]=='Q') {
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char board[][]) {
        System.out.println("-------chessboard-------");
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board.length;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    //if we have to count the total number of ways to solve n queens
    static int count = 0;
    public static void main(String args[]) {
        int n=4;
        char board[][] = new char[n][n];
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board.length;j++) {
                board[i][j] = 'x';
            }
            System.out.println();
        }
        //nQueens(board,0);
        //System.out.println("Number of ways = "+count);

        if(nQueens(board,0)) {
            System.out.println("Solution is possible");
            printBoard(board);

        }
    }
    
    
}
