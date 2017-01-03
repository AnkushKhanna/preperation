import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DataReverse
{
    public static void main(String[] args)
    {
        int[] data1= {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0};
//        int[] data2= {1,0,1,0,1,0,1,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1};
//
//        Arrays.stream(DataReverse(data1)).forEach(b -> System.out.println(b));
        System.out.println(Arrays.toString(DataReverse(data1)));
    }

    public static int[] DataReverse(int[] data)
    {
        int size = data.length / 8;

        List<List<Integer>> bytes = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            List<Integer> bits = new ArrayList<>();
            for (int b = i * 8; b < (i * 8) + 8; b++) {
                bits.add(data[b]);
            }
            bytes.add(bits);
        }

        Collections.reverse(bytes);

        // do it via System.arraycopy(source, sourceStartIndex, destination, destinationStartIndex, length);

        return bytes.stream().flatMap(Collection::stream).mapToInt(b -> b).toArray();


    }
}
