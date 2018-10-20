package model.exception;

/**
 * Created by User on 20.10.2018.
 */


public class UnuniqueLoginException extends Exception {

    private String nickname;
    public UnuniqueLoginException(String nickname, String mes){
        super(mes);
        this.nickname = nickname;
    }



}
