import java.util.*;

public class UsingIterator {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("dog");
        list.add("cat");
        list.add("mouse");
        list.add("rabbit");
        Iterator <String> it = list.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);

            if (value.equals("cat")){
                it.remove();
            }
        }

        System.out.println(" ");

        // Modern iteration ,Java 5 and later
        for (String fromlist : list){
            System.out.println(fromlist);
        }

    }
}
