public class App {
    public static void main(String[] args){
        System.out.println("Hello, World!");
    }
}
class Student{
    void journey(){
        for(int i=1;i<=10;i++){
            double val=Math.random()%10;
            if(val>0.5 && val<0.9){
                throw new AutoNotFoundException("No Auto found..");
            }
            System.out.println("Journey completed.."+i);
        }
    }
    void learning() throws PSDSessionException{
        for(int i=1;i<=10;i++){
            double val=Math.random()%10;
            if(val>0.1&& val<0.9){
                throw new PSDSessionException("No PSD class..");
            }
            System.out.println("Class completed.."+i);
    }
}
}
 class AutoNotFoundException extends RuntimeException{
    AutoNotFoundException(String args){
        super(args);
    }
}
class PSDSessionException extends Exception{
    PSDSessionException(String args){
        super(args);
    }
}