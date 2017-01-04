import java.io.Serializable;

public class SingletonExample implements Serializable
{
    private static final long serialVersionUID = -7604766932017737115L;

    private static SingletonExample instance;

    private SingletonExample()
    {
        if (instance != null) {
            throw new InstantiationError("Singleton cannot be initialized again");
        }
    }

    public static SingletonExample getInstance()
    {
        if (instance == null) {
            synchronized (SingletonExample.class) {
                if (instance == null) {
                    instance = new SingletonExample();
                }
            }
        }
        return instance;
    }

    protected Object readResolve()
    {
        return getInstance();
    }
}
