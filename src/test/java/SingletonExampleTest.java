import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SingletonExampleTest
{
    SingletonExample instance = SingletonExample.getInstance();

    @Test
    public void getInstance_return_same_instance() throws Exception
    {
        SingletonExample instance2 = SingletonExample.getInstance();

        assertEquals(instance.hashCode(), instance2.hashCode());
    }

    @Test(expected = InvocationTargetException.class)
    public void singleton_reflection_throw_error() throws Exception
    {
        Constructor<?>[] constructors = SingletonExample.class.getDeclaredConstructors();
        assertEquals(1, constructors.length);
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            SingletonExample instance2 = (SingletonExample) constructor.newInstance();
        }
    }

    @Test
    public void serialization_deserialization_make_same_object() throws Exception
    {
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("/tmp/filename.ser"));
        out.writeObject(instance);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("/tmp/filename.ser"));
        SingletonExample instance1 = (SingletonExample) in.readObject();
        in.close();

        assertEquals(instance.hashCode(), instance1.hashCode());
    }
}
