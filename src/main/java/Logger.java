import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    protected int num = 1;

    //единственный объект класса
    private static Logger logger;

    // скрываем конструктор
    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }


    public void log(String msg) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("[" + dtf.format(now) + " " + num++ + "] " + msg);
    }
}
