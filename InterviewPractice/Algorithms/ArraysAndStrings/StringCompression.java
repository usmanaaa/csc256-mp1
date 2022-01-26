public class StringCompression {

    public static String stringCompression(String s) {
        StringBuilder compressor = new StringBuilder();
        char currLetter = s.charAt(0);
        int count = 0;
        int i = 0;

        while (i <= s.length()) {
            if (i == s.length()) { // End of string
                compressor.append(currLetter);
                compressor.append(count);
            } else {
                if (currLetter == s.charAt(i)) {
                    count++;
                } else {
                    compressor.append(currLetter);
                    compressor.append(count);
                    count = 1;
                    currLetter = s.charAt(i);
                }
            }
            i++;

        }

        String compressed = compressor.toString();

        if (compressed.length() < s.length()) {
            return compressed;
        } else {
            return s;
        }
    }

    public static void main(String[] args) {
        System.out.println(stringCompression("aaaaaaaaabbhhhchcihchh"));
    }

}
