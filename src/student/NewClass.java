
package student;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author LAKSHITHA
 */
public class NewClass {
    public static Connection getCon()
    {
        try
     {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/time_Project","root","");
        return con;
    
    }
        catch(Exception e)
                {
                return null;
                }
    }

    public static Connection connect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        
    }