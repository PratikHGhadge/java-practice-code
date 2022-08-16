package framework;

public class triangal {
    public static void main(String[] args) {
        triangal2(4,0);
    }

    static void triangal(int row, int col){
        if (row==0) return;
        if (col<row){
            System.out.print("*");
            triangal(row, col+1);
        }else {
            System.out.println();
            triangal(row-1, 0);
        }
    }

    static void triangal2(int row, int col){
        if (row==0) return;
        if (col<row){
            triangal2(row, col+1);
            System.out.print("*");
        }else {
            triangal2(row-1, 0);
            System.out.println();
        }
    }
}
