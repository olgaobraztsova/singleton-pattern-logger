import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.println("Введите размер списка:");
        int size = scanner.nextInt();

        System.out.println("Введите верхнюю границу для значений:");
        int limit = scanner.nextInt();

        List<Integer> source = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            source.add(random.nextInt(limit));
        }

        logger.log("Создаем и наполняем список.\n" +
                "Вот случайный список: " + source);

        logger.log("Просим пользователя ввести входные данные для фильтрации");

        System.out.println("Введите порог для фильтра:");
        int threshold = scanner.nextInt();

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(threshold);
        filter.filterOut(source);

        logger.log("Завершаем программу");
    }
}
