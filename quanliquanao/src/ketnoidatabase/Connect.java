/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketnoidatabase;

import com.mysql.cj.core.MysqlType;
import java.sql.*;
import javax.swing.*;
import Init.Init;

/**
 *
 * @author henryangminh
 */
public class Connect {
    public static Connection getConnect()
    {
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/QLQuanAo?useUnicode=true&characterEncoding=utf-8","root","");
            return conn;
        }
        catch (SQLException e)
        {
            return null;
        }
    }

}
