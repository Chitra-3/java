import java.lang.reflect.Method;

public class AnnotationReflectionTest {
    public static void main(String[] args) {
        GrandFather gf=new GrandFather(10,20);
        // Father father=new Father();
        // father.farming();
        Class theMirror= gf.getClass();
        Method methods[]=theMirror.getMethods();
        for(Method theMethod:methods){
                    System.out.println("Method Name is "+theMethod.getName());

        }
    }
}

class GrandFather{
    GrandFather(int i,int j){
                System.out.println("GrandFather Ctor with "+i+" and"+j);

    }
    void farming(){
                System.out.println("GrandFather is farming using the plough");

    }
    void wakeUp(){
                System.out.println("GrandFather is waking up at 5:30");

    }
}

class Father extends GrandFather{

    @Override //label
    void farming() {
                System.out.println("Father is farming using the tractor");

    }
    void wakeUp(){
                System.out.println("Father is waking up at 6:30");

    }
  
    
}
class Child extends Father{
    @Override
    void farming(){
                System.out.println("Child is farming using robotic tractor");

    }
    void wakeUp(){
                System.out.println("Child is waking up at 7:30");

    }
}