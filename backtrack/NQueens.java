package backtrack;

public class NQueens {
public static int count=0;
    // public static void  nqeenNoconstriains(char board[][],int row){
      
    //     if(row==board.length){
    //         count++;
    //       printBoard(board);
          
    //       return  ;
    //     }
       
    //     for(int j=0;j<board.length;j++){
    //          if(isSafe(board, row, j)){
    //         board[row][j]='Q';
    //         nqeenNoconstriains(board, row+1);
            
    //        }
    //         board[row][j]='X';

            
    //     }
       
    // }
    


    // for one solution

     public static boolean nqeenNoconstriains(char board[][],int row){
      
        if(row==board.length){
            count++;
          return true; 
        }
       
        for(int j=0;j<board.length;j++){
            
             if(isSafe(board, row, j)){
                 board[row][j]='Q';
                if(nqeenNoconstriains(board, row+1)){
                   return true;
                }
                board[row][j]='X';
              }
           
         }
         return false; 
        }
       
    
    

    public static void printBoard(char [][]board){
        System.out.println("--------CHESS BOARD--------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][],int row,int col){
        // vertically up
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
       if( board[i][j]=='Q') {return false;}

        }
        //vertically  right up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){return false;}
        }
        // diagionally right
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){return false;}
        }
        return true;
        

    }

    public static void main(String[] args) {
        char board[][]=new char[4][4];

        for(int i=0;i<board.length;i++){

           
            for(int j=0;j<board.length;j++){
                board[i][j]='X';
            }
        }
        
       
        System.out.println("the no of ways are :"+count);
      if(nqeenNoconstriains(board, 0)){
        printBoard(board);
      }else{
        System.out.println("not possible case");
         printBoard(board);
      }
        
    }
}
