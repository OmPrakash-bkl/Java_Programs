import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value();
}


@MyAnnotation(value = "Custom Annotation")

public class AnnotationsEx {
    public static void main(String[] args) {
        Class<?> myClass = AnnotationsEx.class;
        MyAnnotation annotation = myClass.getAnnotation(MyAnnotation.class);

        System.out.println("Annotation Value: " + annotation.value());
    }
}
