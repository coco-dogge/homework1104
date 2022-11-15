package p20_p34;

public class p26 {
    public static void main(String[] args) {
        Car26 car1;
        car1 = new Car26();

        car1.show();

    }
}

class Car26{
    private int num;
    private double gas;

    public Car26(){
        num =0;
        gas = 0.0;
        System.out.println("produce car");
    }

    public void show()
    {
        System.out.println("car num is " + this.num);
        System.out.println("Cas gas is " + this.gas);
    }

}
