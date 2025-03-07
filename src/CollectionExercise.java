import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionExercise {
    public static void exercise() {
        System.out.println("Collections Assignment: ");
        exercise1_check2LinkedListsAreEqual();
        exercise2_checkArrayListSubsetOfAnotherArrayList();
        exercise3_getKeyAndValueSetFromHashMap();
        exercise4_checkStringDuplicatesUsingHashSet();
        exercise5_arrayToListToArray();
    }

    private static void exercise5_arrayToListToArray() {
        System.out.println("\nExercise5");
        String[] strArray = new String[]{"one", "two", "three"};
        System.out.println("string array1: " + Arrays.toString(strArray));
        List<String> strList = Arrays.asList(strArray);
        System.out.println("string array list:" + strList);
        String[] strArray2 = strList.toArray(String[]::new);
        System.out.println("string array2:" + Arrays.toString(strArray2));
    }

    private static void exercise4_checkStringDuplicatesUsingHashSet() {
        System.out.println("\nExercise4");
        String[] strings = new String[]{"one", "two", "three", "one", "five"};
        Set<String> stringSet = Arrays.stream(strings).collect(Collectors.toSet());
        System.out.println("is duplicate in string array: " + (stringSet.size() != strings.length));
    }

    private static void exercise3_getKeyAndValueSetFromHashMap() {
        System.out.println("\nExercise3");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        System.out.println("map Keys: " + map.keySet());
        System.out.println("map Values: " + map.values());
    }

    private static void exercise2_checkArrayListSubsetOfAnotherArrayList() {
        System.out.println("\nExercise2");
        List<String> childList = new ArrayList<>();
        childList.add("A");
        childList.add("B");
        childList.add("E");
        List<String> parentList = new ArrayList<>();
        parentList.add("A");
        parentList.add("B");
        parentList.add("C");
        parentList.add("D");
        // Expected result: false
        System.out.println("childList subsetOf parentList: " + parentList.containsAll(childList));
    }

    private static void exercise1_check2LinkedListsAreEqual() {
        System.out.println("\nExercise1");
        List<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        List<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        // Expected result: true
        System.out.println("list1 == list2: " + list1.equals(list2));
    }
}
