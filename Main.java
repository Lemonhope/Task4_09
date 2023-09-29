// Створіть проект з класом Main.java.
//Потрібно: Створити клас Printer. У тілі класу створіть метод void print(String value), який виводить на екран значення аргументу.
// Реалізуйте можливість того, щоб у разі успадкування від даного класу інших класів, та виклику відповідного методу
// їх екземпляра, рядки, передані як аргументи методів, виводилися різними кольорами.
// Обовʼязково використовуйте приведення типів (Upcast / Downcast Explicitly).
package Task4_09;

public class Main {
    public static void main(String[] args) {
        Printer myPrint=new Printer();
        myPrint.print("What color is this?");
        // upcast
        Printer print = new PrinterExtend();
        print.print("something");
        // downcast explicitly
        PrinterExtend printEx = (PrinterExtend)print;
        printEx.print("what color is this");
    }
}
