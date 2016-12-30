public class Singleton
{
    private static Singleton instance = new Singleton();

    public static Singleton Instance()
    {
        return instance;
    }

    private Singleton()
    {
    }
}

