package com.mine.stacks_and_queues;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MatchingParens {
    private static final Map<Character, Character> matchingParanMap = new HashMap<>();
    private static final Set<Character> openingParanSet = new HashSet<>();

    static {
        matchingParanMap.put(')', '(');
        matchingParanMap.put(']', '[');
        matchingParanMap.put('}', '{');
        openingParanSet.addAll(matchingParanMap.values());
    }

    public static boolean hasMatchingParens(String input) {
        try {
            Stack<Character> parenStack = new Stack<>();

            for (char ch : input.toCharArray()) {
                if (openingParanSet.contains(ch)) {
                    parenStack.push(ch);
                }
                if (matchingParanMap.containsKey(ch)) {
                    Character lastParen = parenStack.pop();
                    if (ch != lastParen) {
                        return false;
                    }
                }
            }
            return parenStack.isEmpty();
        } catch (StackOverflowException soe) {
            System.err.println("StackOverflowException");
        } catch (StackUnderflowException sue) {
            System.err.println("StackUnderflowException");
        }
        return false;
    }
}
