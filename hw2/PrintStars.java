public class PrintStars {
    public static void main(String[] args) {
	int w,i,s,j,n;
	n = Integer.parseInt(args[0]);
	w = n;
	
	for (i=1 ;i<=n ; ++i) {
   	for ( s=w; s>1; --s) {
	
   		 System.out.print(" ");
	}
	 for (j=1; j<=i; ++j) {
		System.out.print("*");	

	}
	System.out.println();
	w = w-1;
    }

  }
}		

