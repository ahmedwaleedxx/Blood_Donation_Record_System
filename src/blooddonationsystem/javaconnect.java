package blooddonationsystem;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class javaconnect {

    public static Connection connectdb() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/bueee", "bue", "bue");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(javaconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
