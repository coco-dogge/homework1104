package p20_p34;

public class p22 {
    public static void main(String[] args) {
        Car22 car1;
        car1 = new Car22();
        car1.setNumGas(1234,20.5);
        car1.show();

        System.out.println("指定不正確的汽油量{-10.0}看看");

        car1.setNumGas(1234,-10.0);
        car1.show();
    }
}

class Car22{
    private int num;
    private double gas;

    public void setNumGas(int n,double g){
        if(g>0 && g<100){
            num = n;
            gas = g;
            System.out.println("let car num is "+num+",gas is"+gas);
        }
        else{
            System.out.println(g+"not true gas");
            System.out.println("Can't change gas");
        }
    }

    public void show()
    {
        System.out.println("car num is" + this.num);
        System.out.println("Cas gas is" + this.gas);
    }

}
