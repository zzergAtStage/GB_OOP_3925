package oop.seminars.s02.supermarket.classes;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Diagnostics {
    /**
     * Конфигурирует модуль логирования работы Маркета в файл
     */
    static Logger logger = Logger.getLogger("Market.log");
    public static void startLogger(){
        FileHandler fh;
        try {
            //файл создаем в папке проекта, поскольку пока нет навыков сбора разрешений для приложения
            // которые позволили бы создавать папки или писать в произвольном месте
            File file = new File("Market.log");
            if (!file.exists()) {
                file.createNewFile();
            }
            fh = new FileHandler(file.getAbsolutePath(), true);
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Пишем лог
     * @param obj object reference
     * @param message string message
     */
    public static void logMessage(Object obj, String message){
        logger.info(obj.getClass().getName() + "# " + message);//TODO make string-builder
    }

    /**
     * пишем ошибку
     * @param obj object reference
     * @param message string message
     */
    public static void logError(Object obj, String message) {
        logger.warning(obj.getClass().getName() + "# " + message);
    }
}
