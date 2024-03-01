public class App4 {
    public static void main(String[] args) {
        HorseCart horseCart=new HorseCart();
        SedanCar sedanCar1=new SedanCar("BMW");
        Thread thread1=new Thread(sedanCar1);
        SedanCar sedanCar2=new SedanCar("MERC");
        Thread thread2=new Thread(sedanCar2);
        SedanCar sedanCar3=new SedanCar("SKODA");
        Thread thread3=new Thread(horseCart);
        Thread thread4=new Thread(sedanCar3);

        
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
class Car{
    void drive(){
                System.out.println("Driving a car");

    }
}
class SedanCar extends Car implements Runnable{

    String modelName;
        SedanCar(String model){
            modelName=model;
        }


    public void run(){
                System.out.println("Car is running");

    }
}
class HorseCart implements Runnable{
    public void run(){
            System.out.println("Horse cart is running");

    }

}