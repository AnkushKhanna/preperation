package gfg.dynamicprogramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPass
{
    public boolean find(String[] pass, String loginAttempt)
    {
        Map<String, Boolean> memory = new HashMap<>();

        return find(pass, loginAttempt, 0, memory);
    }

    public boolean find(String[] pass, String loginAttempt, int index, Map<String, Boolean> memory)
    {
        if (loginAttempt.length() == 0) {
            return true;
        }

        if (index == pass.length) {
            return false;
        }

        //MEMORY HERE
        List<String> remove = remove(pass[index], loginAttempt);

        boolean b = false;
        for (String r : remove) {
            b = b || find(pass, r, index + 1, memory);
        }

        return b;
    }

    private List<String> remove(final String pass, String loginAttempt)
    {
        List<String> remove = new ArrayList<>();
        remove.add(loginAttempt);

        while (loginAttempt.contains(pass)) {
            String removed = loginAttempt.replaceFirst(pass, "");
            remove.add(removed);
            loginAttempt = removed;
        }

        return remove;
    }
}
