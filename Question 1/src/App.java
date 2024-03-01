import java.util.Scanner;

public class App {
    public static void main(String[] args)   {
        
        System.out.println("Hello, World!");
        Ammount a=new Ammount();

        System.out.println("Enter ammount: ");
         Scanner sc=new Scanner(System.in);
        double Ammount =sc.nextDouble();
        System.out.println("Enter current ammount: ");
         Scanner sc2=new Scanner(System.in);
        double currentAmmount =sc2.nextDouble();
    
            try {
                a.check(Ammount);
            } catch (InvalidAmountException | InsufficientFundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            try {
                a.check(currentAmmount);
            } catch (InvalidAmountException | InsufficientFundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    

}
}
class Ammount{
    double currentAmmount;
    double Ammount; 
  
public void check( double Ammount) throws InvalidAmountException, InsufficientFundException{
        if(Ammount<0){
           throw new InvalidAmountException("Negative Ammount");
        }
         else{
            System.out.println("Postive ammount");
        }
        if(Ammount>currentAmmount){
            throw new InsufficientFundException("Ammount Exceeded");
        }
       
    }
}
class InvalidAmountException extends Exception{
    InvalidAmountException(String msg){
        super(msg);
    }
    
}
class InsufficientFundException extends Exception{
    InsufficientFundException(String msg){
        super(msg);
    }
}
