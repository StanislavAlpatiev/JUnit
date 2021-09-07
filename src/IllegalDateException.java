public class IllegalDateException extends RuntimeException {
    public IllegalDateException(int year, int month, int day) {
        super(String.format("Illegal date: %04d-%02d-%02d", year, month, day));
    }
}
