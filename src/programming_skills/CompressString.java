package programming_skills;

public class CompressString {

    public static void main(String[] args) {
//        System.out.println(compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
//        System.out.println(compress(new char[]{'a','a','b','b','c','c','c'}));
        System.out.println(compress(new char[]{'a', 'b', 'c'}));
    }

    public static int compress(char[] chars) {
        char prevChar = chars[0], c;
        int l = 0, idx = 0;

        for (int i = 0; i <= chars.length; i++) {
            c = i != chars.length ? chars[i] : chars[i - 1];

            if (c != prevChar || i == chars.length) {
                if (l > 1) {
                    chars[idx] = prevChar;
                    String n = String.valueOf(l);

                    for (int j = 0; j < n.length(); j++) {
                        chars[idx + j + 1] = n.charAt(j);
                    }
                    idx += n.length() + 1;
                } else if (l == 1) {
                    chars[idx] = prevChar;
                    idx++;
                }

                l = 1;
                prevChar = c;
            } else l++;
        }

        return idx;
    }
}
