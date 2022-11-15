package p5_p17;

public class p17 {
    public static void main(String[] args) {
        Car17 car1;
        car1 = new Car17();
        car1.setNumGas(1234,20.5);
        int number = car1.getNum();
        double gasonline = car1.getGas();

        System.out.println("調查樣品車時得知");
        System.out.println("車號是"+number+"，汽油量是"+gasonline);

    }
}

class Car17{
    int num;
    double gas;

    int getNum(){
        System.out.println("調查車號");
        return num;
    }
    double getGas(){
        System.out.println("調查汽油量");
        return gas;
    }
    void setNumGas(int n,double g){
        num = n;gas = g;
        System.out.println("let car num is " + num + ", let car gas is " + gas);
    }

}


