package BookPractises;
import java.util.Scanner;

public class ex02_01 {
    public static void main (String[] args){
        // create a Scanner
        Scanner input = new Scanner(System.in);
        //Receive the Celsius
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

    }
}
