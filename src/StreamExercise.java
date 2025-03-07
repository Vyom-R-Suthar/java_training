import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExercise {

    public static void exercise() {
        System.out.println("Stream API assignment");
        exercise1();
        exercise2();
        exercise3();
    }

    private static void exercise1() {
        // get cube for numbers 1-10 and filter by divisible 5
        System.out.println("Exercise 1: ");
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        numbers.stream()
            .map(n -> n * n * n)
            .filter(n -> n % 5 == 0)
            .forEach(System.out::println);
    }

    private static void exercise2() {
        //For a given String count the times each letter is repeated
        System.out.println("Exercise 2: ");
        String inputString = "Jai Swaminarayan";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            if (map.containsKey(inputString.charAt(i))) {
                map.put(inputString.charAt(i), map.get(inputString.charAt(i)) + 1);
            } else {
                map.put(inputString.charAt(i), 1);
            }
        }
        System.out.println(map);
    }

    private static void exercise3() {
        // find out the average age stored as a value in a map
        System.out.println("Exercise 3: ");
        Map<String, Integer> idAgeMap = new HashMap<>();
        idAgeMap.put("E01", 20);
        idAgeMap.put("E02", 30);
        idAgeMap.put("E03", 40);
        idAgeMap.put("E04", 50);
        idAgeMap.put("E05", 70);
        System.out.println(idAgeMap.values().stream().mapToInt(i -> i).average());
    }
}
