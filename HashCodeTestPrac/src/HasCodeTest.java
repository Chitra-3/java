import java.util.HashSet;
import java.util.Iterator;

public class HasCodeTest{
    public static void main(String[] args) {
        Footwear f1=new Footwear(1,"Daily wear",300);
        Footwear f2=new Footwear(2,"Party wear",1000);
        Footwear f3=new Footwear(3,"Heels",800);
        HashSet <Footwear> theFootwear=new HashSet<Footwear>();
        theFootwear.add(f1);
        theFootwear.add(f2);
        theFootwear.add(f3);
        Iterator <Footwear> theIterator= theFootwear.iterator();
        while (theIterator.hasNext()) {
            System.out.println("Adding footwear: "+theIterator.next());
        }
    }
}


class Footwear{
    int fId;
    String fType;
    float cost;
    public Footwear(int fId, String fType, float cost) {
        this.fId = fId;
        this.fType = fType;
        this.cost = cost;
    }
    @Override
    public String toString() {
        return "Footwear [fId=" + fId + ", fType=" + fType + ", cost=" + cost + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + fId;
        result = prime * result + ((fType == null) ? 0 : fType.hashCode());
        result = prime * result + Float.floatToIntBits(cost);
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
        Footwear other = (Footwear) obj;
        if (fId != other.fId)
            return false;
        if (fType == null) {
            if (other.fType != null)
                return false;
        } else if (!fType.equals(other.fType))
            return false;
        if (Float.floatToIntBits(cost) != Float.floatToIntBits(other.cost))
            return false;
        return true;
    }
}