import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        Novel novel1 = new Novel(1, "Alice in Wonderland", 500);
        Novel novel2 = new Novel(2, "Novel 2 ", 200);
       // HashSet<Novel> theNovel = new HashSet<Novel>();
       ArrayList <Novel> theNovel=new ArrayList<Novel>();
        theNovel.add(novel1);
        theNovel.add(novel2);

        Iterator<Novel> itObj = theNovel.iterator();
        while (itObj.hasNext()) {
            Novel n = itObj.next();
            System.out.println("Novels Added" + n);
        }

    }

}

class Novel {
    int nvlId;

    String nvlName;
    int noP;

    public Novel(int nvlId, String nvlName, int noP) {
        this.nvlId = nvlId;
        this.nvlName = nvlName;
        this.noP = noP;
    }

    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + nvlId;
    //     result = prime * result + ((nvlName == null) ? 0 : nvlName.hashCode());
    //     result = prime * result + noP;
    //     return result;
    // }

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     Novel other = (Novel) obj;
    //     if (nvlId != other.nvlId)
    //         return false;
    //     if (nvlName == null) {
    //         if (other.nvlName != null)
    //             return false;
    //     } else if (!nvlName.equals(other.nvlName))
    //         return false;
    //     if (noP != other.noP)
    //         return false;
    //     return true;
    // }

    @Override
    public String toString() {
        return "Novel [nvlId=" + nvlId + ", nvlName=" + nvlName + ", noP=" + noP + "]";
    }
}
