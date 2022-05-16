package com.extremecoder;

public class NumberOfIsland_200 {
    public static void main(String[] args) {
        char[][] aa = {{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        int aaa = numIslands(aa);
        System.out.println(aaa);
    }

    public static int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    checkAndVisited(i, j, grid);
                }
            }
        }
        return count;
    }

    private static void checkAndVisited(int i, int j, char[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] != '1')
            return;
        grid[i][j] = '0';
        checkAndVisited(i, j + 1, grid);
        checkAndVisited(i, j - 1, grid);
        checkAndVisited(i + 1, j, grid);
        checkAndVisited(i - 1, j, grid);
    }
}
