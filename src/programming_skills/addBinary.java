package programming_skills;

public class addBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        char num1, num2;
        int overflow = 0;

        char[] b1 = a.toCharArray();
        char[] b2 = b.toCharArray();

        for (int i = 0; i < Math.max(b1.length, b2.length); i++) {
            num1 = b1.length - i - 1 >= 0 ? b1[b1.length - i - 1] : '0';
            num2 = b2.length - i - 1 >= 0 ? b2[b2.length - i - 1] : '0';

            if (num1 == '0' && num2 == '0') {
                sb.append(overflow == 0 ? '0' : '1');
                overflow = 0;
            } else if ((num1 == '1' && num2 == '0') || (num1 == '0' && num2 == '1')) {
                sb.append(overflow == 0 ? '1' : '0');
            } else if (num1 == '1' && num2 == '1') {
                sb.append(overflow == 0 ? '0' : '1');
                overflow = 1;
            }
        }
        if (overflow == 1) sb.append('1');

        return sb.reverse().toString();
    }
}
