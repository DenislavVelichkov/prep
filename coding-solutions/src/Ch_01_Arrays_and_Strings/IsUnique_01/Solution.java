package Ch_01_Arrays_and_Strings.IsUnique_01;

public class Solution {
    public static void main(String[] args) {
        String[] words = {"asd", "asdfa"};
        for (String word : words) {
            System.out.println(word + " -> " + doesHaveUniqueCharacters(word));
        }
    }

    static boolean doesHaveUniqueCharacters(String str) {
        //chars count reference: https://www.asciitable.com/
        if (str.length() > 128) {
            return false;
        }

        boolean[] decimalAsciiTable = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int decimalCharacter = str.charAt(i);
            if (decimalAsciiTable[decimalCharacter]) return false;
            decimalAsciiTable[decimalCharacter] = true;
        }

        return true;
    }
}

/*    static boolean isPermutationOfPalindrome(String[] phrase) {
        int[] table = buildCharFrequencyTable(phrase);
        return checkMaxOneOdd(table);
    }

    private static boolean checkMaxOneOdd(int[] table) {

    }

    private static int[] buildCharFrequencyTable(String phrase) {
        int ta
    }
}*/
