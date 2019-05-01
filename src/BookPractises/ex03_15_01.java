package BookPractises;

import java.util.Scanner;

public class ex03_15_01 {
    public static void main (String[] args){
        boolean again = true;
        while(again) {
            int lottery = (int) (Math.random() * 1000);

            // create a Scanner
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your lottery pick (three digits): ");
            int guess = input.nextInt();
            int lotteryDigit1 = lottery / 100;
            int lotteryDigit2 = lottery / 10 % 10;
            int lotteryDigit3 = lottery % 10;

            int guessDigit1 = guess / 100;
            int guessDigit2 = guess / 10 % 10;
            int guessDigit3 = guess % 10;

            if (lotteryDigit1 == 0)
                System.out.println("The lottery number is 0" + lotteryDigit2 + lotteryDigit3);
            else {
                System.out.println("The lottery number is " + lottery);
            }

            if (guess == lottery)
                System.out.println("Exact match: you win $10,000");
            else if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2) {
                System.out.println("ALL digits match: you win $3,000");
            } else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3
                    || guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1
                    || guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2
                    || guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1) {
                System.out.println("ALL digits match: you win $3,000");
            } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3
                    || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
                    || guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)
                System.out.println("Either any digits match: you win $1,000");
            else {
                System.out.println("Sorry");
            }
            System.out.println("If you wanna continue?(Y or N):");

            if(input.next().equals("N")){
                again = false;
            }
        }
    }
}
