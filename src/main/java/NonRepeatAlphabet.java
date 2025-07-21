import java.util.*;
class NonRepeatAlphabet {
    public static void main(String[] args) {
      String str = "shivampratapsinghkashyap";
       Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count each character using if-else
        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                int currentCount = charCountMap.get(c);
                charCountMap.put(c, currentCount + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        // Print non-repeating characters
        System.out.println("Non-repeating characters:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
  }
}
