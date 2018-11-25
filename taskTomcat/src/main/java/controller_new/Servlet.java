package controller_new;

import controller_new.command.Command;
import controller_new.command.NoCommand;
import controller_new.command.UnknownCommand;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by User on 13.11.2018.
 */

@WebServlet("")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        Command command;
        try{
            command = getCommand(request);
            command.process(request, response);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private Command getCommand(HttpServletRequest request) throws IllegalAccessException, InstantiationException {
        try{
            return (Command) getCommandClass(request).newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
           throw e;
        }
    }

    private Class getCommandClass(HttpServletRequest request){
        Class commandClass;
        if(request.getParameter("command") == null){
            commandClass = NoCommand.class;
        }
        else {
            try{
                String className = "controller_new.command." + request.getParameter("command") + "Command";
                commandClass = Class.forName(className);
            } catch (ClassNotFoundException e){
                commandClass = UnknownCommand.class;
            }

        }
        return commandClass;
    }
}
