/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fullparallelprojectchatroom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author abano
 */
// data base connection
public class db {
    public static Connection mycon(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login","root","");
            
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        
        
        return con;
    }
}
