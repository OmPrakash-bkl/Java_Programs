import java.io.*;

class Student implements Serializable {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class DeserializationEx {
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student student = (Student) ois.readObject();
            System.out.println("Object deserialized successfully");
            System.out.println("Name: "+student.name);
            System.out.println("Age: "+student.age);
        } catch(IOException | ClassNotFoundException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
