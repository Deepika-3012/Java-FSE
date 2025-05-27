interface Sayable {
    void say();
}

public class LambdaExamples {
    public static void main(String[] args) {
        Sayable s = () -> System.out.println("Hello from Lambda Expression!");
        s.say();
    }
}
