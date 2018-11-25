package controller_new.command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by User on 13.11.2018.
 */


public class UnknownCommand extends Command {
    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print("Error! Unknown command or page is not found. Please return to previous page.");

    }
}
