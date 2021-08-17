package Algorithms.Ch_01_Arrays_and_Strings.IsUnique_01;

class Solution2 {
    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            System.out.println(word + ": " + isUniqueChars(word));
        }

    }

    public static boolean isUniqueChars(String str) {
        if (str.length() > 26) { // Only 26 characters because English alphabet consists of 26 characters (a-z)
            return false;
        }
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        }
        return true;
    }
}
