
import java.util.*;
class Person1{
    private int id;
    private String name;
    public Person1(int id , String name){
        this.id= id;
        this.name= name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public String toString(){
        return id + ": "+ name;
    }
}

class StringLengthComparator implements Comparator<String>{
    public int compare(String s1, String s2){
        int len1= s1.length();
        int len2 = s2.length();
        if(len1 > len2){
            return 1;
        }
        else if (len1< len2){
            return -1;
        }
        return 0;
    }
}

class AlphabeticalOrder implements Comparator<String>{
    public int compare(String s1, String s2){
        return s1.compareTo(s2);
    }
}

class ReverseOrder implements Comparator<String>{
    public int compare(String s1, String s2){
        return -s1.compareTo(s2);
    }
}
public class SortingList {
    public static void main(String[] args) {
        List<String> animal = new ArrayList<>();
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Elephant");
        animal.add("Snake");
        animal.add("Zebra");
        animal.add("Ant");
        // this sort amra jei vabe likci oivabe jemon dog cat
        //Collections.sort(animal, new StringLengthComparator());

        // alphabetical order e sort kore like tree
        //Collections.sort(animal,new AlphabeticalOrder());
        // reverse order e sort kore
        Collections.sort(animal,new ReverseOrder());
        for (String animals:animal){
            System.out.println(animals);
        }
        System.out.println(" ");
        List<Integer> number = new ArrayList<>();
        number.add(20);
        number.add(1);
        number.add(5);
        number.add(25);
        number.add(10);
        number.add(35);
        Collections.sort(number, new Comparator<Integer>() {
            @Override
            //reverse order number sort
            public int compare(Integer num1, Integer num2) {
                return -num1.compareTo(num2);
            }
        });
        for (Integer num : number){
            System.out.println(num);
        }
        System.out.println(" ");
        // sorting arberatory object
        List<Person1> personList = new ArrayList<>();
        personList.add(new Person1(4,"mahady"));
        personList.add(new Person1(2,"hasan"));
        personList.add(new Person1(1,"munna"));
        personList.add(new Person1(3,"juggu"));
        // sorting by id
        Collections.sort(personList, new Comparator<Person1>() {
            @Override
            public int compare(Person1 p1, Person1 p2) {
                if (p1.getId()>p2.getId()){
                    return 1;
                }
                else if(p1.getId()<p2.getId()){
                    return -1;
                }
                return 0;
            }
        });
        for (Person1 pepole : personList){
            System.out.println(pepole);
        }
        System.out.println("     ");
        // sort by name in alphabetic

        Collections.sort(personList, new Comparator<Person1>() {
            @Override
            public int compare(Person1 p1, Person1 p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
        for (Person1 pepole : personList){
            System.out.println(pepole);
        }

    }
}
