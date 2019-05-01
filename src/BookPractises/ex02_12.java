package BookPractises;
import java.util.Scanner;

public class ex02_12 {
    public static void main (String[] args){
        // create a Scanner
        Scanner input = new Scanner(System.in);
        //Receive the Celsius
        System.out.print("Enter speed and acceleration: ");
        double spd = input.nextDouble();
        double acc = input.nextDouble();

        double runway = Math.pow(spd,2) / (2 * acc);
        System.out.println("The minimum runway length for this airplane  is " + runway);

    }
}
