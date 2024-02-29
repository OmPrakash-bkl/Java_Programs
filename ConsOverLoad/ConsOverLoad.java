class Student {
    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }
}

public class ConsOverLoad {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Prakash", 22);

        System.out.println("Student 1 - Name: " + student1.name + ", Age: "+ student1.age);

        System.out.println("Student 2 - Name: " + student2.name + ", Age: "+ student2.age);
    }
}
