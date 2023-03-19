import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsTutorial {
    public static void main(String[] args) {
        // HashSet does not retain order kono order e print oi na random thake
        //Set<String> set1 = new HashSet<>();
        //amra jei order e dibo shie order e thakbe
        //Set<String> set1 = new LinkedHashSet<>();
        // tree set alphabetical order e print kore or sorting kore
        Set<String> set1 = new TreeSet<>();
        if (set1.isEmpty()){
            System.out.println("Set is Empty in first");
        }

        set1.add("dog");
        set1.add("cat");
        set1.add("tiger");
        set1.add("mouse");
        set1.add("bird");
        // adding duplicate item
        // duplicate item add hoi na
        set1.add("cat");
        System.out.println(set1);
        if (set1.isEmpty()){
            System.out.println("Set is Empty after adding");
        }

        // ********* Iteration ***********
        for (String elements: set1){
            System.out.println(elements);
        }
        // does set contain a given item ??
        if (set1.contains("adadadahd")){
            System.out.println("Contain adadadahd");
        }
        if (set1.contains("cat")){
            System.out.println("contain CAT ^_^");
        }

        // intersection
        Set<String> set2 = new TreeSet<>();

        set2.add("dog");
        set2.add("cat");
        set2.add("monkey");
        set2.add("Lion");
        set2.add("COW");
        // adding duplicate item
        // duplicate item add hoi na
        set1.add("cat");
        System.out.println(set1);
        Set<String > intersection = new HashSet<>(set1);

        intersection.retainAll(set2);
        System.out.println(intersection);
        }
    }

