package kata5;

import java.util.ArrayList;

public class MailHistogramBuilder {

    public static Histogram <String> build (ArrayList <String> mail){
        Histogram <String> histogram = new Histogram<>();
        for (String mail1 : mail) {
            histogram.increment (new Mail (mail1).getDomain());
        }
        return histogram;
    
    }
    
}
