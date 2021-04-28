package homeworkweek8;

import java.util.Scanner;

/*Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=15

*/
public class ArmstrongNumberOrNot10 {
    int number, originaNumber, remainder, result ;

    void armst() {
        originaNumber = number;
        for (; originaNumber != 0; originaNumber /= 10) {
            result = result + remainder * remainder * remainder;
            remainder = originaNumber % 10;
        }

        if (number == result)
            System.out.println( " is Armstrong number.");
        else
            System.out.println( " is not Armstrong number.");
    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter Number ");
        int number = sca.nextInt();
        sca.close();
        ArmstrongNumberOrNot10 obj = new ArmstrongNumberOrNot10();
        obj.armst();

    }
}

 /*   public static void main(String[] args) {

        int number = 153, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}



*/
