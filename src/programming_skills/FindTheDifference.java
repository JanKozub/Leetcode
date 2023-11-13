package programming_skills;

public class FindTheDifference {
    public static void main(String[] args) {
        System.out.println(findTheDifference("a", "aa"));
    }

    public static char findTheDifference(String s, String t) {
        char[] charsT = t.toCharArray();

        for (char c : charsT) {
            int cS = countOccurrencesOf(s,c, 1000);
            int cT = countOccurrencesOf(t,c, cS);

            if (cS != cT || cS == 0) return c;
        }

        return ' ';
    }

    public static int countOccurrencesOf(String str, char sub, int maxCount) {
        int count = 0;
        int pos = 0;
        int idx;
        while ((idx = str.indexOf(sub, pos)) != -1) {
            ++count;
            pos = idx + 1;
            if (count > maxCount) break;
        }
        return count;
    }
}

/* 3ms 41.12MB

public char findTheDifference(String s, String t) {
        char[] charsS = s.toCharArray();
        Arrays.sort(charsS);
        char[] charsT = t.toCharArray();
        Arrays.sort(charsT);

        for (int i = 0; i < charsT.length; i++) {
            if (i < charsS.length) {
                if (charsT[i] != charsS[i]) {
                    return charsT[i];
                }
            } else {
                return charsT[i];
            }
        }

        return ' ';
    }

 */

/* 2ms 40.67MB
    public static char findTheDifference(String s, String t) {
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();

        for (char c : charsT) {
            int cS = countOccurrencesOf(s,c);
            int cT = countOccurrencesOf(t,c);

            if (cS != cT || cS == 0) {
                return c;
            }
        }

        return ' ';
    }

    public static int countOccurrencesOf(String str, char sub) {
        int count = 0;
        int pos = 0;
        int idx;
        while ((idx = str.indexOf(sub, pos)) != -1) {
            ++count;
            pos = idx + 1;
        }
        return count;
    }

 */