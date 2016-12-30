import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Order
{
    public static void main(String[] args)
    {
        System.out.println(order("is2 Thi1s T4est 13a"));
    }

    public static String order(String words)
    {
        if(words.isEmpty()){
            return "";
        }

        List<StringWithNumber> list = Arrays.stream(words.split(" ")).map(StringWithNumber::new)
            .collect(Collectors.toList());

        Collections.sort(
            list, (StringWithNumber s1, StringWithNumber s2) -> new Integer(s1.number).compareTo(s2.number));

        return list.stream().map(s -> s.value).collect(Collectors.joining(" "));
    }
}

class StringWithNumber
{
    public String value;

    public int number;

    private Pattern p = Pattern.compile("[0-9]+");

    public StringWithNumber(final String value)
    {
        this.value = value;

        this.number = findNumber(value);
    }

    private int findNumber(final String value)
    {
        Matcher matcher = p.matcher(value);
        matcher.find();
        return Integer.parseInt(matcher.group());
    }
}
