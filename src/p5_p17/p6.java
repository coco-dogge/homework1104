package p5_p17;

public class p6 {
    public static void main(String[] args) {
        Carp6 car2;
        car2 = new Carp6();

        car2.num = 1234;
        car2.gas = 20.5;

        System.out.println("Car is" + car2.num);
        System.out.println("Oil is" + car2.gas);
    }
}
class Carp6{
    int num;
    double gas;
}