package p5_p17;

public class p6 {
    public static void main(String[] args) {
        Car car2;
        car2 = new Car();

        car2.num = 1234;
        car2.gas = 20.5;

        System.out.println("Car is" + car2.num);
        System.out.println("Oil is" + car2.gas);
    }
}
class Car{
    int num;
    double gas;
}