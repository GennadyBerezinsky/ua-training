package controller_new.command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Locale;

/**
 * Created by User on 13.11.2018.
 */


public class EnLocaleCommand extends Command  {
    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String param = request.getParameter("EnLocale");
        if(param != null){
            Locale.setDefault(new Locale("en", "US", "messages.properties"));
        }
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
