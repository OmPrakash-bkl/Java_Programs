import java.util.*;

public class CollectionsEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Prakash");
        list.add("Ram");
        list.add("Keerthi");
        list.add("Vicky");

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Map: " + map);
    }
}
