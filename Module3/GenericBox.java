public class GenericBox<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public static void main(String[] args) {
        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.set(123);
        System.out.println("Integer Value: " + intBox.get());

        GenericBox<String> strBox = new GenericBox<>();
        strBox.set("Hello");
        System.out.println("String Value: " + strBox.get());
    }
}

