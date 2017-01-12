package javabasics;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

public class ListToArray
{
    public static void main(String[] args)
    {
        listToArray();
        System.out.println("******************************");
        arrayToList();
    }

    public static void listToArray()
    {
        List<Integer> list = Lists.newArrayList(11, 2, 3, 4, 5, 1);
        System.out.println("ORIGINAL:" + list);
        Integer[] arr = new Integer[list.size()];

        list.toArray(arr);

        list.remove(new Integer(1));

        System.out.println("REMOVED:" + list);

        System.out.println("ARRAY" + Arrays.toString(arr));
    }

    public static void arrayToList()
    {
        Integer[] arr = new Integer[]{11, 2, 3, 4, 5, 1};

        List<Integer> list = Arrays.asList(arr);

        System.out.println("Original array:" + Arrays.toString(arr));

        System.out.println("Removing from array");

        list.remove(new Integer(1));

        System.out.println("Removed list:" + list);

        System.out.println("Arrays after removing from list"+ Arrays.toString(arr));
    }
}
