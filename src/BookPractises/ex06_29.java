package BookPractises;


public class ex06_29 {
    public static void main(String[] args){
        System.out.printf("%5s%15s\n","p","2^p-1");
        System.out.println("---------------------------------");
        printDoublePrimeNumbers(1000);
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
    public static boolean isPalindrome(int number){
        return reverse(number) == number;
    }

    //
    private static void printDoublePrimeNumbers(int numberOfPrimes){
        int count = 0;
        int number = 2;
        int temp = 2;

        //Repeatedly find prime numbers
        while (count < numberOfPrimes){
            // Print the prime number and increase the count
            if(isPrime(number)){
                count++; // Increase the count
                if((number-temp)==2){
                    System.out.printf("(%s,%s)\n",temp,number);
                }
                temp = number;
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
        return true;    // Number is prime
    }
}
