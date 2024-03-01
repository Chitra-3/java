public class App {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello, World!");
        Dial dial=new Dial();
    }
}
class Dial{
    Dial() throws SimNotFoundException {
        double val=Math.random()%10;
        if(val>0.1&&val<0.5){
            throw new SimNotFoundException("Sim card is not present");
        }
    }
    void pack(){
        double val=Math.random()%10;
        if(val>0.5&&val<0.9){
            throw new PackExpiredException("Pack expired");
        }

    }
}
class SimNotFoundException extends Exception{
    SimNotFoundException(String msg){
        super(msg);
    }
}
class PackExpiredException extends RuntimeException{
    PackExpiredException(String msg){
        super(msg);
    }
}