package model.service;

import model.dao.DataBaseConnector;
import model.entity.EntertainmentElectronic;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by User on 08.11.2018.
 */


public class EntertaimentService {
    List<EntertainmentElectronic> entertainmentElectronics = new ArrayList<>();

    public EntertaimentService(){

    }

    public void updateList() throws ClassNotFoundException {
        DataBaseConnector connector = DataBaseConnector.getInstance();
        java.lang.Class.forName("com.mysql.jdbc.Driver");
        try(Connection connection = DriverManager.getConnection(connector.getConnectionURL(), connector.getUserName(), connector.getPass());
            Statement statement = connection.createStatement();
        ){
            ResultSet entertaiment = statement.executeQuery("select * from electronicdb.electronic, electronicdb.entertaimentelectronic where electronic.id = entertaimentelectronic.id group by -power");

            while (entertaiment.next()){
                entertainmentElectronics.add(new EntertainmentElectronic(entertaiment.getString("name"),
                        entertaiment.getInt("power"), entertaiment.getBoolean("state"),
                        entertaiment.getInt("volume")));
            }
    } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List getList(){
        return entertainmentElectronics;
    }
}
