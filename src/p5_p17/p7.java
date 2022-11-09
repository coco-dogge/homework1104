package p5_p17;

public class p7 {
    public static void main(String[] args){
        Car car1;
        car1 = new Car();

        car1.num = 1234;
        car1.gas = 20.5;

        Car car2;
        car2 = new Car();

        car2.num = 2345;
        car2.gas = 30.5;

        System.out.println("car1 num is" + car1.num);
        System.out.println("car2 gas is" + car1.gas);

        System.out.println("car2 num is" + car2.num);
        System.out.println("car2 gas is" + car2.gas);
    }
}
