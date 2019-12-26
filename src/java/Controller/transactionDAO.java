/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import DB.DBConnection;
import Model.transaction;
public class transactionDAO {
    static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;

    public static int save(transaction t) {
        int status = 0;
        try {
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("insert into tbl_checkout(name,email,address,city,product,quantity,cardname,nocard,expmonth,expyear) values(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, t.getName());
            ps.setString(2, t.getEmail());
            ps.setString(3, t.getAddress());
            ps.setString(4, t.getCity());
            ps.setString(5, t.getProduct());
            ps.setString(6, t.getQuantity());
            ps.setString(7, t.getCardname());
            ps.setString(8, t.getNocard());
            ps.setString(9, t.getExpmonth());
            ps.setString(10, t.getExpyear());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    public static int update(transaction t) {
        int status = 0;
        try {
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("update tbl_checkout set name=?,email=?,address=?,city=?,product=?,quantity=? where checkout_id=?");
           ps.setString(1, t.getName());
            ps.setString(2, t.getEmail());
            ps.setString(3, t.getAddress());
           ps.setString(4, t.getCity());
            ps.setString(5, t.getProduct());
            ps.setString(6, t.getQuantity());
            ps.setInt(7, t.getCheckout_id());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static int delete(transaction t) {
        int status = 0;
        try {
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("delete from tbl_checkout where checkout_id=?");
            ps.setInt(1, t.getCheckout_id());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }

        return status;
    }

    public static List<transaction> getAllRecords() {
        List<transaction> list = new ArrayList<transaction>();

        try {
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("select * from tbl_checkout");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                transaction u = new transaction();
                u.setCheckout_id(rs.getInt("checkout_id"));
                u.setName(rs.getString("name"));
                u.setEmail(rs.getString("email"));
                u.setAddress(rs.getString("address"));
                u.setCity(rs.getString("city"));
                u.setProduct(rs.getString("product"));
                u.setQuantity(rs.getString("quantity"));
                u.setCardname(rs.getString("cardname"));
                u.setNocard(rs.getString("nocard"));
                u.setExpmonth(rs.getString("expmonth"));
                u.setExpyear(rs.getString("expyear"));
                list.add(u);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public static transaction getRecordById(int id) {
        transaction u = null;
        try {
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("select * from tbl_checkout where checkout_id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                u = new transaction();
                u.setCheckout_id(rs.getInt("checkout_id"));
                u.setName(rs.getString("name"));
                u.setEmail(rs.getString("email"));
                u.setAddress(rs.getString("address"));
                u.setCity(rs.getString("city"));
                u.setProduct(rs.getString("product"));
                u.setQuantity(rs.getString("quantity"));
                u.setCardname(rs.getString("cardname"));
                u.setNocard(rs.getString("nocard"));
                u.setExpmonth(rs.getString("expmonth"));
                u.setExpyear(rs.getString("expyear"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return u;
    }
}
