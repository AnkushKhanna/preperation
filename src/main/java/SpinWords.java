import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords
{
    public String spinWords(String sentence)
    {
        String[] words = sentence.split(" ");
        return Arrays.stream(words)
            .map(this::spin)
            .collect(Collectors.joining(" "));
    }

    private String spin(String word)
    {
        if (word.length() > 4) {
            StringBuilder str = new StringBuilder();
            str.append(word);
            return str.reverse().toString();
        }

        return word;
    }

    public static void main(String[] args)
    {
        SpinWords spinWords = new SpinWords();
        System.out.println(spinWords.spinWords("Welcome"));
        System.out.println(spinWords.spinWords("Hey fellow warriors"));
        System.out.println(spinWords.spinWords("This is a test"));
    }
}
