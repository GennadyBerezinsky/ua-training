package model.service;

import model.dao.DataBaseConnector;
import model.entity.HouseHoldElectronic;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 07.11.2018.
 */


public class HouseHoldService {
    List<HouseHoldElectronic> houseHoldElectronicList = new ArrayList<>();

    public HouseHoldService(){

    }

    public void updateList() throws ClassNotFoundException {
        DataBaseConnector connector = DataBaseConnector.getInstance();
        java.lang.Class.forName("com.mysql.jdbc.Driver");
        try(Connection connection = DriverManager.getConnection(connector.getConnectionURL(), connector.getUserName(), connector.getPass());
            Statement statement = connection.createStatement() ) {
            ResultSet houseHoldElectronic = statement.executeQuery("select * from electronicdb.electronic, electronicdb.householdelectronic " +
                    "where electronic.id = householdelectronic.id group by -power");
            while (houseHoldElectronic.next()){
                houseHoldElectronicList.add(new HouseHoldElectronic(houseHoldElectronic.getString("name"),
                        houseHoldElectronic.getInt("power"), houseHoldElectronic.getBoolean("state"),
                        houseHoldElectronic.getInt("speed")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List getList(){
        return houseHoldElectronicList;
    }
    public int getSize(){
        return houseHoldElectronicList.size();
    }
}
