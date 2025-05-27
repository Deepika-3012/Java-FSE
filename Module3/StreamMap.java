import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "alice", "bob");

        List<String> upperCaseNames = names.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());

        upperCaseNames.forEach(System.out::println);
    }
}
