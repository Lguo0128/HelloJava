package BookPractises;
import java.util.Scanner;

public class ex02_06 {
    public static void main (String[] args){
        // create a Scanner
        Scanner input = new Scanner(System.in);
        //Receive the Celsius
        System.out.print("Enter a number between 0 and 1000: ");
        int num = input.nextInt();

        int digits = num % 10 + num / 10 % 10 + num / 100;
        System.out.println("The sum of the digits is " + digits);

    }
}
