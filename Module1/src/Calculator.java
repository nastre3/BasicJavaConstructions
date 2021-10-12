import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создание сканнера для считывания из консоли
        char calculateOperation = 'q';
        double val1;
        char operation;
        double val2;
        double result = 0;
        do {
            if (calculateOperation == 'q') {
                System.out.println("Enter 1st value");
                val1 = sc.nextInt(); // 1 операнд (число, int не используется чтобы при делении на 0 была infinity)
                System.out.println("Enter operand");
                operation = sc.next().charAt(0); // мат. операция (считывание слова целоком и получение его первого символа)

            } else {
                val1 = result; // сохраняется результат выполнения 1 операции
                operation = calculateOperation; // 2 операция
            }
            System.out.println("Enter 2nd value");
            val2 = sc.nextInt(); // 2 операнд (число) всегда будет запрошен

            result = calculate(val1, operation, val2); // расчет результата
            System.out.println(result); // вывод результата
            calculateOperation = sc.next().charAt(0); //запрос у пользователя хочет ли выйти (s) или сделать сброс (q) или продолжить (cчитывает операцию)


        } while (calculateOperation !='s');
    }

    private static double calculate(double val1, char operation, double val2) {
        return switch (operation) {
            case '+' -> val1 + val2;
            case '-' -> val1 - val2;
            case '*' -> val1 * val2;
            case '/' -> val1 / val2;
            default -> {
                System.out.println("Incorrect operand input");
                yield  0; // возвращаемое значение для default в switch - аналог return
            }
        };
    }
}
