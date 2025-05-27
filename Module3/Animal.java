public class Animal {
    // Base class
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Derived class
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();

        myAnimal.sound();
        myDog.sound();
    }
}

}
