import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LInkedListing {
    public static void main(String[] args) {
        /*
        ArrayList is manage arrays internally
        [0][1][2][3][4].......[n]
         */
        List<Integer> arraylist = new ArrayList<Integer>();
        /*
        LinkedList consists of elements where each element
        has a reference to the previous and  next element
        [0]->[1]->[2]........
           <-  <-
         */
        List<Integer> linkedList = new LinkedList<Integer>();
        doTiming("ArrayList",arraylist);
        doTiming("LinkedList",linkedList);

    }

    private static void doTiming(String type , List<Integer> list){
        for(int i=0; i<1E5;i++){
            list.add(i);
        }
        long start = System.currentTimeMillis();
        // add item at end of list
        /*for(int i=0; i<1E5;i++){
            list.add(i);
        }*/
        // add item at start
        for(int i=0; i<1E5;i++){
            list.add(0,i);
        }
        long end = System.currentTimeMillis();
        // ****Note**** If we want to add item in list at middle or end we use arraylist it take less time
        // but want to add item in beginning use linked-list
        System.out.println("time taken "+ (start - end)+ "m/s "+ type);
    }
}
