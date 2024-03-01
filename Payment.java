public class Payment {
    public static void main (String args[]){
   
    Phonepe personObj=new Phonepe("Amar",12000);
    personObj.debit();
    personObj.checkBalance();
}
}
class Users{

}
class Phonepe extends Payment{ //isA
    Users userObj=new Users(); //hasA
    String personName;
    double debitedAmount;
    private double balanceLeft;
    private double totalAmount=20000;
                //usesA
public Phonepe(String personName,double debitedAmount)
{
    this.personName=personName;
    this.debitedAmount=debitedAmount;
}       //produces
void debit(){
    System.out.println("Your account has "+totalAmount);
    System.out.println(debitedAmount+" is debited from your account");
}
void checkBalance(){
    balanceLeft=totalAmount-debitedAmount;
    System.out.println("Your current balance is "+balanceLeft);
}
}
