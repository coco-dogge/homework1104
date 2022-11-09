package p5_p17;

public class p15 {
    public static void main(String[] args) {
        Car15 car1;
        car1 = new Car15();

        int number = 1234;
        double gasonline = 20.5;

        car1.setNumGas(number,gasonline);

    }
}

class Car15{
    int num;
    double gas;
    void setNumGas(int n,double g){
        num = n;gas = g;
        System.out.println("let car num is " + num + ", let car gas is " + gas);
    }


    void show()
    {
        System.out.println("car num is" + this.num);
        System.out.println("Cas gas is" + this.gas);
    }
}
