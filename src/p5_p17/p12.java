package p5_p17;

public class p12 {
    public static void main(String[] args) {
        Car12 car1;
        car1 = new Car12();

        car1.num = 1234;
        car1.gas = 20.5;

        car1.showCar();

    }
}

class Car12{
    int num;
    double gas;

    void show(){
        System.out.println("car num is" + this.num);
        System.out.println("Cas gas is" + this.gas);
    }
    void showCar(){
        System.out.println("Start show car list");
        this.show();
    }
}

