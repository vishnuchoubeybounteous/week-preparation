package DSA_Day4;

import java.util.ArrayList;

public class Ques13 {
    public static boolean solveMaze(int[][] maze, int x, int y, boolean[][] solutionPath) {
        int rows = maze.length;
        int cols = maze[0].length;
        if (x<0||y<0||x>=rows||y>=cols||maze[x][y]==1) {
            return false;
        }
        if (x == rows - 1 && y == cols - 1) {
            solutionPath[x][y] = true;
            return true;
        }
        solutionPath[x][y] = true;
        if (solveMaze(maze, x, y + 1, solutionPath)) return true;
        if (solveMaze(maze, x + 1, y, solutionPath)) return true;
        if (solveMaze(maze, x, y - 1, solutionPath)) return true;
        if (solveMaze(maze, x - 1, y, solutionPath)) return true;
        solutionPath[x][y] = false;
        return false;
    }

    public static void printMaze(boolean[][] maze) {
        for (boolean[] row : maze){
            for (boolean x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] maze = {
            {0, 1, 0, 0},
            {0, 0, 0, 1},
            {1, 0, 0, 0},
            {1, 0, 1, 0}
        };

        int rows = maze.length;
        int cols = maze[0].length;
        boolean[][] sol = new boolean[rows][cols];
        if (solveMaze(maze, 0, 0, sol)) {
            System.out.println("Solution path:");
            printMaze(sol);
        } else {
            System.out.println("No path exists.");
        }
    }
}