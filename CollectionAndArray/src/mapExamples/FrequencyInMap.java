package mapExamples;

import java.util.HashMap;
import java.util.Map;

public class FrequencyInMap {

    public static void main(String[] args) {
        String str = "HINDUSTAN";
        Map<Character, Integer> map=findFrequency(str);
        System.out.println(map);
    }

    private static Map<Character, Integer> findFrequency(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (!frequencyMap.containsKey(input.charAt(i))) {
                frequencyMap.put(input.charAt(i), 1);
            } else {
                Integer lastFrequency = frequencyMap.get(input.charAt(i));
                frequencyMap.put(input.charAt(i), lastFrequency + 1);
            }
        }
        return frequencyMap;
    }

}
