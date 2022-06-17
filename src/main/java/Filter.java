import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int counter = 0;

        for (int num : source) {
            if (num <= threshold) {
                logger.log("Элемент " + num + " не проходит");
            } else {
                logger.log("Элемент " + num + " проходит");
                result.add(num);
                counter++;
            }
        }

        logger.log("Прошло фильтр " + counter + " элемента из " + source.size());

        logger.log("Выводим результат на экран\n" +
                "Отфильтрованный список: " + result);

        return result;
    }
}
