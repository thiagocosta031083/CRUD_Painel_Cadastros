package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConexaoDAO {

    private static final String HOST = "localhost";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public Connection conectarBD(){
        
        Connection conn = null;
        
        try{
            String url = "jdbc:mysql://"+HOST+":3306/learn_java?";
            conn = DriverManager.getConnection(url,USER,PASSWORD);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
}
