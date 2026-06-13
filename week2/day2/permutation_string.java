package week2.day2;

import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n = s1.length();

        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);

        for (int i = 0; i <= s2.length() - n; i++) {

            String sub = s2.substring(i, i + n);

            char[] arr2 = sub.toCharArray();
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
        }

        return false;
    }
}