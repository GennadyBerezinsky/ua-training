package model.dao;

import java.util.Locale;
import java.util.ResourceBundle;

public enum DBInfoKeys {
    DATABASE_URL("jdbc:mysql://localhost:3306"),
    USER("root"),
    PASS("18480322"),
    JDBC_DRIVER_CLASS("com.mysql.jdbc.Driver"),
    COLUMN_NAME("name"),
    COLUMN_POWER("power"),
    COLUMN_STATE("state"),
    COLUMN_VOLUME("volume"),
    COLUMN_SPEED("speed");

    private String key;

    DBInfoKeys(String key){
        this.key = key;
    }

    public String getKey(){
        return key;
    }
}
