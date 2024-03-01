public class Company {
    public static void main(String[] args){
        SoftwareCompany EliObj1=new SoftwareCompany("BE",2022,"F",8.0f,"Rani");  
        SoftwareCompany EliObj2=new SoftwareCompany("BE",2023,"M",6.9f,"Raju");
        SoftwareCompany EliObj3=new SoftwareCompany("BTech",2023,"F",9.6f,"Sita");
        
        EliObj1.hiringProcess();
        EliObj2.hiringProcess();
        EliObj3.hiringProcess();


        EliObj1.trainingFee();
        EliObj2.trainingFee();
        EliObj3.trainingFee();


    }
}
class Employees{

}

class SoftwareCompany extends Company{ //isA

    Employees empObj = new Employees(); //hasA

    public String eduStream;
    public int passoutYear;
    private String gender;
    private float cgpa;
    public String name;
                                //usesA
    public SoftwareCompany(String eduStream,int passoutYear,String gender,float cgpa, String name) {
        super();
        this.eduStream = eduStream;
        this.passoutYear = passoutYear;
        this.gender = gender;
        this.cgpa = cgpa;
        this.name=name;
    }
        //producesA
    void hiringProcess(){
        if((cgpa<=7 && passoutYear!=2023)){
            System.out.println(name+" you are not eligible as your cgpa is "+cgpa);
        }
        else if((cgpa<=7)){
            System.out.println(name+" you are not eligible as your cpga is "+cgpa);
        }
        else if(passoutYear!=2023){
            System.out.println(name+" you are not eligible as your passout year is "+passoutYear);
        }
        else{
            System.out.println(name+" you are eligible");
        }
    } 

    void trainingFee(){
       double total=10000;
        if(cgpa>=9.0&&passoutYear==2023){
            double discount=20;
            total=(discount/100)*total;
            System.out.println(name+" as you are eligible, your Training Fee is "+total);
        }
        else if(cgpa<9.0&&cgpa>=8.0&&passoutYear==2023){
            double discount=10;
            total=(discount/100)*total; 
            System.out.println(name+" as you are eligible, your Training Fee is "+total);
        }
        else if(cgpa<8.0&&cgpa>7.0&&passoutYear==2023){
            double discount=5;
            total=(discount/100)*total; 
            System.out.println(name+" as you are eligible, your Training Fee is "+total);
        }
        // else{
        //     System.out.println("Sorry! "+name+ " you are not selected");
        // }
    }
}
