import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String[] words = new String[5];
        Optional<String> checkNull = Optional.ofNullable(words[2]);

        if (checkNull.isPresent()) {
            System.out.println(words[2].toLowerCase());
        } else {
            System.out.println("Word is not available");
        }
    }
}

