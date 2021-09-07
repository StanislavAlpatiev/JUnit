import java.time.LocalDate;

public class Data {
    private static final int DEFAULT_YEAR = LocalDate.now().getYear();
    private final int year;
    private final int month;
    private final int day;

    public Data(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Data(int month, int day) {
        this(DEFAULT_YEAR, month, day);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    private String getMonthName() {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "Jun";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                throw new IllegalStateException(String.format("Unexpected month: %d", month));
        }
    }


    @Override
    public String toString () {
        return String.format("%d %s %d", day, getMonthName(), year);
    }


}
