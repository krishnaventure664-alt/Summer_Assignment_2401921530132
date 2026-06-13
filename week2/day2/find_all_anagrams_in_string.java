package week2.day2;
import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        int k = p.length();

        char[] pattern = p.toCharArray();
        Arrays.sort(pattern);

        for (int i = 0; i <= s.length() - k; i++) {

            String sub = s.substring(i, i + k);

            char[] temp = sub.toCharArray();
            Arrays.sort(temp);

            if (Arrays.equals(pattern, temp)) {
                result.add(i);
            }
        }

        return result;
    }
}
