package controller_new.command;

import model.service.RangeElectronicService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by User on 13.11.2018.
 */


public class SearchCommand extends Command {
    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        String param = request.getParameter("Search");
        if(param != null){
            int min =  Integer.parseInt(request.getParameter("min"));
            int max =  Integer.parseInt(request.getParameter("max"));
            List electronicList;

            RangeElectronicService rangeElectronicService = new RangeElectronicService();
            try {
                rangeElectronicService.updateList(min, max);
                electronicList = rangeElectronicService.getList();
                request.setAttribute("diapasone", electronicList);


            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        request.getRequestDispatcher("diapasones.jsp").forward(request, response);




    }
}
