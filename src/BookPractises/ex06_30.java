package BookPractises;

/**
     (游戏：双骰子赌博)掷双骰子游戏是赌场中非常流行的骰子游戏。编写程序，玩这个游戏的一
     个变种，如下所示：
         掷两个骰子。每个骰子有六个面，分别表示值1，2，……，6。检查这两个骰子的和。如果和
     为2、3或12(称为掷骰子(craps))，你就输了；如果和是7或者11(称作自然(natural))，你
     就赢了；但如果和是其他数字（例如：4、5、6、8、9或者10），就确定了一个点。继续掷骰子，
     直到掷出一个7或者掷出和刚才相同的点数。如果掷出的是7，你就输了。如果掷出的点数和你
     前一次掷出的点数相同，你就赢了。
     程序扮演一个独立的玩家。下面是一些运行示例。
     --------------------------
     You rolled 6 + 1 = 7
     You win
     --------------------------
     You rolled 6 + 6 = 12
     You lose
     --------------------------
     You rolled 5 + 4 = 9
     point is 9
     You rolled 6 + 3 = 9
     You win
     --------------------------
     You rolled 4 + 1 = 5
     point is 5
     You rolled 4 + 3 = 7
     You lose
     --------------------------

 */

public class ex06_30 {
    public static void main(String[] args) {
        int point = printPoint();
        if (point == 2 || point == 3 || point == 12) {
            System.out.println("You lose");
        } else if (point == 7 || point == 11) {
            System.out.println("You win");
        } else {
            System.out.println("point is " + point);
            int total = printPoint();
            while (total!=7 && total!=point){
                total = printPoint();
            }
            if (total == 7) {
                System.out.println("You lose");
            } else if (total == point) {
                System.out.println("You win");
            }
        }
    }

    private static int rollDice() {
        return (int) (Math.random() * 100 % 6) + 1;
    }

    private static int printPoint(){
        int dice1 = rollDice();
        int dice2 = rollDice();
        int point = dice1 + dice2;
        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + point);
        return point;
    }
}