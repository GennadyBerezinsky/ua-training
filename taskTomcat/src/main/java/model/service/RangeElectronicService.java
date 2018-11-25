package model.service;

import model.dao.DataBaseConnector;
import model.entity.Electronic;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 09.11.2018.
 */


public class RangeElectronicService {
    List<Electronic> electronicList = new ArrayList<>();

    public void updateList(int a, int b) throws ClassNotFoundException {
        if(a<=b){
            DataBaseConnector connector = DataBaseConnector.getInstance();
            java.lang.Class.forName("com.mysql.jdbc.Driver");

            try(Connection connection = DriverManager.getConnection(connector.getConnectionURL(), connector.getUserName(), connector.getPass());

            ) {
                PreparedStatement preparedStatement = connection.prepareStatement("select * from electronicdb.electronic where power >= ? and power <= ?");
               preparedStatement.setInt(1, a);
               preparedStatement.setInt(2, b);
               ResultSet sortedByPower = preparedStatement.executeQuery();
                while (sortedByPower.next()){
                    electronicList.add(new Electronic(sortedByPower.getString("name"), sortedByPower.getInt("power"), sortedByPower.getBoolean("state")));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        else {
            return;
        }
    }

    public List getList(){
        return electronicList;
    }
}
