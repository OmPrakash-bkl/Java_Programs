interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
    }
}
