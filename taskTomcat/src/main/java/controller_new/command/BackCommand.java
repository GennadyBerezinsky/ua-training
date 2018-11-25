package controller_new.command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by User on 13.11.2018.
 */

public class BackCommand extends Command {
    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException {

            request.getRequestDispatcher("index.jsp").forward(request, response);


    }
}
