public class ExceptionHandlingTest 
{
    public static void main(String[] args) {
        try{
        Boxer boxer=new Boxer();
        boxer.fight();
    }catch(LostGameException e1){
        System.out.println("It's Checked Exception"+e1);
    }
    catch(BleedingException e2){
        System.out.println("It's unchceked exception"+e2);
    }
    
}
}

