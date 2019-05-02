package BookPractises;
//财务应用程序：计算将来的学费
//某大学今年学费 $10,000，学费年增长率5%。一年后学费为$10,500。
//计算10年后的学费，以及从现在开始的10年后算起，4年内总学费是多少？

public class ex05_07 {
    public static void main(String[] args){
        double standerFee = 10000;
        double rate = 5;
        int year = 0;
        double feeAtTen = 0,total=0;
        int count = 0;
        double temp;

        while(year<10) {
            feeAtTen = standerFee * (1 + rate / 100);
            year++;
            standerFee = feeAtTen;
        }

        System.out.printf("The fee after 10 years is $%10.2f \n",feeAtTen);

        //计算接下来4年内总学费
        while(count < 4){
            total = total + feeAtTen;
            temp = feeAtTen * (1 + rate / 100);
            feeAtTen = temp;
            count++;
            //显示接下来每年的学费
            //System.out.printf("The next fee is $%10.2f\n",feeAtTen);
        }
        System.out.printf("The total of 4 years fee since 10 years later is $%10.2f",total);
    }
}
