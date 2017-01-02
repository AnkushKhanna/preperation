public class CheckPrimitiveVSObject
{
    public void checkPrimitive()
    {
        int i = 10;
        checkPrimitive(i);
        System.out.println(i);
    }

    private void checkPrimitive(int i)
    {
        i = 11;
        System.out.println(i);
    }

    public void checkPrimitiveObject()
    {
        Integer i = new Integer(10);
        checkPrimitiveObject(i);
        System.out.println(i);
    }

    private void checkPrimitiveObject(Integer i)
    {
        i = new Integer(11);
        System.out.println(i);
    }

    public void checkIntegerWrapper(){
        IntegerWrapper wrapper = new IntegerWrapper();
        wrapper.i = new Integer(10);
        checkIntegerWrapper(wrapper);
        System.out.println(wrapper.i);
    }

    private void checkIntegerWrapper(final IntegerWrapper wrapper)
    {
        wrapper.i = new Integer(11);
        System.out.println(wrapper.i);
    }

    public static void main(String[] args)
    {
        CheckPrimitiveVSObject obj = new CheckPrimitiveVSObject();
        obj.checkPrimitive();
        System.out.println();
        obj.checkPrimitiveObject();
        System.out.println();
        obj.checkIntegerWrapper();
    }

    class IntegerWrapper
    {
        public Integer i;
    }
}
