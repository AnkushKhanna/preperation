package gfg.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordBreakProblem
{
    public static boolean find(String str, Set<String> dict)
    {
        return find(str, dict, new HashMap<>());
    }

    private static boolean find(String str, Set<String> dict, Map<String, Boolean> memory)
    {
        if (str.length() == 0) {
            return true;
        }

        if (memory.containsKey(str)) {
            return memory.get(str);
        }

        for (int i = 0; i < str.length(); i++) {
            String str1 = str.substring(0, i);
            String str2 = str.substring(i);

            if (dict.contains(str1) && dict.contains(str2)) {
                return true;
            }

            if (dict.contains(str1)) {
                if (find(str2, dict, memory)) {
                    return true;
                } else {
                    memory.put(str2, false);
                }
            }
        }

        memory.put(str, false);
        return false;
    }
}
