import java.util.ArrayList;

public class ArrayListTutorial {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // adding number to the arraylist
        numbers.add(10);
        numbers.add(3);
        numbers.add(100);
        //retrieving
        System.out.println(numbers.get(0));
        System.out.println("Iteration #1");
        // indexing for looping iteration
        for(int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }

        // removing number from arraylist
        // slow the code
        numbers.remove(0);
        numbers.remove(numbers.size()-1);
        // another way
        System.out.println("Iteration #2");
        for (Integer value : numbers){
            System.out.println(value);
        }



    }
}
