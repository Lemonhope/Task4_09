package Task4_09;

public class PrinterExtend extends Printer{

    @Override
    public void print(String value) {
        ansiColorname = "\u001B[35m";
        System.out.println(ansiColorname + value + ANSI_RESET);
    }
}
