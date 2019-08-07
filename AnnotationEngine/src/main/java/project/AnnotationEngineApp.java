package project;

import lombok.SneakyThrows;
import org.reflections.Reflections;
import project.engine.Service;
import project.engine.StartMethod;

import java.lang.reflect.Method;
import java.util.Set;

public class AnnotationEngineApp {

    @SneakyThrows
    public static void main(String[] args) {

        Reflections reflections = new Reflections();

        Set<Class<?>> services = reflections.getTypesAnnotatedWith(Service.class);

        services.forEach(System.out::println);

        for(Class clazz : services) {
            Object serviceInstances = clazz.newInstance();

            Method[] declaredMethods = clazz.getDeclaredMethods();

            for (Method m : declaredMethods) {

                if(!m.isAnnotationPresent(StartMethod.class)){
                    continue;
                }
                m.invoke(serviceInstances);
            }

        }

    }
}
