import java.util.Iterator;

public class ArrayIterator implements Iterator {

    int[] arr;
    int size;
    int currIndex = 0;

    ArrayIterator(int[] arr, int size) {
        this.arr = arr;
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return currIndex < size;
    }

    @Override
    public Integer next() {
        int res = arr[currIndex];
        currIndex++;
        return res;
    }
}
