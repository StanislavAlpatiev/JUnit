import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
public class ExceptionTest {
    public static void main(String[] args) {

        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Kod för att hantera ArrayIndexOutOfBoundsException");
        } finally {
            System.out
                    .println("Denna kod körs alltid, oavsett om ett ArrayIndexOutOfBoundsException kastas eller inte");
        }

        try {
            throw new IndexOutOfBoundsException();
            /*
             * Om flera undantag kan fångas måste de listas i rätt ordning. Baa den först
             * matchade catc-satsen körs
             */
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Kod för att hantera ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Kod för att hantera IndexOutOfBoundsException");
            /*
             * Att fånga Exception (eller RuntimeException eller Throwable) är normalt en
             * *MYCKET* dålig idé. Om koden kastar en typ av undantag man inte räknat med
             * kan det leda till att fel döljs.
             */
        } catch (Exception e) {
            System.out.println("Kod för att hantera alla undantag");
        }

        try {
            // throw new ArrayIndexOutOfBoundsException();
            throw new ArithmeticException();
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Kod för att hantera ArrayIndexOutOfBoundsException eller ArithmeticException");
        }

        try {
            /*
             * Checked exceptions, alltså sådana som inte ärver från RuntimeException
             * *MÅSTE* hanteras. Antingen via try-catch eller genom att deklarera att
             * metoden kastar undantaget vidare.
             */
            throw new IOException();
        } catch (IOException e) {
            System.out.println("Kod för att hantera ArrayIndexOutOfBoundsException");
        }
    }
}
