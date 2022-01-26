public class CheckPermutation {
    public static boolean checkPermutation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        int[] alphabet = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            alphabet[s1.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < s2.length(); i++) {
            alphabet[s2.charAt(i) - 'a'] -= 1;
        }
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPermutation("absce", "ecsba"));
        System.out.println(checkPermutation("abc", "cba"));
        System.out.println(checkPermutation("abc", "dew"));

    }
}
