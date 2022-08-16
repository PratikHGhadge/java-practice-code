package com.company.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        System.out.println(pathRetDiagonal("", 3,3));

        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        allPathPrint("", board, 0, 0, path, 0);
    }


    static int count(int r, int c){
        if (r==1 || c==1){
            return 1;
        }
        int left = count(r-1, c);
        int right = count(r, c-1);
        return left+right;
    }

    static void path(String p, int r, int c){
        if (r==1 && c==1){
            System.out.println(p);
            return;
        }
        if (r>1){
            path(p+"D", r-1, c);
        }
        if (c>1){
            path(p+"R", r, c-1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c){
        if (r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r>1){
            list.addAll(pathRet(p+"D", r-1, c));
        }
        if (c>1){
            list.addAll(pathRet(p+"R", r, c-1));
        }
        return list;
    }

    static ArrayList<String> pathRetDiagonal(String p, int r, int c){
        if (r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r>1 && c>1){
            list.addAll(pathRetDiagonal(p+"D", r-1, c-1));
        }
        if (r>1){
            list.addAll(pathRetDiagonal(p+"H", r-1, c));
        }
        if (c>1){
            list.addAll(pathRetDiagonal(p+"V", r, c-1));
        }
        return list;
    }

    static void pathRestrictions(String p,boolean[][] maze, int r, int c){
        if (r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }
        if (r<maze.length-1){
            pathRestrictions(p+"D", maze, r+1, c);
        }
        if (c<maze[0].length-1){
            pathRestrictions(p+"R", maze, r, c+1);
        }
    }


    static void allPath(String p,boolean[][] maze, int r, int c){
        if (r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }

        // I an considering this block in my path
        maze[r][c] = false;
        if (r<maze.length-1){
            allPath(p+"D", maze, r+1, c);
        }
        if (c<maze[0].length-1){
            allPath(p+"R", maze, r, c+1);
        }

        if (r>0){
            allPath(p+"U", maze, r-1, c);
        }

        if (c>0){
            allPath(p+"U", maze, r, c-1);
        }

        // this line is where the function will be over
        // so before the functions get removed , also remove the changes that were made by that function
        maze[r][c] = true;
    }

    static void allPathPrint(String p,boolean[][] maze, int r, int c, int[][] path, int step){
        if (r== maze.length-1 && c==maze[0].length-1){
            path[r][c] = step;
            for (int[] i: path){
                System.out.println(Arrays.toString(i));
            }
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }

        // I an considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;
        if (r<maze.length-1){
            allPathPrint(p+"D", maze, r+1, c, path, step+1);
        }
        if (c<maze[0].length-1){
            allPathPrint(p+"R", maze, r, c+1,  path, step+1);
        }

        if (r>0){
            allPathPrint(p+"U", maze, r-1, c,  path, step+1);
        }

        if (c>0){
            allPathPrint(p+"U", maze, r, c-1,  path, step+1);
        }

        // this line is where the function will be over
        // so before the functions get removed , also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }

}
