package Seminar2;

import java.util.Arrays;

public class floodFill {

    public static void main(String[] args) {

        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1, sc = 1, color = 2;
        if (color != image[sr][sc]) {
            dfs(sr, sc, color, image[sr][sc], image);
        }

        System.out.println(Arrays.deepToString(image));
    }

    public static void dfs(int sr, int sc, int color, int color1, int[][] image) {

        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != color1) {
            return;
        }
        if (image[sr][sc] == color1) {
            image[sr][sc] = color;

            dfs(sr - 1, sc, color, color1, image);
            dfs(sr + 1, sc, color, color1, image);
            dfs(sr, sc - 1, color, color1, image);
            dfs(sr, sc + 1, color, color1, image);

        }
    }
}
