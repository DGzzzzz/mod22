import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Stream<String> stream = List.of("Douglas", "Paulo", "João").stream();

        Stream<String> set = Set.of("123", "2").stream();

        Map<String, String> map = Map.of("1", "Douglas", "2", "Paulo");
        Stream<String> chaves = map.keySet().stream();
        Stream<String> valores = map.values().stream();

        chaves.forEach(System.out::println);
        valores.forEach(System.out::println);
        set.forEach(System.out::println);
        stream.forEach(System.out::println);
    }
}
