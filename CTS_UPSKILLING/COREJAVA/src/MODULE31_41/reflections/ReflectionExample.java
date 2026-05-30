package MODULE31_41.reflections;
import java.lang.reflect.Method;

public class ReflectionExample {

    public static void main(String[] args) throws Exception {

        Class<?> cls =
                Class.forName("Employee");

        System.out.println("Methods:");

        Method[] methods =
                cls.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Object obj =
                cls.getDeclaredConstructor()
                        .newInstance();

        Method method =
                cls.getDeclaredMethod("display");

        method.invoke(obj);
    }
}
