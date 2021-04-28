package homeworkweek8;

public class Student5 {
    //Variable
    int id;
    String name;
    int age;

    //Two arg Constructor
    Student5(int i, String n){

    id =i;
    name =n;
}
//Three arg Constructor
    Student5(int i,String n,int a){
        id = i;
        name =n;
        age = a;
    }
    //No return type with no parameter

    public void display(){
    System.out.println(id+" "+name+" "+age);// Print Statement
}
//Main Methods
    public static void main(String[] args) {
        Student5 s1 = new Student5(111, "Karan");
        Student5 s2 = new Student5(222, "Aryan", 25);
        s1.display();// object
        s2.display();//object
    }
}
