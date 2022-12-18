import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int userAnswer; // вводим переменную для ответа пользователя
        while (true) { // запускаем цикл, чтобы получить значение вводной больще единицы
            System.out.println("How many persons?"); // первая фраза
            Scanner scanner = new Scanner(System.in); //создаем сканнер для ввода данных с консоли
            try {
                userAnswer = scanner.nextInt();
                if (userAnswer == 1)
                    System.out.println("Only one?");
                else if (userAnswer < 1)
                    System.out.println("Put in more than 0");
                else
                    break;
            } catch (InputMismatchException i){
                System.out.println("Input only numbers");
            }
        }
        Calculate prod = new Calculate();
        prod.personsCalculate(userAnswer);
    }
}