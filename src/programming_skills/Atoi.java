package programming_skills;

public class Atoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("-6147483648"));
    }

    public static int myAtoi(String s) {
        if (s.isEmpty()) return 0;

        char[] arr = s.toCharArray();
        int idx = 0;
        boolean minus = false;
        int result = 0, num;
        long nv = result;

        while (idx < arr.length - 1 && (arr[idx] < '0' || arr[idx] > '9') && arr[idx] != '-' && arr[idx] != '+') {
            if (arr[idx] != '+' && arr[idx] != '-' && arr[idx] != ' ' && arr[idx] != '0') return 0;
            if (idx > 0 && arr[idx - 1] == '+' && arr[idx] == '-') return 0; //+- situation
            if (idx > 0 && arr[idx - 1] == '-' && arr[idx] == '+') return 0; //-+ situation
            idx++;
        }

        if (arr[idx] == '-') {
            minus = true;
            idx++;
        } else if (arr[idx] == '+') idx++;

        for (int i = idx; i < arr.length; i++) {
            if (arr[i] < '0' || arr[i] > '9') {
                if (arr[i] == ' ') break;
                if (arr[i] == '.') return minus ? result * -1 : result;
                return minus ? result * -1 : result;
            }
            num = arr[i] - '0';

            nv *= 10;
            nv += num;

            if (nv > Integer.MAX_VALUE) return minus ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            result = (int) nv;
        }

        return minus ? result * -1 : result;
    }
}
