import java.util.Arrays;

public class Stencil {
	public static void main(Strings[] args)  {
		
		int [] rowone = new double [4];
		rowone[0] = 2;
		rowone[1] = 3;
		rowone[2] = 4;
		rowone[3] = 5;

		int [] rowtwo = new double [4];
		rowtwo[0]=  6;
		rowtwo[1] = 7;
		rowtwo[2] = 8;
		rowtwo[3] = 9;
	
		double rowthree = new double [4];
		rowthree[0] = 10;
		rowthree[1] = 11;
		rowthree[2] = 12;
		rowthree[3] = 13;
		
		double [] [] A = new double [3];
		A[0] = rowone;
		A[1] = rowtwo;
		A[2] = rowthree;	
		int i,j;
		int numberofrows, numberofcolumns;
		numberofcolumns = A[0].length;
		numberofrows = A.length;
		
		for (j=0; j < numberofrows; j++) {
			for (i=0; i < numberofcolumns; i++) {
				System.out.print( A[j] [i] + " ");
				}
			System.out.println();
		}
		
	}
}
		
