import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) throws FileNotFoundException {

        // 1) Считывать из строки
        /*String str = "Hello, world! 123";
        Scanner scanner = new Scanner(str); // str - откуда считывать
        while (!scanner.hasNextInt()) { // проверка на нечисловое значение
            System.out.println(scanner.next()); // вывод текста
        }*/

        // 2) Считывать из консоли
        /*Scanner scanner = new Scanner(System.in); // считывать из потока ввода
        while (!scanner.hasNextInt()) { // проверка на нечисловое значение
            System.out.println(scanner.next()); // вывод текста
        }*/

        // 3) Считывать из файла
        Scanner scanner = new Scanner(new File("test.txt")); // считывать из файла
        while (!scanner.hasNextInt()) { // проверка на нечисловое значение
            System.out.println(scanner.next()); // вывод текста
        }
    }
}
