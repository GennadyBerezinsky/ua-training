package controller_new.command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by User on 13.11.2018.
 */


public abstract class Command {
    public abstract void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException;
}
