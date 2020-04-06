/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketnoidatabase;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author henryangminh
 */
public class DataProvider {
    public static Connection conn = null;
    public static boolean executeSql(String sql) throws SQLException
    {
        conn = Connect.getConnect();
        Statement result = conn.createStatement();
        try 
        {
            return result.execute(sql);
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e,"WARNING",1);
            return false;
        }
        finally
        {
            if(result != null)
                result.close();
        }
    }
    
    /**
     *
     * @param sql
     * @return
     * @throws SQLException
     */
    public static ResultSet executeQuery(String sql) throws SQLException
    {
        conn = Connect.getConnect();
        Statement result = conn.createStatement();
        try 
        {
            return result.executeQuery(sql);
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e,"WARNING",1);
            return null;
        }
        /*
        finally
        {
            if(result != null)
                result.close();
        }
*/
    }
}
