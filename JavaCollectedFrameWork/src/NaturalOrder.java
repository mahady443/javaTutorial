import java.util.*;
class Person2 implements Comparable<Person2>{
    private String name;
    public Person2(String name){
        this.name=name;
    }
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person2 person2)) return false;
        return Objects.equals(name, person2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Person2 person) {
        return name.compareTo(person.name);
    }
}
public class NaturalOrder {
    public static void main(String[] args) {
        List<Person2> list = new ArrayList<>();

        //noinspection SortedCollectionWithNonComparableKeys
        SortedSet<Person2> set = new TreeSet<>();
        addElement(list);
        addElement(set);
        Collections.sort(list);
        showElement(list);
        System.out.println(" ");
        showElement(set);


    }
    public static void addElement(Collection<Person2> col){
        col.add(new Person2("Mahady"));
        col.add(new Person2("Hasan"));
        col.add(new Person2("Munna"));
        col.add(new Person2("Juggu"));
        col.add(new Person2("Puggy"));
    }
    public static void showElement(Collection<Person2> col){
        for (Person2 element : col){
            System.out.println(element);
        }
    }
}
