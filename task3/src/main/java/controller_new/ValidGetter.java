package controller_new;
/*
 *   Created by Gennady
 *   on 19.10.2018
 */

import controller_new.filter.Filter;
import view.View;

public class ValidGetter {
    private View view;
    private Filter filter;

    public ValidGetter(Controller controller){
        this.view = controller.getView();
        this.filter = new Filter();
    }

    public String getValidLine(Command command){
        String inp;
        do{
            view.print("INPUT", command.getMes());
            inp = view.getConsoleReader().read();
            view.print("FORMAT_ERROR");
        }while (!filter.check(command.getReg(), inp));
        return inp;
    }
}
