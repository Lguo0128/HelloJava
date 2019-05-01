package BookPractises;
import java.util.Scanner;

public class ex02_05 {
    public static void main (String[] args){
        // create a Scanner
        Scanner input = new Scanner(System.in);
        //Receive the Celsius
        System.out.print("Enter the subtotal and a gratuity rate: ");
        int subtotal = input.nextInt();
        int gratuityRate = input.nextInt();

        double gratuity = (double)gratuityRate / 100 *subtotal;
        double total = gratuity + subtotal;
        System.out.println("The gratuity is $" + gratuity + " and total is $ " + total);

    }
}
