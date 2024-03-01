public class FinalTest {
    public static void main(String[] args){
        Circle circle=new Circle(4);
        circle.calArea();
        
        Car car=new Car("Swift", "123", "L9");
        car.
    }
}
abstract class GeometricalShape{
    abstract void calArea();

}
class Car{
    final String modelName;
       Car(String modelName, String serialNumber, String numberPlate) {
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.numberPlate = numberPlate;
    }
    final String serialNumber;
    final String numberPlate;
    @Override
    public String toString() {
        return "Car [modelName=" + modelName + ", serialNumber=" + serialNumber + ", numberPlate=" + numberPlate + "]";
    }
}
class Circle extends GeometricalShape{
    float radius;
    static final float PI=3.14f;
     public Circle(float radius){
        this.radius=radius;
     }
     void show(){
        System.out.println("Radius: "+radius);
     }
     void calArea(){
    //    static final float PI=3.14f;
        float area=radius*radius*PI;
            System.out.println("Area: "+area);

     }
}