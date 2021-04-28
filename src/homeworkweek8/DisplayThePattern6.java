package homeworkweek8;

import java.util.Scanner;

/*Write a program in Java to display the pattern like a triangle with a number.
 For eg.
 Input number of rows: 10
 Expected Output:
 1
 12
 123
 1234
 12345
 123456
 1234567
 12345678
 123456789
 12345678910

 */
public class DisplayThePattern6 {

//instance method
    void disp () {
        int a, b;// declare variable

          /*
          int c;
         System.out.print("Enter number of rows : ");
         Scanner sca = new Scanner(System.in);
         c = sca.nextInt();
         */

        for (a = 1; a <= 10; a++){// for loop statement
            for(b=1; b<=a; b++)
                System.out.print(b);// print statement
            System.out.println("");// print statement
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number of rows : ");// print statement
        Scanner sca = new Scanner(System.in);//import Scanner class
        int c = sca.nextInt();// read user input

        DisplayThePattern6 obj = new DisplayThePattern6();// creat object using a class name
        obj.disp();//object for calling instance method
    }
}
