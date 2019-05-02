package BookPractises;

import java.util.Scanner;

public class ex05_01 {
    public static void main(String[] args){
        //统计正数和负数的个数然后计算这些数的平均值

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int posNum = 0;
        int negNum = 0;
        int count = 0;
        int total =0;
        int temp;
        while(input.hasNext()){
            temp = input.nextInt();
            if(temp>0){
                posNum++;
                count++;
                total = total + temp;
            }
            else if(temp<0){
                negNum++;
                count++;
                total = total + temp;
            }
            else {
                break;
            }
        }

        if(count==0){
            System.out.println("No numbers are entered except 0");
        }
        else {
            System.out.println("The number of positive is " + posNum);
            System.out.println("The number of negative is " + negNum);
            System.out.printf("The total is %f\n",(double)total);
            System.out.printf("The average is %f",((double)total / count));
        }
    }
}
