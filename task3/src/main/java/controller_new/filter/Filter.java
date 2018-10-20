package controller_new.filter;
/*
 *   Created by Gennady
 *   on 19.10.2018
 */

import java.util.ResourceBundle;
import java.util.regex.Pattern;

public class Filter {
    ResourceBundle bundle = ResourceBundle.getBundle("regex");

    public boolean check(String regex, String str){
        return Pattern.matches(bundle.getString(regex), str);
    }

}
