import java.lang.reflect.Array;

public class ReflectionArray {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        int[] intArr = new int[0];

        System.out.println(intArr);

        Class<? extends int[]> clazz = intArr.getClass();
        System.out.println("isArray" + clazz.isArray());
        System.out.println("typeName " + clazz.getTypeName());

        Class<?> componentType = clazz.getComponentType();
        System.out.println("componentType " + componentType);

        float[] flArr = (float[]) Array.newInstance(float.class, 5);
        System.out.println("flArr length: " + flArr.length);
        System.out.println("flArr type name: " + flArr.getClass().getTypeName());
    }
}
