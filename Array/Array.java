import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class Array implements Iterable{

    private int[] arr;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;


    Array() {
        arr = new int[DEFAULT_CAPACITY];
    }


    Array(int capacity) {
        arr = new int[capacity];
    }


    public int getSize() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public int indexOf(int number) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }


    public int lastIndexOf(int number) {
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }


    public int get(int index) {
        if (index < size) {
            return arr[index];
        }
        return -1;
    }


    public int set(int index, int number) {
        int oldValue = -1;
        if (index < size) {
            oldValue = arr[index];
            arr[index] = number;
        }
        return oldValue;
    }


    public boolean add(int number) {
        ensureCapacity();
        arr[size] = number;
        size++;
        return true;
    }


    public boolean addAtPosition(int index, int number) {
        if (index >= size) {
            return false;
        }
        ensureCapacity();
        int[] oldArr = copyArray(size);
        size++;
        arr[index] = number;
        for (int i = index + 1; i < size; i++) {
            arr[i] = oldArr[i - 1];
        }
        return true;
    }


    public int remove(int number) {
        int foundIndex = indexOf(number);
        if (foundIndex == -1) {
            return -1;
        }
        int[] oldArr = copyArray(size);
        int oldValue = arr[foundIndex];
        size--;
        for (int i = foundIndex; i < size; i++) {
            arr[i] = oldArr[i + 1];
        }
        return oldValue;
    }


    private void ensureCapacity() {
        if (size == arr.length) {
            int newSize = arr.length * 2;
            arr = copyArray(newSize);
        }
    }


    private int[] copyArray(int newSize) {
        int[] newArr = new int[newSize];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator(arr, size);
    }

    public int[] getArr() {
        return arr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        return size == array.size &&
                Arrays.equals(arr, array.arr);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(arr);
        return result;
    }
}
