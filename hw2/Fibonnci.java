public class Fibonnci{
    public static void main(String[] args) {
	int num,fib;
	num = Integer.parseInt(args[0]);
	
	
	if (num<0) {
	   System.out.println(" Error: You entered a negative number ");
	   return;		
	}
	else if (num == 0) {
	            fib= num;
		    System.out.println(" Fib (" + num + ") is " + fib);}
	else  if ( num==1 ){
	            fib= num;
		    System.out.println(" Fib (" + num + ") is " + fib);}
	 else {  
	        fib = (num -1) + (num-2);
		
			System.out.println( "Fib (" + num + ") is " + fib); 
		     }
	}
}
	
	   
	
    
