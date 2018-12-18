package coiltracker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DateChangedComparator implements Comparator<CoilChanged> {
    
    /**
     * 
     * @param d1 Parsed date1
     * @param d2 Parsed date2
     * @return Comparison of two dates
     */
    @Override
    public int compare(CoilChanged d1, CoilChanged d2) {
        int comp = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        try {
            comp = sdf.parse(d1.getDateChanged()).compareTo(sdf.parse(d2.getDateChanged()));
        } catch (ParseException ex) {
            Logger.getLogger(DateChangedComparator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comp;
    }

}
