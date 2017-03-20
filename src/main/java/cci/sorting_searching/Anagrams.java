package cci.sorting_searching;

import java.util.Arrays;

public class Anagrams
{
    public static int numberNeeded(String first, String second)
    {

        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        int deleted = 0;

        return numberNeeded(firstArray, secondArray, 0, 0, deleted);

    }

    private static int numberNeeded(
        final char[] firstArray, final char[] secondArray,
        int firstIndex, int secondIndex, int deleted
    )
    {
        if(firstIndex >= firstArray.length && secondIndex >= secondArray.length){
            return deleted;
        }

        if (firstArray.length <= firstIndex) {
            return numberNeeded(firstArray, secondArray, firstIndex, secondIndex + 1, deleted + 1);
        } else if (secondArray.length <= secondIndex) {
            return numberNeeded(firstArray, secondArray, firstIndex + 1, secondIndex, deleted + 1);
        } else if (firstArray[firstIndex] == secondArray[secondIndex]) {
            return numberNeeded(firstArray, secondArray, firstIndex + 1, secondIndex + 1, deleted);
        } else if (firstArray[firstIndex] < secondArray[secondIndex]) {
            return numberNeeded(firstArray, secondArray, firstIndex + 1, secondIndex, deleted + 1);
        } else {
            return numberNeeded(firstArray, secondArray, firstIndex, secondIndex + 1, deleted + 1);
        }
    }
}
