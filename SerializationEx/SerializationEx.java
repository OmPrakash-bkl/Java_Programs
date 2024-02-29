import java.io.*;

class Student implements Serializable {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class SerializationEx {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            Student student = new Student("John", 20);
            oos.writeObject(student);
            System.out.println("Object serialized successfully");
        } catch(IOException e) {
            System.out.println("Error in serialization: "+e.getMessage());
        }
    }
}
