import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String[] names = {"Java", "Kotlin", "Java"};
        String name = "Java";
        Predicate predicate = name::equals;
        long firstCount = Stream.of(names).filter(predicate).count();
        name = "Kotlin";
        long secondCount = Stream.of(names).filter(predicate).count();
        System.out.println(firstCount + "" + secondCount);
    }
}
