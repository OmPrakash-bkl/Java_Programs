import java.lang.reflect.Method;

public class ReflectionEx {
    public static void main(String[] args) {
        try {
            Class<?> myClass = Class.forName("java.util.ArrayList");
            Method[] methods = myClass.getMethods();

            for(Method method: methods) {
                System.out.println("Method Name: " + method.getName());
            }
        } catch(ClassNotFoundException e) {
            System.out.println("class not found: " + e.getMessage());
        }
    }
}
