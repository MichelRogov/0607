public class BoxPrinterGen<T> {
    private T val;

    public BoxPrinterGen(T val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "BoxPrinterGen{" +
                "val=" + val +
                '}';
    }

    public T getVal() {
        return val;
    }
}
