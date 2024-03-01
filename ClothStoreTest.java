public class ClothStoreTest {
    public static void main(String args[]){
        Salesman salespersonObj=new Salesman("Ravi");
        salespersonObj.setName("Ravi");

        Tailor tailorObj=new Tailor();
        tailorObj.setName("Raju");
        salespersonObj.shows(tailorObj);
         tailorObj.working();
        
    }
}
class IdCard{

}
class Person{
    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
   


 
}
class Salesman extends Person
{
       Salesman(String name)
       {
        this.name=name;   
        if(name.equals("Ravi")){
            System.out.println(name+" is Salesman");
        }
        else{
            System.out.println(name +"is Tailor");
        }
    }



    IdCard idCardObj=new IdCard(); 


   void shows(Tailor t){
    System.out.println(name+" is showing the tailor "+t.name);

     if(t.getName().equals("Ravi")){
            t.working();
        }
        
        else if(t.getName().equals("Raju")){
            t.stitch();
            
        }

     }

}

class Tailor extends Person{
     
    void stitch(){
       System.out.println("Hello I am "+name );  
    }
     void working(){
       System.out.println(name+" is stitching");  
    }
}




