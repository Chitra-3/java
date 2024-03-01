public class App {
    public static void main(String args[]) {
        Whatsapp chatObj1 = new Whatsapp(987654, "Ram", "Sita", true);
        Whatsapp chatObj2 = new Whatsapp(987654, "Krishna", "Radha", false);
        chatObj1.process();
        chatObj2.process();
    }
}
class Users{

}
class Whatsapp extends App { //isA
    Users userObj=new Users(); //hasA
    long phoneNumber;
    String senderName;
    String receiverName;
    Boolean status;

                    //usesA
public Whatsapp(long phoneNumber, String senderName, String receiverName, Boolean status) {
        this.phoneNumber = phoneNumber;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.status = status;
    }

    void process() {
        if (status == true) {
            System.out.println(senderName + " sent a message to " + receiverName);
        } else {
            System.out.println("No message sent");
        }
    }

}