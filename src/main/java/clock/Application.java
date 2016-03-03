package clock;

import com.sun.jndi.ldap.Ber;

import java.util.Scanner;

/**
 * Created by tyjenkins on 03/03/2016.
 */
public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hours(24), minutes and seconds :");
        Integer hours = scanner.nextInt();
        if (hours > 24 || hours < 0) {
            System.out.print("\n" + "Invalid number of hours");
            System.exit(1);
        }
        Integer minutes = scanner.nextInt();
        if (minutes > 59 || minutes < 0) {
            System.out.print("\n" + "Invalid number of minutes");
            System.exit(1);
        }
        Integer seconds = scanner.nextInt();
        if (seconds > 59 || seconds < 0) {
            System.out.print("\n" + "Invalid number of seconds");
            System.exit(1);
        }

        BerlinClock berlinClock = new BerlinClock(hours, minutes, seconds);

        System.out.print("\n" + berlinClock.getLamps().showSecondLamp());
        System.out.print("\n" + berlinClock.getLamps().showFiveHourLamps());
        System.out.print("\n" + berlinClock.getLamps().showOneHourLamps());
        System.out.print("\n" + berlinClock.getLamps().showFiveMinuteLamps());
        System.out.print("\n" + berlinClock.getLamps().showOneMinuteLamps());

        System.out.print("\n\n" + "DONE");
    }
}
