public class App {
    public static void main(String[] args) throws Exception {
        Magician magician=new Magician();
        magician.doMagic();
        magician.smile();
        CardMagician cardMagician=new CardMagician();
        cardMagician.doMagic();
        cardMagician.flip();
        cardMagician.smile();
        cardMagician.rotate();
        // cardMagician.draw();
        

        HatMagician hatMagician=new HatMagician();
        hatMagician.doMagic();
        hatMagician.rotate();
        hatMagician.hide();

        }
}
class Magician  implements Smiling{
    void doMagic(){
                System.out.println("Magician does magic");

    }
     public void smile() {
        System.out.println(" Magician is smiling");
    }
}
interface Rotating{
    void rotate(); //abstract function |no body
}
interface Flipping{
    void flip(); //abstract func |no body
}
interface Smiling{
    void smile();
}
interface Hiding{
    void hide();
}
class CardMagician extends Magician implements Flipping,Rotating{
    void doMagic(){  //overriding
    System.out.println(" card Magician does card magic");
    }

    
    public void flip() {
        System.out.println("Card Magician flips card");
    }
   
    //  public void draw() {
    //     System.out.println("Card Magician draw cards");
    // }
     public void rotate() {
        System.out.println("card Magician is rotating");
    }
   
}
class HatMagician extends Magician implements Rotating,Flipping{
    void doMagic(){  //overriding //not mandate
    System.out.println("Magician does card magic");
    }

    public void rotate() { //mandate
        System.out.println("Hat Magician rotates card");
    }
     
     public void hide() {
        System.out.println("Card Magician hide cards");
    }
     public void flip() {
        System.out.println("Hat Magician flips hat");
    }
}