public class IsUnique {

    public static boolean IsUnique(String word) {
        int[] alphabet = new int[58];

        for (int i = 0; i < word.length(); i++) {
            if (alphabet[word.charAt(i) - 'A'] == 0) {
                alphabet[word.charAt(i) - 'A'] = 1;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(IsUnique("absce"));
        System.out.println(IsUnique("aaaaaaa"));
        System.out.println(IsUnique("abveirva"));
        System.out.println(IsUnique("alcd"));
        System.out.println(IsUnique("Acsa"));
        System.out.println(IsUnique("AcsaVedvE"));

    }

}
