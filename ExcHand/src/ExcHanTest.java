public class ExcHanTest {
    public static void main(String[] args){
        try{
            Dial dial=new Dial();
            dial.pack();
        }catch(SimNotFoundException e1){
            System.out.println(e1);
        }catch(PackExpiredException e2){
            System.out.println(e2);
        }
    }
}
