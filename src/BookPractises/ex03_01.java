package BookPractises;
import java.util.Scanner;

public class ex03_01 {
    public static void main (String[] args){
        // create a Scanner
        Scanner input = new Scanner(System.in);
        //Receive the Celsius
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double value = b * b - 4 * a * c;

        if(value>0){
            double r1 = (Math.pow(( b * b ) - 4 * a * c,0.5) - b ) / (2 * a);
            double r2 = -(Math.pow(( b * b ) - 4 * a * c,0.5) + b ) / (2 * a);
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        }
        else if(value==0){
            double r3 = (Math.pow(( b * b ) - 4 * a * c,0.5) - b ) / (2 * a);
            System.out.println("The equation has one root " + r3);
        }
        else {
            System.out.println("The equation has no real roots.");
        }
    }
}
