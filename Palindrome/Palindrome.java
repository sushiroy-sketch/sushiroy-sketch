package Palindrome;

import java.util.Arrays;

public class Palindrome {
    public static void main (String[]args){
        int nums =10;
        boolean res=isPalindrome(nums);
        System.out.println(res);
    }
        public static boolean isPalindrome(int x) {
            if (x < 0) return false;

            int original = x, reversed = 0;
            while (x != 0) {
                reversed = reversed * 10 + x % 10;
                x /= 10;
            }

            return original == reversed;
        }
}
