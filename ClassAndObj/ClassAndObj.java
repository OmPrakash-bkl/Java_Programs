class Dog {

    String bread;
    int age;

    void bark() {
        System.out.println("Woof!");
    }

}

public class ClassAndObj {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.bread = "Labrador";
        myDog.age = 2;

        System.out.println("Bread: "+myDog.bread);
        System.out.println("Age: "+myDog.age);
        myDog.bark();
    }
}