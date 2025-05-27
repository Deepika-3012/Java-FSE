import java.util.*;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob");

        // Sort using lambda
        names.sort((a, b) -> a.compareTo(b));

        // Print sorted names
        names.forEach(name -> System.out.println(name));
    }
}

