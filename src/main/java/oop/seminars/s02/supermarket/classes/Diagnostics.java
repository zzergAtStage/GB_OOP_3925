package oop.seminars.s02.supermarket.classes;

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
            fh = new FileHandler("/Market.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void logMessage(Object obj, String message){
        logger.info(obj.getClass().getName() + " " + message);//TODO make string-builder
    }
}
