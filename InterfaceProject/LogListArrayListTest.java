package InterfaceProject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

public class LogListArrayListTest {
    public static void main(String args[]){
        PhoneLog log1= new PhoneLog("Received","Boss",);
        ArrayList<PhoneLog> logList=new ArrayList<PhoneLog>();
        logList.add(log1);




        Iterator<PhoneLog> logIterator=logList.iterator();

        while(logIterator.hasNext()){
            PhoneLog theLog= logIterator.next();
        }
    }
}
class PhoneLog{
    String logType;
    LocalDateTime localDateTime;
    String identity;
    int duration;
    public PhoneLog(String logType, LocalDateTime localDateTime, String identity, int duration) {
        this.logType = logType;
        this.localDateTime = localDateTime;
        this.identity = identity;
        this.duration = duration;
    }
    @Override
    public String toString() {
        return "PhoneLog [logType=" + logType + ", localDateTime=" + localDateTime + ", identity=" + identity
                + ", duration=" + duration + "]";
    }
   


}
