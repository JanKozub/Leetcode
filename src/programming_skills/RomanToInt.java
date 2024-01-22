package programming_skills;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("M"));
    }

    public static int romanToInt(String s) {
        s = s + '-';
        char[] chars = s.toCharArray();
        int result = 0, charCounter;
        char[] whole = new char[]{'I', 'X', 'C', 'M', '/'};
        char[] half = new char[]{'V', 'L', 'D', '[', '['};
        int[] values = new int[]{1, 10, 100, 1000};

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (chars[i] == whole[j]) {
                    if (chars[i + 1] == whole[j + 1]) {
                        result += 9 * values[j];
                        i++;
                    } else if (chars[i + 1] == half[j]) {
                        result += 4 * values[j];
                        i++;
                    } else if (chars[i + 1] == whole[j]) {
                        charCounter = 1;
                        while (chars[i + 1] == whole[j]) {
                            charCounter++;
                            i++;
                        }
                        result += charCounter * values[j];
                    } else {
                        result += values[j];
                    }
                    break;
                } else if (chars[i] == half[j]) {
                    result += 5 * values[j];
                }
            }
        }

        return result;
    }
}
