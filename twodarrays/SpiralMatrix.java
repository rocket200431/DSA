package twodarrays;
public class SpiralMatrix {
    public static void spiral(int matrix[][]){
        int start_row=0;
        int end_row=matrix.length;
        int start_coloumn=0;
        int end_coloumn=matrix[0].length;
        while(start_row<=end_row&&start_coloumn<=end_coloumn){
            //top
            for(int i=start_coloumn;i<=end_coloumn;i++){
                System.out.print(matrix[start_row][i]+" ");
            }
            //right
            for(int i=start_row+1;i<=end_row;i++){
                System.out.print(matrix[i][end_coloumn]+" ");

            }
            //bottom
            for(int i=end_coloumn-1;i>=start_row;i--){
                System.out.print(matrix[end_row][i]+" ");
            }

          for(int i=end_row-1;i>=start_row+1;i--){
            System.out.print(matrix[i][start_coloumn]);
          }
           start_row++;
           end_row--;
           start_coloumn++;
           end_coloumn--;
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                            {13,14,15,16}};

                            spiral(matrix);
    }
    
}
