public class OopsProg {
    int age;
    String pName;

    void setTheValues(int pAge, String name) {
        age = pAge;
        pName = name;
    }

    void printTheName() {
        System.out.println("Guy name is "+ this.pName);
    }

    public static void main(String args[]) {
        OopsProg rahul = new OopsProg();
        rahul.setTheValues(12, "Rahul");
        rahul.printTheName();
    }
}

