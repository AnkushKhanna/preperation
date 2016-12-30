import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NFormat
{
    public static void main(String[] args) throws ParseException
    {
        String text = "13.2 GB";
        NumberFormat nf_in = NumberFormat.getNumberInstance(Locale.GERMANY);

        System.out.println(nf_in.format(text));

        double val = nf_in.parse(text).doubleValue();

        System.out.println(val);

        NumberFormat nf_out = NumberFormat.getNumberInstance(Locale.UK);
        nf_out.setMaximumFractionDigits(3);
        String output = nf_out.format(val);

        System.out.println(output);

    }
}
