package BookPractises;

import java.util.Scanner;

/* 打印金字塔型的数字：编写一个嵌套的for循环，打印下面的输出：
                                       1
                                  1    2    1
                             1    2    4    2    1
                        1    2    4    8    4    2    1
                   1    2    4    8   16    8    4    2    1
              1    2    4    8   16   32   16    8    4    2    1
         1    2    4    8   16   32   64   32   16    8    4    2    1
    1    2    4    8   16   32   64  128   64   32   16    8    4    2    1
*/
public class ex05_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines:（1-10） ");
        int lines = input.nextInt();

        for(int count = 0;count<lines;count++){
            //打印金字塔左边的空格
            for(int leftBlanks = lines-count-1;leftBlanks>0;leftBlanks--){
                System.out.print("     ");
            }
            //打印金字塔左边部分
            for(int left = 0;left<count;left++){
                System.out.printf("%5.0f",Math.pow(2,left));
            }
            //打印金字塔中到右边部分
            for (int right =count;right>=0;right--){
                System.out.printf("%5.0f",Math.pow(2,right));
            }
            System.out.println();
        }
    }
}
