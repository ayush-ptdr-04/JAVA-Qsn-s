public class ratInMaze {

    public static void printArray(int board[][]) {
        System.out.println("-----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int maze[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 }
        };
        solveMaze(maze);
    }

    public static boolean solveMaze(int maze[][]) {
        int n = maze.length;
        int sol[][] = new int[n][n];

        if (solveMazeUtil(maze, 0, 0, sol) == false) {
            System.out.println("Solution is not exist");
            return false;
        }
        printArray(sol);
        return true;
    }

    public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {

        if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        if (isSafe(maze, x, y) == true) {
            sol[x][y] = 1;
            if (solveMazeUtil(maze, x, y + 1, sol)) {
                return true;
            }
            if (solveMazeUtil(maze, x + 1, y, sol)) {
                return true;
            }
            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    public static boolean isSafe(int maze[][], int x, int y) {
        return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
    }
}
