import java.util.Scanner;
public class OutputLoop {
    public static void main (String[] args) {
        System.out.println(" Input a number ");
        Scanner num1  = new Scanner (System.in);
        int count, num;
        count = 1;
        num = num1.nextInt();
        while(count!=num){
        System.out.println(count);
        count++;
        }
    }
 
}

