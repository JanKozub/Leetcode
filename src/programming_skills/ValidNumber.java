package programming_skills;

public class ValidNumber {
    public static void main(String[] args) {

    }

    public boolean isNumber(String s) {
        char[] chars = s.toCharArray();
        boolean dotExists = false, eExists = false, isDecimal = false;
        char c = chars[0];

        if (chars.length == 1) return isSingleDigitValid(chars[0]);

        if (!isStartValid(c)) return false;
        if (!isLastCharValid(chars)) return false;

        for (int j = 0; j < chars.length; j++) {
            char cc = chars[j];

            if (cc == '.')  {
                if(dotExists) return false;
                else dotExists = true;
            }

            if (isE(cc)) {
                if(eExists) return false;
                else eExists = true;
            }

            if (!dotExists && Character.isDigit(cc)) isDecimal = true;

            if (eExists && cc == '.') return false;
        }

        char prevChar = c;

        if (Character.isDigit(prevChar)) isDecimal = true;

        for (int i = 1; i < chars.length; i++) {
            c = chars[i];

            if (Character.isDigit(prevChar) && (c == '+' || c == '-')) return false;

            if (Character.isAlphabetic(c) && !isE(c)) return false;

            if (isPrevAndCurrentInvalid(prevChar, c)) return false;

            if (!dotExists && Character.isDigit(c)) isDecimal = true;

            if (prevChar == '.' && isE(c) && !isDecimal) return false;

            prevChar = chars[i];
        }

        return true;
    }

    private boolean isLastCharValid(char[] chars) {
        char c = chars[chars.length - 1];

        if (chars.length > 1) {
            char p = chars[chars.length - 2];
            if ((p == '+' && c == '.') || (p == '-' && c == '.') || (isE(p) && c == '+')) return false;
        }

        return c != '-' &&  c != '+' && !isE(c);
    }

    private boolean isSingleDigitValid(char c) {
        return Character.isDigit(c);
    }

    private boolean isE(char c) {
        return c == 'e' || c == 'E';
    }

    private boolean isStartValid(char c) {
        return c == '+' || c == '-' || c == '.' || Character.isDigit(c);
    }

    private boolean isPrevAndCurrentInvalid(char prev, char current) {
        return  (prev == '-' && isE(current)) ||
                (prev == '+' && isE(current)) ||
                (isE(prev) && current == '.') ||
                (prev == '.' && current == '-') ||
                (prev == '.' && current == '+') ||
                (prev == '-' && current == '+') ||
                (prev == '+' && current == '-') ||
                (prev == '+' && current == '+');
    }
}
