package Strings;

public class shortestPath {
    public static void main(String args[]) {
        String path = "WNEENESENNN";
        findShortestPath(path);
    }

    public static void findShortestPath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // North
            if (dir == 'N') {
                y++;
            }
            // South
            else if (dir == 'S') {
                y--;
            }
            // East
            else if (dir == 'E') {
                x++;
            }
            // West
            else {
                x--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        float shortest = (float) Math.sqrt(x2 + y2);
        System.out.println(shortest);
    }

}
