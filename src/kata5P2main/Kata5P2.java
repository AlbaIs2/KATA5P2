
package kata5P2main;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import kata5P2.model.Histogram;
import kata5P2.model.Mail;
import kata5P2.view.DataBaseList;
import kata5P2.view.HistogramDisplay;
import kata5P2.view.MailHistogramBuilder;

public class Kata5P2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        List <Mail> mailList = DataBaseList.read();
        Histogram<String>  histogram = MailHistogramBuilder.build(mailList); 
        new HistogramDisplay(histogram).execute();
    }
        
}
