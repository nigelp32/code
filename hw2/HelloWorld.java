import java.util.Scanner;
public class HelloWorld { 
    public static void main (String[] args) {    
     System.out.println ( " Hello, What is your name? ");
	  Scanner username  = new Scanner (System.in);
	System.out.println(" Hello " +username.nextLine() +"!"); 
    }
}
