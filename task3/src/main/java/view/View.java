package view;

import view.reader.ConsoleReader;

import java.util.ResourceBundle;

/**
 * Created by User on 13.10.2018.
 */


public class View {
    private ConsoleReader consoleReader;
    private ResourceBundle bundle;

    public View(){
        consoleReader = new ConsoleReader();
        bundle = ResourceBundle.getBundle("messages");
    }

    public ConsoleReader getConsoleReader() {
        return consoleReader;
    }

    public void print(String... msg){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < msg.length; i++) {
            stringBuffer.append(bundle.getString(msg[i]));
            stringBuffer.append(" ");
        }
        System.out.println(stringBuffer.toString());
    }

    public void output(String mes){
        System.out.println(mes);
    }



}
