
public class BathExceptionTest {
    public static void main(String[] args) throws HotWaterException{
        Bath bath= new Bath();
        try{
        bath.uncheck();
        }catch(PowerCutException e2){
            System.out.println(e2);
        }
    }
   
}
