package session14_javaCollectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDirectory {

    public static void main(String[] args) {
        Map<String, String> employeeMap1 = new HashMap<>();
        employeeMap1.put("E100", "Alice"); //E100 - employee 100
        employeeMap1.put("E101", "John");
        employeeMap1.put("E102", "Andrew");

        Map<String, String> employeeMap2 = new HashMap<>();
        employeeMap2.put("E102", "Andrew");
        employeeMap2.put("E103", "Joe");

        displayEmployeeInfo(employeeMap1);

        Map<String, String> commonEntriesMap = getCommonEntries(employeeMap1, employeeMap2);
        System.out.println("Common entries from map:");
        displayEmployeeInfo(commonEntriesMap);
    }

    private static void displayEmployeeInfo(Map<String, String> map) {
        for (Map.Entry<String, String> employee : map.entrySet()) {
            System.out.println("Employee id: " + employee.getKey() + ", employee name: " + employee.getValue());
        }
    }

    private static Map<String, String> getCommonEntries(Map<String, String> firstMap, Map<String, String> secondMap) {
        Map<String, String> result = new HashMap<>();

        for (String key : firstMap.keySet()) {
            if (secondMap.containsKey(key) && secondMap.get(key).equals(firstMap.get(key))) {
                result.put(key, firstMap.get(key));
            }
        }
        return result;
    }
}