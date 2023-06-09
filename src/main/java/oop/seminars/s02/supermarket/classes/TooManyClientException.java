package oop.seminars.s02.supermarket.classes;

public class TooManyClientException extends Exception{
    /**
     * Генерирует ошибку добавления клиента в очередь с соответствующим сообщением
     * @param errorMessage
     */
    public  TooManyClientException(String errorMessage){
        super(errorMessage);
    }
}
