class MyGenericClass<T> {
    private T value;

    MyGenericClass(T value)  {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}
public class GenericsEx {
    public static void main(String[] args) {
        MyGenericClass<String> stringObj = new MyGenericClass<>("Hello Madurai");
        MyGenericClass<Integer> intObj = new MyGenericClass<>(200);

        System.out.println("String val: " + stringObj.getValue());
        System.out.println("Integer value: " + intObj.getValue());
    }
}
