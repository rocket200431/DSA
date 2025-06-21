package twodarrays;

public class StaircaseSearch {
    public static void search(int matrix[][],int key){
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length&&col>=0){
            if(key==matrix[row][col]){
                System.out.println("element found at  ("+row+","+col+")");

            }else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }

        System.out.println("element is not found");
    }
    public static void main(String[] args) {
        
    }
    
}
