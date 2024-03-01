public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Begin main");

        Message messageThread1=new Message("Ping"); //3
        messageThread1.start(); //4

        Message messageThread2=new Message("\tPong");
        messageThread2.start();

        Message messageThread3=new Message("\t\tPang");
        messageThread3.start();

        Message messageThread4=new Message("\t\t\tPung");
        messageThread4.start();

        System.out.println("End of main");

    }
}
class Message extends Thread{
    private String str;
    Message(String x){
        str=x;
    }
    public void run(){
        for (int i=0;i<60;i++){
                    System.out.println(i+""+str);

        }
    }
}