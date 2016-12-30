package cci.recursion_dynamic;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Q_2_Robot_Grid
{
    public static ArrayList<Point> getPath(boolean[][] maze)
    {
        ArrayList<Point> path = new ArrayList<>();

        if (getPath(maze, maze.length - 1, maze[0].length - 1, path, new HashMap<>())) {
            return path;
        }
        return null;
    }

    private static boolean getPath(boolean[][] maze, int r, int c, ArrayList<Point> path, HashMap<Point, Boolean> cache)
    {
        if (r < 0 || c < 0 || !maze[r][c]) {
            return false;
        }

        Point p = new Point(r, c);

        if (cache.containsKey(p)) {
            return cache.get(p);
        }

        boolean success = false;

        if ((r == 0 && c == 0) || getPath(maze, r - 1, c, path, cache) || getPath(maze, r, c - 1, path, cache)) {
            path.add(p);
            success = true;
        }

        cache.put(p, success);
        return success;
    }

    public static void main(String[] args)
    {
        boolean[][] maze = new boolean[4][4];

        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                maze[r][c] = true;
            }
        }

        maze[1][3] = false;
        maze[2][2] = false;

        System.out.println(getPath(maze));
    }
}
