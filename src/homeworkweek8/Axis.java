package homeworkweek8;

public class Axis extends Bank{
    //Main Methods
    public static void main(String[] args) {
        SbI s = new SbI();
        IcIcI i = new IcIcI();
        Axis a = new Axis();
        System.out.println("SBI Rates of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rates of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rates of Interest: "+a.getRateOfInterest());
    }
}
