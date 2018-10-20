package controller.filter;

import java.util.ResourceBundle;
import java.util.regex.Pattern;

/**
 * Created by User on 13.10.2018.
 */

@Deprecated
public class Filter {
    ResourceBundle bundle = ResourceBundle.getBundle("regex");

    public boolean check(String regex, String str){
        return Pattern.matches(bundle.getString(regex), str);
    }


}
