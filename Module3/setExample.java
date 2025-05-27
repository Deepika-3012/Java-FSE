import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red"); // Duplicate, will not be added

        for (String color : colors) {
            System.out.println(color);
        }
    }
}

