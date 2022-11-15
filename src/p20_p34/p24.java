package p20_p34;

public class p24 {
    public static void main(String[] args) {
        Car24 car1;
        car1 = new Car24();
        car1.setCar(1234,20.5);
        car1.show();

        System.out.println("only change car num");
        car1.setCar(2345);
        car1.show();

        System.out.println("only change gas");
        car1.setCar(2345.0);
        car1.show();
    }
}

class Car24{
    private int num;
    private double gas;

    public void setCar(int n){
        num = n;
        System.out.println("let car num is "+num);

    }
    public void setCar(double g){
        gas = g;
        System.out.println("let gas is"+gas);
    }

    public void setCar(int n,double g){
        num = n;
        gas = g;
        System.out.println("let car num is "+num+",gas is"+gas);
    }

    public void show()
    {
        System.out.println("car num is" + this.num);
        System.out.println("Cas gas is" + this.gas);
    }

}
