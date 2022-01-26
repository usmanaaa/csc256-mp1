public class URLify {
    public static void urlify(String s) {
        String replacement = "%20";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                s.charAt(i) = replacement;
        }
    }
}
