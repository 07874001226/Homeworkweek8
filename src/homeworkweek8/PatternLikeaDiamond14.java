package homeworkweek8;

import java.util.Scanner;

/*Write a program in Java to display the pattern like a diamond.
 While loop
 *
 ***
 *****
 *******
 *********
***********
*************
***********
 *********
 *******
 *****
 ***
 *

 */
public class PatternLikeaDiamond14 {
    //Static Method
    static void pat() {
        Scanner scanner = new Scanner(System.in);//Input Scanner
        int a = scanner.nextInt();
        System.out.print("Enter Symbol : ");//Print statement
        char c = scanner.next().charAt(0);
        int b = 1;// Variables
        int d;
        while (b<=a) {//While Statement
            d = 1;
            while (d++ <= a - b) {//While body
                System.out.print(" ");
            }
            d=1;
            while (d++ <= b * 2 - 1)
            {
                System.out.print(c);// Print Statement
            }
            System.out.println();
            b++;
        }

        b = a - 1;
        while (b > 0)
        {
            d = 1;
            while (d++ <= a - b) {
                System.out.print(" ");
            }
            d = 1;
            while (d++ <= b * 2 - 1) { //While body
                System.out.print(c);
            }
            System.out.println();
            b--;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number of rows : ");//Print Statement
    PatternLikeaDiamond14.pat();//Object for Calling Static Method to Main Method

    }

}

