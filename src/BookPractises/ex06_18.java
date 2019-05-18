package BookPractises;

import java.util.Scanner;

public class ex06_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password to check if it is valid: ");
        String pwd = input.next();
        if(isValidPassword(pwd))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }

    //Return true if the password is valid
    private static boolean isValidPassword(String pwd){
        int countNum=0;
        if(pwd.length()>=8){
            for(int index =0; index <pwd.length();index++){
                if(!Character.isLetterOrDigit(pwd.charAt(index))) {
                    return false;
                }
            }
            for(int index =0; index <pwd.length();index++){
                if(Character.isLetter(pwd.charAt(index))) {
                    break;
                }
            }
            for (int index = 0; index < pwd.length(); index++){
                if(Character.isDigit(pwd.charAt(index))){
                    countNum++;
                }
            }
            return countNum >= 2;
        }
        return false;
    }
}
