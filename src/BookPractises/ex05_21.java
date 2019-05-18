package BookPractises;

import java.util.Scanner;

/* (财务应用程序：比较不同利率下的贷款)编写程序，让用户输入贷款总额和以年为单位的贷款
    期限，然后显示利率从 5% 到 8% ，每次递增 1/8 的过程中，每月的支付额和总支付额。下面是
    一个运行示例：

Loan Amount: 10000
Number of Years: 5
Interest Rate    Monthly Payment    Total Payment
5.000%           $188.71             $11322.74
5.125%           $189.29             $11357.13
5.250%           $189.86             $11391.59
...
7.875%           $202.17             $12129.97
8.000%           $202.76             $12165.84

Process finished with exit code 0


*/
public class ex05_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int years = input.nextInt();

        double monthlyPay, totalPay;

        System.out.println("Interest Rate    Monthly Payment    Total Payment ");
        for(double rate = 5;rate <= 8;rate = rate + 1.0/8){
            monthlyPay = loanAmount * (rate/1200) / (1 - 1 / Math.pow(1 + (rate/1200),years * 12));
            totalPay = monthlyPay * years * 12;
            System.out.printf("%2.3f%%           $%4.2f             $%6.2f\n",rate,monthlyPay,totalPay);
        }
    }
}
