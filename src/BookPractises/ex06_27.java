package BookPractises;

import java.util.Scanner;

public class ex06_27 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many reveseNumber you want: ");

        printPrimeNumbers(input.nextInt());
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

    //
    private static void printPrimeNumbers(int numberOfPrimes){
        final int NUMBER_OF_PEIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;

        //Repeatedly find prime numbers
        while (count < numberOfPrimes){
            // Print the prime number and increase the count
            if(isPrime(number)&&isPrime(reverse(number))){
                count++; // Increase the count
                if (count % NUMBER_OF_PEIMES_PER_LINE == 0){
                    //Print the number and advance to the new line
                    System.out.printf("%-10s\n",number);
                }
                else
                    System.out.printf("%-10s",number);
            }

            //check whether the next number is prime
            number++;
        }
    }

    /** Check whether number is prime */
    private static boolean isPrime(int number){
        for(int divisor = 2; divisor <= number / 2; divisor++){
            if(number % divisor == 0){  // If true. number is not prime
                return false;
            }
        }
        //If true. number is not Palindrome prime
        return !isPalindrome(number);
        // Number is prime
    }
}
