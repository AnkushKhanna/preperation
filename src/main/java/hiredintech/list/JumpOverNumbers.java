package hiredintech.list;

import java.util.List;

public class JumpOverNumbers
{
    public static int jump_over_numbers(List<Integer> list)
    {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        int jump = 0, index = 0;

        while (index < list.size()) {
            int value = list.get(index);
            index += value;
            jump++;
            if (jump > 1000) {
                return -1;
            }
        }

        return jump;
    }
}
