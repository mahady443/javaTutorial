import java.util.*;

class Person{
    private int id;
    private String name;

    public Person(int id , String name){
        this.id= id;
        this.name= name;
    }
    public String toString(){
        return "(Id id :"+id+"; "+ "Name is "+ name+")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
public class CustomObject {
    public static void main(String[] args) {
        Person person1=new Person(0,"Mahady");
        Person person2=new Person(1,"hasan");
        Person person3=new Person(2,"Munna");
        Person person4=new Person(1,"hasan");
        Map<Person , Integer> map = new LinkedHashMap<>();
        map.put(person1,1);
        map.put(person2,2);
        map.put(person3,3);
        map.put(person4,1);
        for(Person key : map.keySet()){
            System.out.println(key +": "+ map.get(key));
        }
        Set<Person> set = new LinkedHashSet<>();
        set.add(person1);
        set.add(person2);
        set.add(person3);
        set.add(person4);
        System.out.println(set);
    }
}
