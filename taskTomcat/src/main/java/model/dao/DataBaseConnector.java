package model.dao;

/**
 * Created by User on 03.11.2018.
 */

public class DataBaseConnector {
    private static volatile DataBaseConnector instance;



    private DataBaseConnector(){

    }

    public static DataBaseConnector getInstance(){
        if(instance == null){
            synchronized (DataBaseConnector.class){
                if(instance == null){
                    instance = new DataBaseConnector();
                }
            }
        }
        return instance;
    }

    public String getConnectionURL(){
        return DBInfoKeys.DATABASE_URL.getKey();
    }

    public String getUserName(){
        return DBInfoKeys.USER.getKey();
    }

    public String getPass(){
        return DBInfoKeys.PASS.getKey();
    }



}
