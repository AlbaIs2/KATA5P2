
package kata5P2.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kata5P2.model.Mail;


public class DataBaseList {
    public static List <Mail> read() throws ClassNotFoundException, SQLException {
        List <Mail> listMail = new ArrayList<>();
        Class.forName("org.sqlite.JDBC");
        Connection connec = DriverManager.getConnection("jdbc:sqlite:kata5.db");
        Statement st = connec.createStatement();
        String query = "SELECT * FROM MAIL";
        ResultSet rs = st.executeQuery(query);
    
        while(rs.next()){
            String mail = rs.getString(2);
            listMail.add(new Mail(mail));    
        }
        return listMail;
    }
          
}
