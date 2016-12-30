import java.util.ArrayList;
import java.util.Collection;

public class FoldArray
{
    public static int[] foldArray(int[] array, int runs)
    {
        for (int i = 0; i < runs; i++) {
            array = foldArray(array);
        }

        return array;
    }

    private static int[] foldArray(int[] array)
    {
        int length = array.length;
        int l = length % 2 == 0 ? length / 2 : (length / 2) + 1;

        int[] dest = new int[l];

        int end = length - 1;
        for (int start = 0; start < l; start++) {
            if (start == end) {
                dest[start] = array[start];
            } else {
                dest[start] = array[start] + array[end];
            }
            end--;
        }

        return dest;
    }

    // 1,2,3,4,5,8,5 -->
    //                  6,10,8,4
    //                  10,18

    public static void main(String[] args)
    {
        display(foldArray(new int[]{1, 2, 3, 4, 5, 8, 5}, 2));
    }

    private static void display(int[] foldArray)
    {
        for (int f : foldArray) {
            System.out.println(f);
        }

        Collection<String> coll = new ArrayList<>();
        coll.add("aa");
        coll.remove(0);
        System.out.println(coll);
    }
}
