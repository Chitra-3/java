public class App {
    public static void main(String[] args)  throws Exception{
        System.out.println("Hello, World!"); 
        Boxer boxer=new Boxer();
       
    }

}
class Boxer{
    Boxer() throws LostGameException{
          double val=Math.random()%10;
            if(val>0.5&&val<0.99 ){
                throw new LostGameException("Boxer lost in this game");
            }
        }
    void fight(){
        double val=Math.random();
        if(val>0.1&&val<0.5){
            throw new BleedingException("Boxer's leg is bleeding");
        }
      
    }
}
class LostGameException extends Exception{
    LostGameException(String msg){
    super(msg);
    }
}
class BleedingException extends RuntimeException{
    BleedingException(String msg){
        super(msg);
        
    }
}

