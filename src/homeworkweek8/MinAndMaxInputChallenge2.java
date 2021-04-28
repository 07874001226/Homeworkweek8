package homeworkweek8;

import java.util.Scanner;

/*-Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
 */
public class MinAndMaxInputChallenge2 {
    //Instance Class
void cla(){
    //Variables
    int max = 0;
    int min = 0;
    int num = 0;
    Scanner sca = new Scanner(System.in);// Input Scanner
    while (true){//Condition for While
        System.out.println("Enter Number : ");//Print Statement
        boolean hashNextInt = sca.hasNextInt();

        num +=1;
        if(hashNextInt){//If else Condition
            int number = sca.nextInt();

            boolean value = false;
            if(value){
                min = number;
                max = number;
            }
            if (number>max){
                max = number;
            }
            else if (number<min){
                min = number;
            }
            if(num==10){
                break;
            }else {
                System.out.println("Invalid number");//Print Statement
            break;
            }
        }
        sca.nextLine();
    }
    System.out.println("The Minimum Number is " +min);
    System.out.println("The MAXIMUN Number is " +max);
    sca.close();
}
    public static void main(String[] args) {
//Main Methods
MinAndMaxInputChallenge2 obj = new MinAndMaxInputChallenge2();// Object for calling Instance method to Main Methods
obj.cla();
}
    }


