package p20_p34;

public class p27 {
    public static void main(String[] args) {
        Car27 car1;
        car1 = new Car27();
        car1.show();

        Car27 car2;
        car2 = new Car27(1234,25.0);
        car2.show();
    }
}

class Car27{
    private int num;
    private double gas;

    public Car27(){
        num =0;
        gas = 0.0;
        System.out.println("produce car");
    }
    public Car27(int n,double g){
        num = n;
        gas = g;
        System.out.println("produce car,car num is "+num+",gas is "+gas);
    }

    public void show()
    {
        System.out.println("car num is " + this.num);
        System.out.println("Cas gas is " + this.gas);
    }

}
