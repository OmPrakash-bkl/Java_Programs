class Student {
    private String name;

    public void setName(String sName) {
        name = sName;
    }

    public String getName() {
        return name;
    }

}
public class EncapsulationEx {
    public static void main(String[] args) {
        Student myStudent = new Student();
        myStudent.setName("Prakash");
        System.out.println("My Student Name: " + myStudent.getName());
    }
}
