import java.util.Arrays;
import java.util.List;

public class StreamsApiEx {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Orange", "Banana", "Strawberry");

        fruits.stream().filter(fruit -> fruit.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
    }
}
