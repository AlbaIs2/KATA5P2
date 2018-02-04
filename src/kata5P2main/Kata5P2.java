
package kata5P2main;

import java.io.IOException;
import java.util.List;
import kata5P2.model.Histogram;
import kata5P2.model.Mail;
import kata5P2.view.HistogramDisplay;
import kata5P2.view.MailHistogramBuilder;
import kata5P2.view.MailListReader;

public class Kata5P2 {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\ALBA\\Documents\\NetBeansProjects\\Kata5P2\\emailsfile.txt";
        List <Mail> mailList = MailListReader.read(filename);
        Histogram<String>  histogram = MailHistogramBuilder.build(mailList); 
        new HistogramDisplay(histogram).execute();
    }
        
}
