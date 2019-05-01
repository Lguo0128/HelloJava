package BookPractises;

import java.util.Scanner;

public class ex03_09 {
    public static void main (String[] args){
        // create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = input.nextInt();
        int d9,d8,d7,d6,d5,d4,d3,d2,d1,d10;
        d9 = isbn % 10;
        d8 = isbn / 10 % 10;
        d7 = isbn / 100 % 10;
        d6 = isbn / 1000 % 10;
        d5 = isbn / 10000 % 10;
        d4 = isbn / 100000 % 10;
        d3 = isbn / 1000000 % 10;
        d2 = isbn / 10000000 % 10;
        d1 = isbn / 100000000;

        d10 = (d1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;

        if(d1==0){
            if(d10!=10){
                System.out.println("The ISBN-10 number is 0"+d2+d3+d4+d5+d6+d7+d8+d9+d10 );
                }
            else{
                System.out.println("The ISBN-10 number is 0" +d2+d3+d4+d5+d6+d7+d8+d9+"X" );
            }
        }
        else{
            if(d10!=10){
                System.out.println("The ISBN-10 number is "+d1+d2+d3+d4+d5+d6+d7+d8+d9+d10 );
            }
            else{
                System.out.println("The ISBN-10 number is " +d1+d2+d3+d4+d5+d6+d7+d8+d9+"X" );
            }
        }

    }
}
