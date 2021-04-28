package homeworkweek8;
/*Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@

 */
public class RightAngleTriangle8 {
    static void m() {
        //Main Method
        //public static void main(String[] args) {
        for (int a = 1; a <= 5; a++) {//for loop Statement
            System.out.println(" ");
            for (int b = 1; b <= a; b++) {
                System.out.print("@ ");} //Print Statement
                System.out.println();//Print Statement
               // System.out.print("@ ");//Print Statement
            }
        }

//Main Method
    public static void main(String[] args) {
        RightAngleTriangle8.m();// Object for cslling static to main methods

        }
    }





