public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
class Person{
    void travel(){
        for(int i=1;i<=10;i++){
            double val=Math.random()%10;
            if(val>0.5){
                throw new BusNotFoundException("Bus not found..");
            }
            System.out.println("Travelling plan failed.."+i);
        }
    }

     void ticket() throws TicketNotFoundException{
        for(int i=1;i<=10;i++){
            double val=Math.random()%10;
            if(val>0.5){
                throw new TicketNotFoundException("Ticket not found..");
            }
            System.out.println("Forgot my Ticket.."+i);
        }
    }
}

class BusNotFoundException  extends RuntimeException{
    BusNotFoundException(String str){
        super(str);
    }
}

class TicketNotFoundException extends Exception {
    TicketNotFoundException(String str){
        super( str);
    }
}