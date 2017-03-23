package Exercise3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by computer on 23/03/17.
 */
public class CountChar {

    public static String buildString(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (String s : args) {
            builder.append(s);
        }
        return builder.toString();
    }


    public static void main(String[] args) {
        String str = buildString(args);
        int len = str.length();
        Map<Character, Integer> countCar = new HashMap<>();

        for (int i = 0; i < len; ++i)
        {
            char charAt = str.charAt(i);

            if (!countCar.containsKey(charAt))
            {
                countCar.put(charAt, 1);
            }
            else
            {
                countCar.put(charAt, countCar.get(charAt) + 1);
            }
        }

        System.out.println(countCar);
    }
}
