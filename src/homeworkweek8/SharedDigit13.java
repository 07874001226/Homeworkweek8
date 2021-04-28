package homeworkweek8;
/*Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
otherwise, the method should return false.
EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
NOTE: The method hasSharedDigit should be defined as public static
 */
public class SharedDigit13 {
//Static method with return type with perameter
        public static boolean hasSharedDigit ( int number1, int number2){
            //Variables
            int lastdigit1 = 0;
            int lastdigit2 = 0;
            int value = number2;

            if ((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)) {//If Statement

                while (number1 > 0) {//Do while loop  Statement
                    lastdigit1 = number1 % 10;
                    System.out.println("Number 1 last Digit: " + lastdigit1);//Print Statement
                    do {
                        lastdigit2 = number2 % 10;
                        System.out.println("Number 2 last Digit: " + lastdigit2);//Print Statement
                        if (lastdigit1 == lastdigit2) {// If Else Statement

                            return true;
                        } else {
                            number2 /= 10;
                        }
                    } while (number2 > 0);//While Statement
                    number2 = value;
                    number1 /= 10;
                }
                }
                return false;
            }
            //Main Method
    public static void main(String[] args) {
        boolean num = hasSharedDigit(12, 23);// Object to calling Main Method
        System.out.println(num);//Print Statement
        boolean num1 = hasSharedDigit(9, 99);// Object to calling Main Method
        System.out.println(num1);//Print Statement
        boolean num2 = hasSharedDigit(15, 55);// Object to calling Main Method
        System.out.println(num2);//Print Statement
    }
        }

