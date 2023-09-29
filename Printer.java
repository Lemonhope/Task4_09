package Task4_09;

public class Printer {
    // Declaring ANSI_RESET so that we can reset the color
    protected static final String ANSI_RESET = "\u001B[0m";
    // Declaring the color
    protected static String ansiColorname;
    public void print(String value){
        ansiColorname = "\u001B[33m";
        System.out.println(ansiColorname + value + ANSI_RESET);
    }
}

