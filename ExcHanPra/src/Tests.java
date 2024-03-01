
public class Tests{
    public static void main(String[] args) {
        Person person=new Person();
        person.travel();
        try{
            person.ticket();
        }catch(TicketNotFoundException e){
            System.out.println(e);
        }
    }
}
