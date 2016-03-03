package clock;

/**
 * Created by tyjenkins on 03/03/2016.
 */
public class Lamps {
    public static final char RED_LAMP = 'R';
    public static final char YELLOW_LAMP = 'Y';
    public static final Integer NO_FIVE_MIN_LAMPS = 11;

    private char[] fiveHourLamps = {'-','-','-','-'};
    private char[] oneHourLamps = {'-','-','-','-'};
    private char[] fiveMinuteLamps = {'-','-','-','-','-','-','-','-','-','-','-'};

    public String showFiveHourLamps() {
        return String.valueOf(fiveHourLamps);
    }

    public String showOneHourLamps() {
        return String.valueOf(oneHourLamps);
    }

    public String showFiveMinuteLamps() {
        return String.valueOf(fiveMinuteLamps);
    }

    public char[] getFiveHourLamps() {
        return fiveHourLamps;
    }

    public void setFiveHourLamps(char[] fiveHourLamps) {
        this.fiveHourLamps = fiveHourLamps;
    }

    public char[] getOneHourLamps() {
        return oneHourLamps;
    }

    public void setOneHourLamps(char[] oneHourLamps) {
        this.oneHourLamps = oneHourLamps;
    }

    public char[] getFiveMinuteLamps() {
        return fiveMinuteLamps;
    }

    public void setFiveMinuteLamps(char[] fiveMinuteLamps) {
        this.fiveMinuteLamps = fiveMinuteLamps;
    }
}
