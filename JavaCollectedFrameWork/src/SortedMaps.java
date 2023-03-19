import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMaps {
    public static void main(String[] args) {
        // first e kon type er map create korte chai na bolle o hoi but = er por new er por kon type oita likte hoi
        Map<Integer,String> hashMap= new HashMap<Integer,String>();
        HashMap<Integer,String> linkedhashMap= new LinkedHashMap<Integer,String>();
        Map<Integer,String> treeMap = new TreeMap<Integer,String>();
        // order sort kore die but sob somoy na jamon 1,2,5,6
        //test(hashMap);
        // jei order e put e value add korbo oi order e print dibe like 9,8,1
        //test(linkedhashMap);
        // tree order ekdom thik vabe sort kore dibe 
        test(treeMap);
    }

    public static void test(Map<Integer,String> map){
        map.put(9,"fox");
        map.put(8,"Dog");
        map.put(1,"cat");
        map.put(5,"bird");
        map.put(2,"snake");
        map.put(6,"tiger");

        for(Integer key: map.keySet()){
            String value = map.get(key);
            System.out.println(key +": "+ value);
        }
    }
}
