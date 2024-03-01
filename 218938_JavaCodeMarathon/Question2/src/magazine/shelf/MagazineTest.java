package magazine.shelf;

import java.util.HashSet;
import java.util.Iterator;

public class MagazineTest {
    public static void main(String[] args) {
        

    Magazine m1=new Magazine(1,"M1","Author1",300,600);
    Magazine m2=new Magazine(2,"M2","Author2",500,1600);
    Magazine m3=new Magazine(3,"M3","Author3",700,2000);
    Magazine m4=new Magazine(1, "M1", "Author1", 300,600);
    HashSet <Magazine> theMagazine=new HashSet<Magazine>();
        m1=m4;
    theMagazine.add(m1);
    theMagazine.add(m2);
    theMagazine.add(m3);
    theMagazine.add(m4);

    Iterator <Magazine> theIterator=theMagazine.iterator();
      while (theIterator.hasNext()) {
            System.out.println("Adding magazines: "+theIterator.next());
        }

    }
    
}













      
    

