package p5_p17;

public class p14 {
    public static void main(String[] args) {
        Car14 car1;
        car1 = new Car14();

        car1.setNum(1234);
        car1.setGas(20.5);
    }
}

class Car14{
    int num;
    double gas;
    void setNum(int n){
        num = n;
        System.out.println("let car num is" + num);
    }

    void setGas(double g){
        gas = g;
        System.out.println("let car gas is" + gas);
    }
    void show()
    {
        System.out.println("car num is" + this.num);
        System.out.println("Cas gas is" + this.gas);
    }
}
