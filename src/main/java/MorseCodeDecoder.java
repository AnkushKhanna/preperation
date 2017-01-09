import java.util.Arrays;
import java.util.stream.Collectors;

public class MorseCodeDecoder
{
    public static String decode(String morseCode)
    {
        morseCode = morseCode.trim();
        String[] words = morseCode.split("   ");

        return Arrays.stream(words).map(MorseCodeDecoder::getWord).collect(Collectors.joining(" "));
    }

    private static String getWord(String word)
    {
        StringBuilder str = new StringBuilder();
        String[] characters = word.split(" ");
        for (String character : characters) {
            str.append(MorseCode.get(character));
        }
        return str.toString();
    }

    public static class MorseCode
    {
        public static String get(String code)
        {
            return "";
        }
    }
}
