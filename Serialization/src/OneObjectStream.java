import java.io.*;

public class OneObjectStream {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Alex", 30);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.bin"));

        objectOutputStream.writeObject(person);
        objectOutputStream.close();


        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.bin"));
        Person inputPerson = (Person) objectInputStream.readObject();

        System.out.println(inputPerson);


        ObjectOutputStream objectOutputStreamString = new ObjectOutputStream(new FileOutputStream("string.bin"));
        objectOutputStreamString.writeUTF("cool string");
        objectOutputStreamString.writeUTF("cool string2");
        objectOutputStreamString.close();


        ObjectInputStream objectInputStreamString = new ObjectInputStream(new FileInputStream("string.bin"));
        String coolStr = objectInputStreamString.readUTF();
        String coolStr2 = objectInputStreamString.readUTF();

        System.out.println(coolStr);
        System.out.println(coolStr2);
    }
}
