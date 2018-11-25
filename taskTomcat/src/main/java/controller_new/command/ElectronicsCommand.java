package controller_new.command;

import model.entity.EntertainmentElectronic;
import model.entity.HouseHoldElectronic;
import model.service.EntertaimentService;
import model.service.HouseHoldService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by User on 13.11.2018.
 */


public class ElectronicsCommand extends Command  {
    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException {
        HttpSession session = request.getSession();
        String param = request.getParameter("Electronics");
        if(param != null){

            HouseHoldService houseHoldService = new HouseHoldService();
            houseHoldService.updateList();
            List<HouseHoldElectronic> houseHoldElectronics = houseHoldService.getList();
            request.setAttribute("householdlist", houseHoldElectronics);

            EntertaimentService entertaimentService = new EntertaimentService();
            entertaimentService.updateList();
            List<EntertainmentElectronic> entertainmentElectronics = entertaimentService.getList();
            request.setAttribute("entertaimentlist", entertainmentElectronics);

            request.getRequestDispatcher("tables.jsp").forward(request, response);
        }
    }
}
