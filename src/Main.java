import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        DateMerger dateMerger = new DateMerger();

        DateRange dateRange1 = new DateRange("01 Jan 2014","30 Jan 2014");
        DateRange dateRange2 = new DateRange("15 Jan 2014","15 Feb 2014");
        //DateRange dateRange21 = new DateRange("16 Jan 2014","16 Feb 2014");
        DateRange dateRange3 = new DateRange("10 Mar 2014","15 Apr 2014");
        DateRange dateRange4 = new DateRange("10 Apr 2014","15 May 2014");

        List<DateRange> dateRanges = new ArrayList<>();
        dateRanges.add(dateRange1);
        dateRanges.add(dateRange2);
        //dateRanges.add(dateRange21);
        dateRanges.add(dateRange3);
        dateRanges.add(dateRange4);

        System.out.println(dateMerger.mergeDates(dateRanges));
    }
}
