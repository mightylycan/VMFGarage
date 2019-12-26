/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.carDAO.conn;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import DB.DBConnection;
import Model.car;
public class carDAO {
    static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;
    
     public static List<car> getAllRecords() {
        List<car> list = new ArrayList<car>();

        try {
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("select * from tbl_product");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                car u = new car();
                u.setCar_id(rs.getInt("car_id"));
                u.setCar_pict(rs.getString("car_pict"));
                u.setCar_name(rs.getString("car_name"));
                u.setCar_price(rs.getInt("car_price"));
                list.add(u);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
}