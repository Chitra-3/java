import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;





public class ArrayListTest {
    public static void main(String args[]){
        //cointainer
        ArrayList numberList=new ArrayList();
        // LinkedList numberList=new LinkedList();
        // TreeSet numberList=new TreeSet();
        //   HashSet numberList=new HashSet();


        System.out.println("Container created");
        numberList.add(10); //content added
        numberList.add(20);
        numberList.add(30);
        numberList.add(10);
        numberList.add(20);
        numberList.add(40);
        numberList.add(50);
        System.out.println("Content is added ");

        //access the content-means iterate over it
            System.out.println("Accessing iterator");
            Iterator numberIterator=numberList.iterator();
            System.out.println("Got the iterator");
            System.out.println("Iterating through the collection");


        while(numberIterator.hasNext()){
            Integer intValue=(Integer) numberIterator.next();
            System.out.println("value"+intValue);

        }
            System.out.println("Done");

    }
}
