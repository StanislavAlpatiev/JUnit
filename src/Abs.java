import java.lang.Math;
import java.util.Scanner;

public class Abs {
    public static final Scanner INPUT = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(abs(0));
        System.out.println(abs(1));
        System.out.println(abs(-1));
        System.out.println(abs(Integer.MAX_VALUE));
        System.out.println(abs(Integer.MIN_VALUE));
        isleapYear(2020);
        isleapYear(1999);

        do {
            int year = getUserYear();
            if(isleapYear(year)) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        } while(continueLoop());

    }

    public static int abs(int a){
//        if (a > 0) {
//            return a;
//        } else if (a < 0 && a != Integer.MIN_VALUE) {
//            return Math.abs(a);
//        } else if (a == Integer.MIN_VALUE) {
//            return a;
//        } else {
//            return 0;
//        }
        return a >= 0 ? a : -a;
    }

    public static int getUserYear() {
        System.out.println("Please enter a year: ");
        int year = INPUT.nextInt();
        INPUT.nextLine();
        return year;
    }

    public static boolean continueLoop() {
        System.out.println("To continue... Press (Y/N)");
        return INPUT.nextLine().toUpperCase().startsWith("Y");
    }

    public static boolean isleapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }


}



