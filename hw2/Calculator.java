import java.util.Scanner;
public class Calculator {
    public static void main (String[] args) {
	int num1, num2, sum;
        System.out.println ( "Please input the first number ");
        Scanner n1 = new Scanner (System.in);
        num1 = n1.nextInt ();
        System.out.println (" Please input the secound number ");
	num2= n1.nextInt ();
        sum = num1 + num2;
	System.out.print (" The total of the two numbers you entered is "  +sum  +"   " );
        

     }



}


             
            
