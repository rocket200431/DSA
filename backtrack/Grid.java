package backtrack;

public class Grid {
    public static int noOfwaysGrid(int grid[][],int row,int col){
        if((row==(grid.length-1))&&(col==(grid[0].length-1))){
            return 1;
        }
     
        if(row==grid.length){
            return 0;
        }
        if(col==grid[0].length){
            return 0;
        }

      int n=noOfwaysGrid(grid, row+1, col);
      int m=noOfwaysGrid(grid, row, col+1);
      return n+m;

    }


    // we can do this sum by linear by appyling mathematics formula of permutations and combinations
    // for each grid then will be n-1 right steps and m-1 leftsteps as there we make a string of n-1+m-1 length in which we have to permutate the strings in which formula is (n-1+m-1)!/n-1!*m-1!-o(n) time factorail



    public static void main(String[] args) {
        int grid[][]=new int[3][3];
        System.out.println("no of ways for a grid is"+noOfwaysGrid(grid, 0, 0));
    }
    
}
