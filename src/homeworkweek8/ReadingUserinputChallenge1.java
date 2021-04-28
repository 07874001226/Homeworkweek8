package homeworkweek8;

import java.util.Scanner;

/*. Read 10 numbers from the console entered by the user and print the sum of those
numbers.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
10 numbers.
-Use the nextInt() method to get the number and add it to the sum.
-Before the user enters each number, print the message Enter number #x: where x represents the
count, i.e. 1, 2, 3, 4, etc.
-For example, the first message printed to the user would be Enter number #1:, the next Enter number
#2:, and so on.
Hint:
-Use a while loop.
-Use a counter variable for counting valid numbers.
-Close the scanner after you don't need it anymore.
-Create a class with the name ReadingUserInputChallenge.


 */
public class ReadingUserinputChallenge1 {
 // Instance Methods
     void pro(){
        int counter = 1;//Variables
        int sum = 0;
        Scanner sca = new Scanner(System.in);//Import Scanner and create object of scanner
        while (counter <= 10){//While Condition
            System.out.println("Enter number " + counter + ";");//Print Statement
            boolean num = sca.hasNextInt();
            if (num==false){//If Statement
                System.out.println("Invalid Value");
                sca.nextLine();
                continue;
            }
            sum += sca.nextInt();
            System.out.println("The sum of numbers : " + sum);//Print Statement
            counter++;
        }
            sca.close();//Scanner Closed
    }
//Main Methods
    public static void main(String[] args) {
        ReadingUserinputChallenge1 obj = new ReadingUserinputChallenge1();// Object for calling Instance method to Main Methods
        obj.pro();

    }
}
