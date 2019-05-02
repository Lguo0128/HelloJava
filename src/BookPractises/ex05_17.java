package BookPractises;

import java.util.Scanner;

/* 显示金字塔：输入1到15之间的整数，然后显示一个金字塔形状的图案

\Enter the number of lines: 7
                    1
                 2  1  2
              3  2  1  2  3
           4  3  2  1  2  3  4
        5  4  3  2  1  2  3  4  5
     6  5  4  3  2  1  2  3  4  5  6
  7  6  5  4  3  2  1  2  3  4  5  6  7

Process finished with exit code 0

*/
public class ex05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lines = input.nextInt();

        for(int count = 1;count<=lines;count++){
//            打印金字塔左边的空格
            for(int leftBlanks = lines-count;leftBlanks>0;leftBlanks--){
                System.out.print("   ");
            }
            //打印金字塔左边部分
            for(int left = count;left>0;left--){
                System.out.printf("%3d",left);
            }
            //打印金字塔中到右边部分
            for (int right =2;right<count+1;right++){
                System.out.printf("%3d",right);
            }
            System.out.println();
        }
    }
}
