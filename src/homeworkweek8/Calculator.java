package homeworkweek8;
/*Write a class with the name Calculator. The class needs two fields (instance variables) with name
floor of type Floor and carpet of type Carpet.
The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet
and it needs to initialize the fields.
Write the following methods (instance methods):
● Method named getTotalCost without any parameters, it needs to return the calculated total
cost to cover the floor with a carpet.
 */

public class Calculator {
    private Floor floor;//instance variable
    private Carpet carpet;
    //contructor
    public Calculator(Floor f,Carpet c){
        this.floor =f;
        this.carpet =c;
    }
    //instance methods
    public double getTotalCost(){
        return floor.getarea()*carpet.getCost();
    }

}
