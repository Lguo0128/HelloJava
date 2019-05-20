/*
     (财务应用程序：信用卡号的合法性)信用卡号遵循下面的模式。一个信用卡号必须13到16
     位的整数。它的开头必须是：
     4，指Visa卡
     5，指Master卡
     37，指American Express卡
     6，指Discover卡
        在1954年，IBM的Hans Luhn提出一种算法，该算法可以验证信用卡号的有效性。这个算
     法在确定输入的卡号是否正确，或者这张信用卡是否被扫描仪正确扫描方面是非常有用的。遵
     循这个合法性检测可以生成所有的信用卡号，通常称之为Luhn检测或者Mod 10检测，可以加
     下面描述(为了方便解释，假设卡号为4388576018402626)：
        1)从卡号最后一位数字开始，偶数位乘以2，如果乘以2的结果是两位数，那么就将
     这两位加在一起得到一位数。
        2)现在将第一步得到的所有一位数相加。
            4+4+8+2+3+1+7+8=37
        3)从卡号最后一位数字开始，在奇数位上的所有数字相加。
            6+6+0+8+0+7+8+3=38
        4)将第二步和第三步得到的结果相加。
            37+38=75
        5)如果第四步得到的结果能被 10 整除，那么卡号是合法的；否则，卡号是不合法的。例
     如，号码 4388576018402626 是不合法的，但是号码 4388576018410707 是合法的。
        编写程序，提示用户输入一个 long 型整数的信用卡号码，显示这个数字是合法的还是非法
     的。使用下面的方法设计程序：
     -- Return true if the card number is valid --
     public static boolean isVa1id(long number)
     -- Get the result from Step 2 --
     public static int sumOfDoubleEvenPIace(long number)
     -- Return this number if it is a single digit, otherwise ,
     return the sum of the two digits --
     public static int getDigit(int number)
     -- Return sum of odd-place digits in number --
     public static int sumOfOddPlace(1ong number)
     -- Return true if the digit d is a prefix for number --
     public static boolean prefixMatched(1ong number, int d)
     -- Return the number of digits in d --
     public static int getSize(1ong d)
     -- Return the first k number of digits from number. If the
     number of digits in number is less than k, return number. --
     public static long getPrefix(long number, int k)
        下面是程序的运行示例：(你也可以通过将输人作为一个宇符串读人， 以及对宇符串进行处
     理来验证信用卡卡号。)
     ------------------------------------------
     Enter a credit card number as a long integer:
     4388576018410707【enter】
     4388576018410707 is valid
     ------------------------------------------
     Enter a credit card number as a long integer:
     4388576018402626【enter】
     4388576018402626 is invalid
     -----------------------------------------
 */

package BookPractises;

import java.util.Scanner;

public class ex06_31 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer:");
        long cardNum = input.nextLong();
        if(isVa1id(cardNum))
            System.out.println(cardNum + " is valid");
        else
            System.out.println(cardNum + " is invalid");
    }

    /** Return true if the card number is valid */
    private static boolean isVa1id(long number){
        if(getSize(number)>=13 || getSize(number)<=16){
            if(prefixMatched(number,37) || prefixMatched(number,4) ||
                    prefixMatched(number,5) || prefixMatched(number,6)){
                return ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10) == 0;
            }
            else
                return false;
        }
        else
            return false;
    }

    /** Get the result from Step 2 */
    private static int sumOfDoubleEvenPlace(long number){
        int sum = 0;
        int size = getSize(number);
        number = number / 10;
        for(int i = 2;i<=size;i=i+2){
            sum = sum + getDigit(2 * (int)(number % 10));
            number = number / 100;
        }
        return sum;
    }

    /** Return this number if it is a single digit, otherwise ,
    * return the sum of the two digits */
    private static int getDigit(int number){
        if(number>=10)
            return ((number / 10) + (number % 10));
        else
            return number;
    }

    /** Return sum of odd-place digits in number
     * 返回奇数位数的总和 */
    private static int sumOfOddPlace(long number){
        int sum = 0;
        int size = getSize(number);
        for(int i = 1;i<=size;i=i+2){
           sum = sum + (int)(number % 10);
           number = number / 100;
        }
        return sum;
    }

    /** Return true if the digit d is a prefix for number
     * 如果数字 d 是 number 的前缀，则返回true */
    private static boolean prefixMatched(long number, int d){
        return (d == getPrefix(number,getSize(d)));
    }

    /** Return the number of digits in d
     * 返回 d 中的位数 */
    private static int getSize(long d){
        int size =1;
        while(d/10 != 0){
            size ++;
            d = d/10;
        }
        return size;
    }

    /** Return the first k number of digits from number. If the
    * number of digits in number is less than k, return number.
     * 返回 number 的前 k 位数字。如果数字中的位数小于k，则返回数字。*/
    private static long getPrefix(long number, int k){
        int size = getSize(number);
        if(size >= k){
            return (number / (long)Math.pow(10,size-k));}
        else
            return number;
    }
}