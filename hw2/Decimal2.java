import java.io.BufferedReader;

public class Decimal2 {

    public static void main(String[] args) {

         
        int x, r;
	x = Integer.parseInt(args[0]);
	StringBuffer buf= new StringBuffer();
	
	while (x!=0) {
	    
	    r =  x%2;
	    buf.append(r);
	    x=x/2;

     	}

	buf.reverse();
	System.out.println(buf);
    }

}  
	
	        
