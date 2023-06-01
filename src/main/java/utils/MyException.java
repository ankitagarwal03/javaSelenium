package utils;

public class MyException extends RuntimeException{

    public MyException(String msg){
        super(new RuntimeException(msg));
    }

}
