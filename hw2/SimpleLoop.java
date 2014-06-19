import java.util.Scanner;
public class SimpleLoop { 
    public static void main (String[] args) {
        int num;
	System.out.println( "Please input the number of asteriks");
        Scanner num1 = new Scanner (System.in);
	num = num1.nextInt();

	if ( num == 0)
		System.out.println( " No asteriks ");
        if (num == 1)
		System.out.println( " * ");
        if (num == 2) 
		System.out.println( " ** ");
	if (num == 3) 
		System.out.println( " *** ");
	if (num == 4)
		System.out.println( " **** ");
	if (num == 5)
		System.out.println( " ***** ");
	if (num == 6)
		System.out.println( " ****** ");
	if (num == 7)
		System.out.println( " ******* ");
	if (num == 8)
		System.out.println( " ******** ");
	if (num == 9)
		System.out.println( " *********");
	if (num == 10)
		System.out.println( " **********");
	else 
		System.out.println( " Please try again ");
	}
}

		
