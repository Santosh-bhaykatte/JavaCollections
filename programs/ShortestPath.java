package javaCollections.programs;

public class ShortestPath {
    static int calcShortestPath(String s) {
        int x = 0, y = 0;

        for (int i = 0; i < s.length(); ++i) {
            char dir = s.charAt(i);
            if (dir == 'N') {           //North
                y++;
            } else if (dir == 'S') {    //South
                y--;
            } else if (dir == 'E') {    //East
                x++;
            } else {                    //West
                x--;
            }
        }
        double res = Math.pow(x, 2) + Math.pow(y, 2);
        return (int) Math.sqrt(res);
    }
    public static void main(String[] args) {
        String directions = "WNEENESENNN";
        System.out.println("Shortest path: "+ calcShortestPath(directions));
    }
}
