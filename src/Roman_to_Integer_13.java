import java.util.HashMap;
import java.util.Map;

public class Roman_to_Integer_13 {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0, length = s.length();
        int prevNumber = 4000;
        for(int i = 0; i < length; i++) {
            result += map.get(s.charAt(i));
            if(prevNumber < map.get(s.charAt(i))) {
                result -= 2* prevNumber;
            }
            prevNumber = map.get(s.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
