import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Alex", 30);
        Employee employee = new Employee("Financial", person);
        Employee employee2 = new Employee("Trash Manager", person);

        ArrayList<Employee> list = new ArrayList<>();

        list.add(employee);
        list.add(employee2);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("employeeArr.bin"));
        objectOutputStream.writeObject(list);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("employeeArr.bin"));
        List<Employee> employees = (List) objectInputStream.readObject();

        System.out.println(employees);
        System.out.println(employees.get(0).getPerson().equals(employees.get(1).getPerson()));

    }
}
