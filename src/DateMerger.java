import java.util.List;

public class DateMerger {

    public List<DateRange> mergeDates(List<DateRange> dateRanges){

        for(DateRange dateRange : dateRanges){
            dateRange.setStartDate(replace(dateRange.getStartDate()));
            dateRange.setEndDate(replace(dateRange.getEndDate()));
        }
    //System.out.println(dateRanges);
        for(int i=0;i<dateRanges.size()-1;i++){

               //System.out.println(dateRanges.size());
            DateRange dateRange1 = dateRanges.get(i);
            DateRange dateRange2 = dateRanges.get(i+1);

            //System.out.println(dateRange1+" "+dateRange2);

           boolean res = mergePossible(dateRange1, dateRange2);
           if(res){
               //System.out.println("Merged Dates :- "+merge(dateRange1,dateRange2));

               DateRange dateRange = merge(dateRange1,dateRange2);
               dateRanges.remove(i+1);
               //dateRanges.remove(i);
               //System.out.println(i);
               dateRanges.set(i,dateRange);
               i--;
           }
            //System.out.println(dateRanges);
            //System.out.println(res+" "+i+" "+dateRanges.size());
        }

        for(DateRange dateRange : dateRanges){
            dateRange.setStartDate(replaceAgain(dateRange.getStartDate()));
            dateRange.setEndDate(replaceAgain(dateRange.getEndDate()));
        }

        return dateRanges;
    }

    /*
    *   Tests if merging between two Strings are possible or not
    */
    public boolean mergePossible(DateRange dateRange1 , DateRange dateRange2){

        String endDate = reverse(dateRange1.getEndDate());
        String startDate = reverse(dateRange2.getStartDate());

        return endDate.compareTo(startDate) >=0;
    }

    /*
     *  Merges the two dates into one
     */
    public DateRange merge(DateRange dateRange1 , DateRange dateRange2){

        String startDate1 = reverse(dateRange1.getStartDate());
        String startDate2 = reverse(dateRange2.getStartDate());

        String endDate1 = reverse(dateRange1.getEndDate());
        String endDate2 = reverse(dateRange2.getEndDate());

        String startDate =
                startDate1.compareTo(startDate2) <= 0 ? dateRange1.getStartDate() : dateRange2.getStartDate();

        String endDate =
                endDate1.compareTo(endDate2) >= 0 ? dateRange1.getEndDate() : dateRange2.getEndDate();

        DateRange dateRangeMerge = new DateRange(startDate,endDate);

        return dateRangeMerge;
    }

    /*
     *  Reverses the String by word wise
     */
    public String reverse(String s){

        StringBuilder sb = new StringBuilder();
        String str[] = s.split(" ");
        int length = str.length;
        for(int i=length-1;i>=0;i--){
            sb.append(str[i]+" ");
        }

        return sb.toString();
    }

    /*
     *  Replace the word in a String
     */
    public String replace(String str){

        String [] strings = str.split(" ");
        switch (strings[1]){

            case "Jan":
                str = str.replace(strings[1],"1M");
                return str;

            case "Feb":
                str = str.replace(strings[1],"2M");
                return str;

            case "Mar":
                str = str.replace(strings[1],"3M");
                return str;

            case "Apr":
                str = str.replace(strings[1],"4M");
                return str;

            case "May":
                str = str.replace(strings[1],"5M");
                return str;

            case "Jun":
                str = str.replace(strings[1],"6M");
                return str;

            case "Jul":
                str = str.replace(strings[1],"7M");
                return str;

            case "Aug":
                str = str.replace(strings[1],"8M");
                return str;

            case "Sep":
                str = str.replace(strings[1],"9M");
                return str;

            case "Oct":
                str = str.replace(strings[1],"10M");
                return str;

            case "Nov":
                str = str.replace(strings[1],"11M");
                return str;

            case "Dec":
                str = str.replace(strings[1],"12M");
                return str;

        }
        return str;
    }

    /*
     *  Replace the word in a String
     */
    public String replaceAgain(String str){

        String [] strings = str.split(" ");
        switch (strings[1]){

            case "1M":
                str = str.replace(strings[1],"Jan");
                return str;

            case "2M":
                str = str.replace(strings[1],"Feb");
                return str;

            case "3M":
                str = str.replace(strings[1],"Mar");
                return str;

            case "4M":
                str = str.replace(strings[1],"Apr");
                return str;

            case "5M":
                str = str.replace(strings[1],"May");
                return str;

            case "6M":
                str = str.replace(strings[1],"Jun");
                return str;

            case "7M":
                str = str.replace(strings[1],"Jul");
                return str;

            case "8M":
                str = str.replace(strings[1],"Aug");
                return str;

            case "9M":
                str = str.replace(strings[1],"Sep");
                return str;

            case "10M":
                str = str.replace(strings[1],"Oct");
                return str;

            case "11M":
                str = str.replace(strings[1],"Nov");
                return str;

            case "12M":
                str = str.replace(strings[1],"Dec");
                return str;

        }
        return str;
    }
}
