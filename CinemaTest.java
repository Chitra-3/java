public class CinemaTest{
    public static void main(String args[]){
        Actor actor=new Actor();
        actor.setName("Madhuri Dixit");
        Actor actor2=new Actor();
        actor2.setName("Aishwarya Rai");

        Photographer photographer=new Photographer();
        photographer.setName("Ritesh");

        Photo thePhoto= photographer.capture(actor);
        Photo anotherPhoto= photographer.capture(actor2);

        
         thePhoto.photoDetails();
         anotherPhoto.photoDetails();
    }
}//stationary
class Lens{

}
class Camera{
    int maximumPhotosToStore=1000; //hasA
    int currentPhotoCount;
    Lens lens=new Lens();
    void click(){
        System.out.println("Camera being clicked");
        if (currentPhotoCount<maximumPhotosToStore){
                 currentPhotoCount++;
        }
        else{
            System.out.println("Memory is Full");
        }
       
    }
     void deletePic(){
        currentPhotoCount--;
    }
    void zoomIn(){

    }
    void zoomOut(){

    }
}
 class Person {
    char gender;
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Photographer extends Person{ //isA
    Camera camObj1=new Camera();
    Camera camObj2=new Camera();


    // passing object as an argument as USES
    Photo capture(Actor a){ //a is reference variable 
        System.out.println(name+" is capturing photo of"+a.name);
    
        if(a.getName().equals("Aishwarya Rai")){
            a.smile(); 
        }
        
        else if(a.getName().equals("Madhuri Dixit")){
            a.dance();
            
        }
        camObj1.click();
        
        Photo photo=new Photo(a);
        return photo; //producesA
    }
}
class Actor extends Person{
    void smile(){
        System.out.println(name+" is smiling");

    }
    void dance(){
        System.out.println(name+" is dancing");
    }
}
class Photo{ 
    Actor a; //null
    Photo(Actor a){ //initialized
        this.a=a;
    }
    void photoDetails(){
        System.out.println("Photo of "+a.name+" is nice");
    }
}
