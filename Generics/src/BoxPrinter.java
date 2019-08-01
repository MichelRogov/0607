public class BoxPrinter {
    private Object val;

    public BoxPrinter(Object val) {
        this.val = val;
    }

    public Object getVal() {
        return val;
    }

    @Override
    public String toString() {
        return "BoxPrinter{" +
                "val=" + val +
                '}';
    }
}
