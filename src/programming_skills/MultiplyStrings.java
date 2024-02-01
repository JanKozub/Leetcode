package programming_skills;

public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println(multiply("9133", "0"));
    }

    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        if (num1.equals("1")) return num2;
        if (num2.equals("1")) return num1;
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        int overflow = 0;

        StringBuilder result = new StringBuilder();

        for (int i = n1.length - 1; i >= 0; i--) {
            StringBuilder nextSum = new StringBuilder();
            for (int j = n2.length - 1; j >= 0; j--) {
                int n = CTI(n1[i]) * CTI(n2[j]);
                n += overflow;

                if (n > 9) {
                    overflow = n / 10;
                    n = n % 10;
                } else overflow = 0;
                nextSum.insert(0, n);

                //System.out.println(n1[i] + " * " + n2[j] + " N: " + n + "; ov: " + overflow);
            }
            if (overflow > 0) {
                nextSum.insert(0, overflow);
                overflow = 0;
            }

            nextSum.append("0".repeat(n1.length - 1 - i));

            //System.out.println("aktualny wynik: " + result + " ; kolejna wartosc: " + nextSum);

            if (result.isEmpty()) {
                result.append(nextSum);
                continue;
            }

            int idx = 0, number1, number2;

            while (idx <= result.length() - 1 || idx <= nextSum.length() - 1) {
                number1 = 0;
                if (result.length() - idx - 1 >= 0) {
                    number1 = CTI(result.charAt(result.length() - idx - 1));
                }

                number2 = 0;
                if (nextSum.length() - idx - 1 >= 0) {
                    number2 = CTI(nextSum.charAt(nextSum.length() - idx - 1));
                }

                int toAdd = number1 + number2 + overflow;
                if (toAdd < 10) {
                    overflow = 0;
                } else {
                    toAdd = (number1 + number2 + overflow) % 10;
                    overflow = (number1 + number2 + overflow) / 10;
                }
                if (result.length() - idx - 1 >= 0) {
                    result.setCharAt(result.length() - idx - 1, (char) ('0' + toAdd));
                } else {
                    result.insert(0, toAdd);
                }
                idx++;
            }
            if (overflow > 0) {
                result.insert(0, overflow);
                overflow = 0;
            }
        }

        return result.toString();
    }

    private static int CTI(char n) {
        return n - '0';
    }
}
