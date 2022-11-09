package p5_p17;

public class p11 {
    public static void main(String[] args) {
     Car11 car1;
     car1 = new Car11();

     car1.num = 1234;
     car1.gas = 20.5;

     car1.show();
     car1.show();
    }
}

class Car11{
    int num;
    double gas;

    void show()
    {
        System.out.println("car num is" + this.num);
        System.out.println("Cas gas is" + this.gas);
    }
}