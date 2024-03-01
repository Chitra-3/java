import java.util.HashSet;
import java.util.Iterator;
public class HashSetTest{
    public static void main(String[] args) {
        Writer w1=new Writer("Book1",1,"ShakesSpere");
        Writer w2=new Writer("Book2",1,"ShakesSpere");
        Writer w3=new Writer("Book3",2,"SudhaMurthy");
        Writer w4=w3;
        System.out.println("writer are ready");
        HashSet <Writer> writer=new HashSet<>();
        writer.add(w1);
        writer.add(w2);
        writer.add(w3);
        writer.add(w4);
        System.out.println("novels are raedy");

        Iterator<Writer>books=writer.iterator();
        while (books.hasNext()) {
            Writer thWriter=books.next();
            System.out.println("the writer-------"+thWriter);
            
        }

    }
}






class Writer{
    String novelName;
    int number;
    String writerName;
    public Writer(int number) {
        this.number = number;
    }
    public Writer(String novelName, int number, String writerName) {
        this.novelName = novelName;
        this.number = number;
        this.writerName = writerName;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((novelName == null) ? 0 : novelName.hashCode());
        result = prime * result + number;
        result = prime * result + ((writerName == null) ? 0 : writerName.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Writer other = (Writer) obj;
        if (novelName == null) {
            if (other.novelName != null)
                return false;
        } else if (!novelName.equals(other.novelName))
            return false;
        if (number != other.number)
            return false;
        if (writerName == null) {
            if (other.writerName != null)
                return false;
        } else if (!writerName.equals(other.writerName))
            return false;
        return true;
        
    }
    @Override
    public String toString() {
        return "Writer [novelName=" + novelName + ", number=" + number + ", writerName=" + writerName + "]";
    }
    
}