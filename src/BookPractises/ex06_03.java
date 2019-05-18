package BookPractises;

import com.sun.image.codec.jpeg.TruncatedFileException;
import sun.font.TrueTypeFont;

import java.util.Scanner;

public class ex06_03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = input.nextInt();
        System.out.println("The reversal number is "+reverse(num));
        if(isPalindrome(num))
            System.out.println("This is a palindrome number.");
        else
            System.out.println("This is not a palindrome number");
    }

    //Return the reversal of an integer, i.e., reverse(456) returns 654
    private static int reverse(int number){
        int reverseNumber = number % 10;
        number = number / 10;
        while(number >0){
            reverseNumber = reverseNumber * 10 + (number % 10);
            number = number / 10;
        }
        return reverseNumber;
    }

    //Return true if number is a palindrome
    private static boolean isPalindrome(int number){
        return reverse(number) == number;
    }
}
