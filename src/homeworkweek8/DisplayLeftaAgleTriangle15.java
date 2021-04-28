package homeworkweek8;
/*Display left angle triangle of * using nested for loops
 *
 *  * *
 * * *
 * * * *
 * * * * *

 */
public class DisplayLeftaAgleTriangle15 {
    //Static Method
    static void disp() {
        int rows = 5;//Variables
//For Loop Statement
        for (int x = 1; x <= rows; x++) {
            for (int i = 1; i <= x; i++) {
                System.out.print("* ");//Print Statement
            }
            System.out.println("");// Print  statement
        }
    }
//Main Method
    public static void main(String[] args) {
        DisplayLeftaAgleTriangle15.disp();
    }
}