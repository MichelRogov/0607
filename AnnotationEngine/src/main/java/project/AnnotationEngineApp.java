package project;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.reflections.Reflections;
import project.engine.ConsoleInput;
import project.engine.RequestBody;
import project.engine.Service;
import project.engine.StartMethod;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Scanner;
import java.util.Set;

public class AnnotationEngineApp {

    @SneakyThrows
    public static void main(String[] args) {

        Reflections reflections = new Reflections();

        Set<Class<?>> services = reflections.getTypesAnnotatedWith(Service.class);

        services.forEach(System.out::println);
        Scanner scanner = new Scanner(System.in);

        for(Class clazz : services) {
            Object serviceInstance = clazz.newInstance();

            Method[] declaredMethods = clazz.getDeclaredMethods();

            for (Method method : declaredMethods) {

                if(!method.isAnnotationPresent(StartMethod.class)){
                    continue;
                }
                Parameter[] parameters = method.getParameters();

                String input = null;
                Object requestBodyInput = null;
                for (Parameter parameter : parameters) {
                    if (parameter.isAnnotationPresent(ConsoleInput.class)) {
                        ConsoleInput consoleInput = parameter.getAnnotation(ConsoleInput.class);
                        System.out.println(consoleInput.displayMassage());
                        input = scanner.nextLine();
                    }

                    if (parameter.isAnnotationPresent(RequestBody.class)) {
                        System.out.println("Enter JSON: ");
                        input = scanner.nextLine();
                        ObjectMapper om = new ObjectMapper();
                        requestBodyInput = om.readValue(input, parameter.getType());
                    }
                }

                if(input != null && requestBodyInput == null) {
                    method.invoke(serviceInstance, input);
                } else if (requestBodyInput != null && method.isAnnotationPresent(RequestBody.class)) {
                    method.invoke(serviceInstance, requestBodyInput);
                } else {
                    Object[] params = new Object[parameters.length];
                    method.invoke(serviceInstance, params);
                }
            }
        }
        scanner.close();
    }
}
