package view;

import java.util.ResourceBundle;

public enum ResourseKey {
    WELCOME("WELCOME"),
    SEND("SEND"),
    TABLE_HOUSEHOLD("TABLE_HOUSEHOLD"),
    TABLE_ENTERTAIMENT("TABLE_ENTERTAIMENT"),
    NAME("NAME"),
    POWER("POWER"),
    SPEED("SPEED"),
    STATE("STATE"),
    VOLUME("VOLUME"),
    SUM("SUM"),
    DIA("DIA"),
    BACK("BACK"),
    TABLES("TABLES"),
    INP_DIA("INP_DIA"),
    SEARCH("SEARCH");

    String key;
    ResourseKey(String key){
        this.key = key;
    }

    public String getKey(){
        return key;
    }
}
