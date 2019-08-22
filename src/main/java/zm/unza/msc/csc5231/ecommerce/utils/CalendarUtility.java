package zm.unza.msc.csc5231.ecommerce.utils;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

/**
 * Created by IntelliJ IDEA.
 * User: david
 * Date: 14/08/2019
 * Time: 2:16 PM
 **/
public class CalendarUtility {


    public static int calculateAge(java.util.Date dob) {
        return calculateAge(dob, new java.util.Date());
    }

    public static int calculateAge(java.util.Date dob, java.util.Date referenceDate) {

        return calculateAge(new Date(dob.getTime()), new Date(referenceDate.getTime()));
    }

    public static int calculateAge(Date dob, Date referenceDate) {

        try {

            Period period = getDateDifference(dob, referenceDate);

            return period.getYears();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return -1;
    }


    public static Period getDateDifference(Date startDate, Date endDate) {
        LocalDate _startDate = toLocalDate(startDate);
        LocalDate _endDate = toLocalDate(endDate);

        return Period.between(_startDate, _endDate);
    }


    public static LocalDate toLocalDate(Date date) {

        return toLocalDate(new java.util.Date(date.getTime()));
    }

    public static LocalDate toLocalDate(java.util.Date date) {
        ZoneId zoneId = ZoneId.systemDefault();
        Instant instant = date.toInstant();

        return instant.atZone(zoneId).toLocalDate();
    }
}
