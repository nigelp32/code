import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        // Idea is to represent a matrix in java
        // For example let's take the matrix below (say A),
        // 2 3 4
        // 7 8 9

       int num = Integer.parseInt(args[0]);
	int [] rz = new int[3];
        rz[0] = 2;
        rz[1] = 3;
        rz[2] = 4;

        int [] ro = new int[3];
        ro[0] = 7;
        ro[1] = 8;
        ro[2] = 9;

	
        int [][] A = new int[2][];
        A[0] = rz;
        A[1] = ro;

        for  (int i=0; i<2; i++){
		for (int j=0; j<3; j++) {
			A[i][j] =A[i][j]+ num;
	}			
}




       int numberofcolumns, numberofrows, i , j;

        numberofcolumns = A[0].length;
        numberofrows = A.length;

        for (j=0; j< numberofrows; j++) {

            for (i=0; i< numberofcolumns;i++) {
                        System.out.print(A[j][i] + " ");
                }
            System.out.println();
        }






    }
}
