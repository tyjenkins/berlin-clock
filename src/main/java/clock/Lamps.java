package clock;

/**
 * Created by tyjenkins on 03/03/2016.
 */
public class Lamps {
    private char[] fiveHourLamps = {'-','-','-','-'};

    public char[] getFiveHourLamps() {
        return fiveHourLamps;
    }

    public void setFiveHourLamps(char[] fiveHourLamps) {
        this.fiveHourLamps = fiveHourLamps;
    }

    public String showFiveHourLamps() {
        return String.valueOf(fiveHourLamps);
    }
}
