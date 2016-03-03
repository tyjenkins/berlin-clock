package clock;

/**
 * Created by tyjenkins on 03/03/2016.
 */
public class Lamps {
    private char[] fiveHourLamps = {'-','-','-','-'};
    private char[] oneHourLamps = {'-','-','-','-'};

    public String showFiveHourLamps() {
        return String.valueOf(fiveHourLamps);
    }

    public String showOneHourLamps() {
        return String.valueOf(oneHourLamps);
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
}
