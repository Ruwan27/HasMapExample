import java.util.*;

public class DuplicateCharsInString {
    public static void main(String[] args) {
        String input = "Hello World";
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate over each character in the string and count its frequency
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (charCountMap.containsKey(c)) {
                System.out.println(charCountMap.get(c));
                charCountMap.put(c, charCountMap.get(c) + 1);
                System.out.println(charCountMap.get(c));
            } else {
                charCountMap.put(c, 1);
            }
        }

        // Print the characters that have a frequency greater than 1
        System.out.println("Duplicate characters in the string " + input + ":");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }
}

