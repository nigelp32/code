public class NaturalNumber {
     public static void main(String[] args) {
	  int num, a, b, c;
	  num = Integer.parseInt(args[0]);
	  a = 0;
	  b = 0;
	  if ( num< 0) {
		System.out.println( "The number is a negative number");
		}
	  else if ( num == 0) {
		System.out.println(" The natural number of " +num + " is " + 0);
		}
	 else {
		
	for( c = 1; c<= num; c++) {
	b = 1 + a;
	a = b;
	}
	System.out.println( " The natural number of " + num + " is " + b);
	}
     }
}

