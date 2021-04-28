package homeworkweek8;

public class Bike2 extends Vehicle{
    //No return type with no parameter
public void run(){
    System.out.println("Bike is running safely");
}
//Main Methods
    public static void main(String[] args) {
        Bike2 obj = new Bike2();// Creating object
        obj.run();//Calling method
    }
}
