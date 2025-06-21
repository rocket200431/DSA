package backtrack;

public class SodukuSolver {
    public static boolean isSafe(int grid[][],int row,int col,int digit){
        for(int i=0;i<9;i++){
            if(grid[row][i]==digit){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(grid[i][col]==digit){
                return false;
            }
        }
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(grid[sr][sc]==digit){
                    return false;
                }

            }
        }

        return true;

    }

    public static boolean sodoku(int grid[][],int row,int col){
        if(row==9&&col==0){
            return true;
        }
         int nextrow=row,nextcol=col+1;
         if(col+1==9){
            nextrow=row+1;
            nextcol=0;
         }
         if(grid[row][col]!=0){
            return sodoku(grid, nextrow, nextcol);
         }
         for(int digit=1;digit<=9;digit++){
            if(isSafe(grid,row,col,digit)){
                grid[row][col]=digit;
                if(sodoku(grid, nextrow, nextcol)){
                    return true;
                }
                grid[row][col]=0;
            }
            
         }
          return false;
    
    }
    public static void printBoard(int [][]board){
        System.out.println("--------CHESS BOARD--------");
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int board[][] = {{5,3,0,0,7,0,0,0,0},
        {6,0,0,1,9,5,0,0,0},
        {0,9,8,0,0,0,0,6,0},
        {8,0,0,0,6,0,0,0,3},
        {4,0,0,8,0,3,0,0,1},
        {7,0,0,0,2,0,0,0,6},
        {0,6,0,0,0,0,2,8,0},
        {0,0,0,4,1,9,0,0,5},
        {0,0,0,0,8,0,0,7,9}};

        if(sodoku(board, 0, 0)){
            printBoard(board);
       
        }else{
            System.out.println("not printed");
        }

    }
   
}
