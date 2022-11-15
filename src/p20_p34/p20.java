package p20_p34;

public class p20 {
    public static void main(String[] args){
        Car20 car1;
        car1 = new Car20();

        car1.num = 1234;
        car1.gas = -10;

        car1.show();
    }
}

class Car20{
    int num;
    double gas;

    void show(){
        System.out.println("car num is "+this.num);
        System.out.println("gas is "+this.gas);
    }


}


