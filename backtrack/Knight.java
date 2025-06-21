package backtrack;

public class Knight {
    
    public static boolean knight(int board[][],boolean visited[][],int row,int col,int count){

        if(count==board.length*board[0].length){
            printBoard(board);
            return true;
        }
        if((row>=board.length)||(col>=board[0].length)||(row<0)||(col<0)||(visited[row][col])){
            return false ;
        }
        

             
                    board[row][col]=count;
                    visited[row][col]=true;
                    int rowArr[]={-1,-1,1,1,-2,-2,2,2};
                    int colArr[]={2,-2,2,-2,1,-1,1,-1};

               for(int i=0;i<rowArr.length;i++){
                
                 if(knight(board, visited, row+rowArr[i], col+colArr[i], count+1)){
                    return true;
                 }
               }     
               
               board[row][col]=0;
               visited[row][col]=false;
               return false;




    }
     public static void printBoard(int [][]board){
        System.out.println("--------CHESS BOARD--------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int board[][]=new int[8][8];
        boolean visited[][]=new boolean[8][8];
        knight(board, visited, 0, 0, 0);
    }
}
