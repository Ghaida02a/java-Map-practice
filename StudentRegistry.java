import java.util.HashMap;
import java.util.Map;

class StudentRegistry {
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();

        Map<Integer, String> studentIdToName = new HashMap<>();
        studentIdToName.put(1, "Ghaida");
        studentIdToName.put(2, "Waad");
        studentIdToName.put(3, "Fajr");

        Map<String, Integer> nameToStudentId = registry.invertMap(studentIdToName);

        System.out.println("Original Map (ID -> Name): " + studentIdToName);
        System.out.println("Inverted Map (Name -> ID): " + nameToStudentId);
    }
    /**
     * TO-DO: Invert the given map.
     * The keys of the original map should become the values of the new map,
     * and the values should become the keys.
     \*
     * @param studentIdToName A map from student ID (Integer) to student name (String).
     * @return A new map from student name (String) to student ID (Integer).
     */
    public Map<String, Integer> invertMap(Map<Integer, String> studentIdToName) {
        Map<String, Integer> nameToStudentId = new HashMap<>();
        for(Map.Entry<Integer, String> studentEntry : studentIdToName.entrySet()){
            nameToStudentId.put(studentEntry.getValue(), studentEntry.getKey());
        }
        return nameToStudentId;
    }
}