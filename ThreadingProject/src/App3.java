public class App3 {
    public static void main(String[] args) {
        Pen pen=new Pen();
        FountainPen fountainPen=new FountainPen();
        SketchPen sketchPen=new SketchPen();
        pen.startWriting();
        fountainPen.startWriting();
        sketchPen.startWriting();
        // Writeable writeable=null;
        // writeable=new Chalk();
        // writeable.write();
        // FountainPen fountainPen=new FountainPen();
        // fountainPen.startWriting();

        Chalk chalk =new Chalk();
        Pen pen2=new Pen(chalk);
        pen2.startWriting();

        Pencil pencil=new Pencil();
        Pen pen3=new Pen(pencil);
        pen3.startWriting();


        // chalk.startWriting();
        // chalk.write();
    }
}
interface Writeable{
    void write();
}
class Pen implements Writeable{ //thread with run()
    Writeable writeable=null; //writeable handle //null
    Pen(){
        writeable=this; //for fountainPen,sketchPen,not for chalk
    }
    Pen(Writeable w){
        writeable=w; //for fountainPen,sketchPen, chalk
    }
    public void write(){
                System.out.println("Pen is writing");

    }
    public void startWriting(){ //exclusive method of the pen
        takingWritingSupport();
        writingTarget();
        write();
        checkStatus();
    }
    private void writingTarget(){ //paper|hand|sand|blackboard
                System.out.println("Taking the writing target");

    }
    private void checkStatus(){
                System.out.println("Checking the status");

    }
    private void takingWritingSupport(){
                System.out.println("Taking writing support");

    }

}
class FountainPen extends Pen{ //message Thread
    public void write(){
                System.out.println("Fountain pen is writing");

    }
}




class Stone{

}
class Marble extends Stone{

}
class Chalk extends Stone implements Writeable{  //The type Chalk must implement the inherited abstract method Writeable.write()
    public void write(){
                System.out.println("Chalk is writing on the black board");

    }
} 
class Graphite extends Stone{

}
class Pencil extends Graphite implements Writeable{
    public void write(){
                System.out.println("Pencil is writing on the paper");

    }
}
class SketchPen extends Pen{
    public void write(){
                System.out.println("Sketch pen is writing on drawing paper");

    }
}