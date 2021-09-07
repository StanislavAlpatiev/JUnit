import java.text.SimpleDateFormat;

public class SweData extends Data{
    public static final Data FIRST_VALID_DATE = new Data(1753, 3, 1);

    public SweData(int year, int month, int day) throws IllegalArgumentException {
        super(year, month, day);

        if(this.compareTo(FIRST_VALID_DATE) < 0)
            throw new IllegalDateException(year, month, day);
//        if(year < 1753 || year <= 1753 && month < 3) {
//            throw new IllegalDateException(year, month, day);
//        }
    }

    public SweData(int month, int day) {
        super(month, day);
        if(this.compareTo(FIRST_VALID_DATE) < 0)
            throw new IllegalDateException(getYear(), month, day);
    }

    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", getYear(), getMonth(), getDay());
    }
}
