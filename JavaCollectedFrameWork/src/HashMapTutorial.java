import java.util.HashMap;
import java.util.Map;

public class HashMapTutorial {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(5,"Five");
        hashMap.put(6,"six");
        hashMap.put(1,"one");
        hashMap.put(3,"three");
        hashMap.put(10,"ten");
        // duplicate key rakha jave na taile porer ta ager ta k overwrite korbe
        hashMap.put(6,"Hello");

        // get text
        String text = hashMap.get(6);
        System.out.println(text);
        // get all value
        // hashmap order maintain kore na jodio ei khane order e print hoice but onk somoy eta order e thake na so
        // be careful
        for(Map.Entry<Integer,String> entry : hashMap.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }


    }
}
