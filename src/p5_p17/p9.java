package p5_p17;

public class p9 {
    public static void main(String[] args){
        Car9 car1;
        car1 = new Car9();

        car1.num = 1234;
        car1.gas = 20.5;
    }
}

class Car9{
    int num;
    double gas;

    void show()
    {
        System.out.println("car num is" + this.num);
        System.out.println("Cas gas is" + this.gas);
    }
}
