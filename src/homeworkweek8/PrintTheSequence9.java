package homeworkweek8;

import java.util.Scanner;

/*Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
*/
public class PrintTheSequence9 {

    void print() {//instance method
        int a = 0;// declare variable
        int b = 1;
        int c = 10;
        int d;
        int e;

        System.out.print(a+" "+b);//print statement
        for (e = 2; e < c; ++e) {//for loop statement
            d = a + b;
            System.out.print(" "+d);//print statement
            a = b;
            b = d;
        }
    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter any number");

        PrintTheSequence9 obj = new PrintTheSequence9();// instance to stsatic object
        obj.print();//object for instance method calling to static main method



    }
}

