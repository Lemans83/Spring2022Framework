package Helper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateLib {

    public static int verifyDisabledDates(){
        Date currDate = new Date();
        SimpleDateFormat myOnlyformat = new SimpleDateFormat("d");
        return Integer.valueOf(myOnlyformat.format(currDate));
    }

}
