package hw14;

import java.util.*;

public class Main {
    public static void main (String[] args) {
        List<String> stringList = Arrays.asList(
                "bird", "fox", "cat", "bird", "bird"
        );
        String word = "bird";
        int occuranceCount = countOccurance (stringList, word);
        System.out.println ("Occurrences of \"" + word + "\": " +occuranceCount);

        Integer[] array = {1, 2, 3};
        List<Integer> integerList = toList (array);
        System.out.println ("List: " + integerList);
        List<Integer> numericList = Arrays.asList (1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        List<Integer> uniqueList = findUnique(numericList);
        System.out.println ("Unique numbers: " + uniqueList);

        calcOccurrence(stringList);
        List<Map<String, Object>> occurrenceList = findOccurrence(stringList);
        System.out.println ("Occurrences: ");
        for (Map<String, Object> occurrence : occurrenceList) {
            String name = (String) occurrence.get ("name");
            int occurrenceCount = (int) occurrence.get ("occurrence");
            System.out.println ("Name: " + name + " , Occurrence: " + occurrenceCount);

        }
    }
    public static int countOccurance(List<String> stringList, String word) {
        int count = 0;
        for (String str : stringList){
            if (str.equals (word)) {
                count++;
            }
        }
        return count;
    }
    public static <T> List<T> toList(T[] array) {
        return Arrays.asList(array);
    }
    public static List<Integer> findUnique(List<Integer> numericList) {
        List<Integer> uniqueList = new ArrayList<> ();
        for (Integer num : numericList) {
            if (!uniqueList.contains (num)) {
                uniqueList.add (num);
            }
        }
        return uniqueList;
    }
    public static void calcOccurrence(List<String> stringList) {
        Map<String, Integer> occurrenceMap = new HashMap<> ();
        for (String word : stringList) {
            occurrenceMap.put(word, occurrenceMap.getOrDefault (word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : occurrenceMap.entrySet ()) {
            System.out.println (entry.getKey () + ": " + entry.getValue ());
        }
    }
    public static List<Map<String, Object>> findOccurrence(List<String> stringList) {
        List<Map<String, Object>> occurrenceList = new ArrayList<> ();
        Map<String, Integer> occurrenceMap = new HashMap<> ();
        for (String word : stringList) {
            occurrenceMap.put (word, occurrenceMap.getOrDefault (word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : occurrenceMap.entrySet ()) {
            Map<String, Object> occurrence = new HashMap<> ();
            occurrence.put ("name", entry.getKey ());
            occurrence.put ("occurrence", entry.getValue ());
            occurrenceList.add (occurrence);
        }
        return occurrenceList;
    }
}
