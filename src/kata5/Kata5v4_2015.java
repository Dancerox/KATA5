package kata5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class Kata5v4_2015 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {

        ArrayList<String> mailList = MailListReader.read();
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        new HistogramDisplay(histogram).execute();

    }
}
