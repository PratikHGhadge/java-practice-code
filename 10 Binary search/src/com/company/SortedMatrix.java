package com.company;

public class SortedMatrix {
    public static void main(String[] args) {

    }
    // search in the row provided between the col provided
    static int[] Binarysearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart<=cEnd) {
            int mid = cStart + (cEnd - cStart) /;
            if (matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if (matrix[row][mid]<target){
                cStart = mid+1;
            }else {
                cEnd = mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix, int target){
        int Row = matrix.length;
        int col = matrix[0].length;

        if (Row==1){
            return Binarysearch(matrix,0,0,col-1,target);
        }
        int rStart = 0;
        int rEnd = Row-1;
        int cMid = col/2;
        // run the loop til two rows are remaning
        while (rStart<(rEnd-1)){// while this is true it will have more then two rows
            int mid = rStart + (rEnd-rStart)/2;
            if (matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if (matrix[mid][cMid]<target){
                rStart = mid;
            }else {
                rEnd = mid;
            }
        }

        // now we have two rows
        // chek whether the target is in the col
        if (matrix[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }if (matrix[rStart+1][cMid] == target){
            return new int[]{rStart+1,cMid};
        }
        //search in 1st half
        if (target<=matrix[rStart][cMid-1]){
            return Binarysearch(matrix,rStart,0,cMid-1,target);
        }
        //search in 2st half
        if (target>=matrix[rStart][cMid+1]){
            return Binarysearch(matrix,rStart,cMid+1,col-1,target);
        }
        //search in 3st half
        if (target<=matrix[rStart+1][cMid-1]){

        }
        //search in 4st half
        if (target>=matrix[rStart][cMid-1]){

        }
        else {

        }

    }
}
