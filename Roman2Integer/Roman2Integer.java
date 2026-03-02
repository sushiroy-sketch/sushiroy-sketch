package Roman2Integer;

import java.util.Arrays;

public class Roman2Integer {
    public static void main (String[]args){
        String s = "MCMXCIV";
       int res=romanToInt(s);
        System.out.println(res);
    }
    public static int romanToInt(String s) {
        int answer = 0;
        char old = '\0'; // old is initialized to null character
        for (char c: s.toCharArray()) { // Iterating through each character in the string
            answer = answer + helper(c, old); // Add the value of the current Roman numeral
            old = c; // Store the current character as old for the next iteration
        }
        return answer; // Return the final computed integer value
    }


    public static int helper(char c, char previous) {
        switch (c) {
            case 'I':
                return 1; // 'I' is always 1
            case 'V':
                if (previous == 'I') return 3; // IV -> 4 (1 + 3)
                return 5; // Otherwise, V is 5
            case 'X':
                if (previous == 'I') return 8; // IX -> 9 (1 + 8)
                return 10; // Otherwise, X is 10
            case 'L':
                if (previous == 'X') return 30; // XL -> 40 (10 + 30)
                return 50; // Otherwise, L is 50
            case 'C':
                if (previous == 'X') return 80; // XC -> 90 (10 + 80)
                return 100; // Otherwise, C is 100
            case 'D':
                if (previous == 'C') return 300; // CD -> 400 (100 + 300)
                return 500; // Otherwise, D is 500
            case 'M':
                if (previous == 'C') return 800; // CM -> 900 (100 + 800)
                return 1000; // Otherwise, M is 1000
            default:
                return 0; // For any non-recognized character, return 0
        }
    }
}
