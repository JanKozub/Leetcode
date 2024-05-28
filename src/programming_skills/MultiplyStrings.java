package programming_skills;

public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println(multiply("2", "3"));
    }

    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        if (num1.equals("1")) return num2;
        if (num2.equals("1")) return num1;

        int[] result = new int[num1.length() + num2.length()];
        char[] c1 = num1.toCharArray();
        char[] c2 = num2.toCharArray();

        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int multiplied = CTI(c1[i]) * CTI(c2[j]);
                int idx2 = i + j + 1;
                int sum = multiplied + result[idx2];

                result[i + j] += sum / 10;
                result[idx2] = sum % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int j : result) if (!(sb.isEmpty() && j == 0)) sb.append(j);

        System.out.println(sb);
        return sb.toString();
    }

    private static int CTI(char n) {
        return n - '0';
    }
}
