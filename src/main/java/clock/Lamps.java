package clock;

/**
 * Created by tyjenkins on 03/03/2016.
 */
public class Lamps {
    public static final char RED_LAMP = 'R';
    public static final char YELLOW_LAMP = 'Y';
    public static final char OFF = '-';
    public static final Integer NO_FIVE_MIN_LAMPS = 11;

    private char secondLamp = '-';
    private char[] fiveHourLamps = {'-','-','-','-'};
    private char[] oneHourLamps = {'-','-','-','-'};
    private char[] fiveMinuteLamps = {'-','-','-','-','-','-','-','-','-','-','-'};
    private char[] oneMinuteLamps = {'-','-','-','-'};

    public String showFiveHourLamps() {
        return String.valueOf(fiveHourLamps);
    }

    public String showOneHourLamps() {
        return String.valueOf(oneHourLamps);
    }

    public String showFiveMinuteLamps() {
        return String.valueOf(fiveMinuteLamps);
    }

    public String showOneMinuteLamps() {
        return String.valueOf(getOneMinuteLamps());
    }

    public String showSecondLamp() {
        return String.valueOf(secondLamp);
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

    public char[] getOneMinuteLamps() {
        return oneMinuteLamps;
    }

    public void setOneMinuteLamps(char[] oneMinuteLamps) {
        this.oneMinuteLamps = oneMinuteLamps;
    }

    public char getSecondLamp() {
        return secondLamp;
    }

    public void setSecondLamp(char secondLamp) {
        this.secondLamp = secondLamp;
    }
}
