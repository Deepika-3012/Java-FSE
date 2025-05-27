import java.io.*;

public class DeserializationExample {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student student = (Student) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Deserialized Student...");
            System.out.println("ID: " + student.id);
            System.out.println("Name: " + student.name);
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
    }
}

