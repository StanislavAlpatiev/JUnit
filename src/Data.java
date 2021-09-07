import java.time.LocalDate;
import java.io.IOException;
import java.time.Month;
import java.util.Objects;

public class Data implements Comparable<Data>{
    private static final int DEFAULT_YEAR = LocalDate.now().getYear();
    private static final int DEFAULT_MONTH = LocalDate.now().getMonthValue();
    private static final int DEFAULT_DAY = LocalDate.now().getDayOfMonth();
    private final int year;
    private final int month;
    private final int day;

    public Data(int year, int month, int day) throws IllegalDateException {
        if (year < 1582 || year <= 1582 && month < 10 || year <= 1582 && month <= 10 && day < 15) {
            throw new IllegalDateException(year, month, day);
        } else {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    public Data(int month, int day) throws IllegalDateException {
        this(DEFAULT_YEAR, month, day);
    }

    public Data() throws IllegalDateException {
        this(DEFAULT_YEAR, DEFAULT_MONTH, DEFAULT_DAY);
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

    public String getMonthName() {
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
    public final boolean equals(Object other) {
        if(!(other instanceof Data)) {
            return false;
        }

        Data otherData = (Data) other;
        return this.year == otherData.year && this.month == otherData.month && this.day == otherData.day;
    }


//    public int compareTo(Data otherData) {
//        return Integer.compare(Objects.hash(this.year, this.month, this.day),Objects.hash(otherData.getYear(), otherData.getMonth(), otherData.getDay()));
//    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
        //return year * 123 + month * 231 + day * 22
    }

    @Override
    public String toString () {
        return String.format("%d %s %d", day, getMonthName(), year);
    }

    @Override
    public int compareTo(Data o) {
        return Integer.compare(Objects.hash(this.year, this.month, this.day),
                Objects.hash(o.getYear(), o.getMonth(), o.getDay()));
    }
}
