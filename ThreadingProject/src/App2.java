public class App2 {
    public static void main(String[] args) {
        System.out.println("Begin main");

        Bike bikeObj1=new Bike("MT");
        bikeObj1.start();

        Bike bikeObj2=new Bike("Duke");
        bikeObj2.start();        

        Bike bikeObj3=new Bike("KTM");
        bikeObj3.start();


        System.out.println("End of the main");


    }
}
class Bike extends Thread{
    String str;
    Bike(String str){
        this.str=str;
    }
    public void run(){
        for(int i=0;i<10;i++){
                    System.out.println(i+ " "+str);

        }
    }
}
