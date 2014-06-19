public class Fib {	
	public static void main (String[] args) {
 
 	int num,a,b,c,d;
	num= Integer.parseInt(args[0]);
	a = 2;
	b = 0;
	c = 1;
	d = 0;

	
	
	if (num == 0) {
		System.out.println(" The Fib(" +num + ") is " +num);
	}
	else if (num == 1) {  
		System.out.println("The Fib (" +num + ") is " +num);

	}

	else { 
	while ( a<= num){
	d = c + b;
	b = c;
	c = d;		
	a++;
	
	}
	System.out.println(" The Fibonacci number of " +num + " is " + d);
     }
}
}
