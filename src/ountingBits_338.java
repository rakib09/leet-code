import java.util.Arrays;

public class ountingBits_338 {
    static int[] countBits(int n) {
        int[] def = new int[n+1];
        int offset = 1;
        for (int i = 1; i < (n+1); i++) {
            if ((offset*2) == i) {
                offset = i;
            }
            def[i] = 1 + def[i - offset];
        }
        return def;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }
}
