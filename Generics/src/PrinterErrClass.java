public class PrinterErrClass implements PrinterInterface {

    @Override
    public void print() {
        System.err.println("Error");
    }
}
