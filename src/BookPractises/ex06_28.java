package BookPractises;

public class ex06_28 {
    public static void main(String[] args){
        System.out.printf("%5s%15s\n","p","2^p-1");
        System.out.println("---------------------------------");
        printMersenneiPrimeNumbers(31);
    }

    private static void printMersenneiPrimeNumbers(int numberOfPrimes){
        int count = 2;
        //Repeatedly find prime numbers
        while (count <= numberOfPrimes){
            // Print the prime number and increase the count
            if(isPrime(Math.pow(2,count)-1)){
                System.out.printf("%5d%15d\n",count,(int)(Math.pow(2,count)-1));
                }
            //check whether the next number is prime
            count++;
        }
    }

    /** Check whether number is prime */
    private static boolean isPrime(double number){
        for(int divisor = 2; divisor <= number / 2; divisor++){
            if(number % divisor == 0){  // If true. number is not prime
                return false;
            }
        }
        return true;    // Number is prime
    }

}

