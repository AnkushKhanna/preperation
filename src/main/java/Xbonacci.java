public class Xbonacci
{
    public double[] xbonacci(double[] signature, int n)
    {
        int size = signature.length;

        if (size == n) {
            return signature;
        }

        double[] series = new double[n];

        if (size > n) {
            System.arraycopy(signature, 0, series, 0, n);
            return series;
        }

        System.arraycopy(signature, 0, series, 0, size);

        for (int i = size; i < n; i++) {
            double value = 0;
            for (int j = i - 1; j > i - 1 - size; j--) {
                value += series[j];
            }
            series[i] = value;
        }

        return series;
    }

    public static void main(String[] args)
    {
        Xbonacci variabonacci = new Xbonacci();
        double[] xbonacci = variabonacci.xbonacci(new double[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 5);
        for (double c : xbonacci) {
            System.out.println(c);
        }
    }
}
