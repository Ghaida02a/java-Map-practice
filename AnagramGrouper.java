import java.util.*;

class AnagramGrouper {
    public static void main(String[] args) {
        AnagramGrouper grouper = new AnagramGrouper();

        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> grouped = grouper.groupAnagrams(words);

        System.out.println("Grouped Anagrams:");
        for (List<String> group : grouped) {
            System.out.println(group);
        }
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String originalString : strs){
            char[] convertingString = originalString.toCharArray();
            Arrays.sort(convertingString);//The sort is lexicographical (dictionary order).
            String key = new String(convertingString); // sorted string as key

            anagramMap.computeIfAbsent(key, k -> new ArrayList<>()).add(originalString);

        }
        return new ArrayList<>(anagramMap.values());
    }
}