package Alishev.java.Arrays;

public class Test {
    public static void main(String[] args) {
int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
int x,y;
for (x=0;x< mat.length;x++){
    for (y=0;y< mat[x].length;y++) {
        System.out.print(mat[x][y] + " ");
    }
    System.out.println();
}



    }
}


