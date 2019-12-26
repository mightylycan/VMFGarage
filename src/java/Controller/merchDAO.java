/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import static Controller.merchDAO.conn;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import DB.DBConnection;
import Model.car;
import Model.merch;
public class merchDAO {
static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;
    
     public static List<merch> getAllRecords() {
        List<merch> list = new ArrayList<merch>();

        try {
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("select * from tbl_merch");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                merch u = new merch();
                u.setMerch_id(rs.getInt("merch_id"));
                u.setMerch_pict(rs.getString("merch_pict"));
                u.setMerch_name(rs.getString("merch_name"));
                u.setMerch_price(rs.getInt("merch_price"));
                list.add(u);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
}    
