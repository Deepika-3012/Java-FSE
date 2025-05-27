import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();

        studentMap.put(1, "John");
        studentMap.put(2, "Alice");
        studentMap.put(3, "Bob");

        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}

