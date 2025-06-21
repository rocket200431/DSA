package backtrack;

import java.util.HashMap;

public class PraticeSheet {


    //ques1
 



    // Checks if cell (x, y) is valid and open
    public static boolean isSafe(int maze[][], int x, int y,boolean visited[][]) {
        return x >= 0 && x < maze.length &&
               y >= 0 && y < maze[0].length &&!visited[x][y]&&
               maze[x][y] == 1;
    }

    // Utility function to print the path
    public static void printMaze(int[][] board) {
        System.out.println("New solution:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Backtracking function
    public static void ratMaze(int maze[][], int newMaze[][], int x, int y,boolean visited[][]) {
        if (x == maze.length - 1 && y == maze[0].length - 1) {
            newMaze[x][y] = 1;
            printMaze(newMaze);
            newMaze[x][y] = 0; // Backtrack
            return;
        }

        if (isSafe(maze, x, y,visited)) {
            newMaze[x][y] = 1;
            visited[x][y]=true;
            // Move in all directions
            ratMaze(maze, newMaze, x + 1, y,visited); // down
            ratMaze(maze, newMaze, x, y + 1,visited); // right
            ratMaze(maze, newMaze, x - 1, y,visited); // up
            ratMaze(maze, newMaze, x, y - 1,visited); // left
            visited[x][y]=false;
            newMaze[x][y] = 0; // backtrack
        }
    }
// ques 2

public static void printCombinations(String input,int i,HashMap<Character,String>hm){
    if(input==" "){
        System.out.println(" ");
        return;
    }
    if(i==input.length()){
        return;
    }
for(int  j=i+1;j<input.length();j++){
    String k=hm.get(input.charAt(i));
    String h=hm.get(input.charAt(j));
    for(int p=0;p<k.length();p++){
        char c=k.charAt(p);
        for(int q=0;q<h.length();q++){
            char w=h.charAt(q);
            System.out.print(c);
            System.out.print(w);
            System.out.println();
        }
        System.out.println();
    }

    printCombinations(input, i+1, hm);
    
}



}



    public static void main(String[] args) {
        // int maze[][] = {
        //     { 1, 0, 0, 0 },
        //     { 1, 1, 0, 1 },
        //     { 0, 1, 0, 0 },
        //     { 1, 1, 1, 1 }
        // };
        // int newMaze[][] = new int[maze.length][maze[0].length];
        // boolean visited[][] = new boolean[maze.length][maze[0].length];
        // ratMaze(maze, newMaze, 0, 0,visited);

        HashMap<Character,String>hm=new HashMap<>();
        hm.put('2', "abc");
         hm.put('3', "def");
          hm.put('4', "ghi");
           hm.put('5', "jkl");
            hm.put('6', "mno");
             hm.put('7', "pqrs");
              hm.put('8', "tuv");
               hm.put('9', "wxyz");
               String input="23";
               printCombinations(input, 0, hm);

    }
}

    



       
        
    
    

