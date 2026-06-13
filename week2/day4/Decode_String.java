package week2.day4;

import java.util.*;

class Solution {
    public String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder current = new StringBuilder();
        int num = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            else if (ch == '[') {
                countStack.push(num);
                stringStack.push(new StringBuilder(current));

                current = new StringBuilder();
                num = 0;
            }

            else if (ch == ']') {
                int k = countStack.pop();
                StringBuilder prev = stringStack.pop();

                StringBuilder decoded = new StringBuilder(prev);

                for (int i = 0; i < k; i++) {
                    decoded.append(current);
                }

                current = decoded;
            }

            else {
                current.append(ch);
            }
        }

        return current.toString();
    }
}