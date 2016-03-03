package clock;

/**
 * Created by tyjenkins on 03/03/2016.
 */
public class BerlinClock {
    private Integer hours;
    private Integer minutes;
    private Integer seconds;
    private Lamps lamps = new Lamps();

    public BerlinClock(Integer hours, Integer minutes, Integer seconds) {
        this.setHours(hours);
        this.setMinutes(minutes);
        this.setSeconds(seconds);

        setFiveHourLamps();
        setOneHourLamps();
        setFiveMinuteLamps();
        setOneMinuteLamps();
    }

    private Integer getNoFiveHourLamps() {
        return getHours() / 5;
    }

    private Integer getNoOneHourLamps() {
        return getHours() % 5;
    }

    private Integer getNoFiveMinuteLamps() {
        return getMinutes() / 5;
    }

    private Integer getNoOfOneMinuteLamps() {
        return getMinutes() % 5;
    }

    private void setLampRow(char[] lamps, Integer noOfOnLamps, char lampColour) {
        for (int i=0 ; i < noOfOnLamps; i++) {
            // condition to pick out the RED lamps on the 5 minute lamp row
            if (lamps.length == Lamps.NO_FIVE_MIN_LAMPS && (i+1) % 3 == 0) {
                lamps[i] = Lamps.RED_LAMP;
            } else {
                lamps[i] = lampColour;
            }
        }
    }

    private void setFiveHourLamps() {
        setLampRow(getLamps().getFiveHourLamps(), getNoFiveHourLamps(), Lamps.RED_LAMP);
    }

    private void setOneHourLamps() {
        setLampRow(getLamps().getOneHourLamps(), getNoOneHourLamps(), Lamps.RED_LAMP);
    }

    private void setFiveMinuteLamps() {
        setLampRow(getLamps().getFiveMinuteLamps(), getNoFiveMinuteLamps(), Lamps.YELLOW_LAMP);
    }

    private void setOneMinuteLamps() {
        setLampRow(getLamps().getOneMinuteLamps(), getNoOfOneMinuteLamps() ,Lamps.YELLOW_LAMP);
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getSeconds() {
        return seconds;
    }

    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

    public Lamps getLamps() {
        return lamps;
    }

    public void setLamps(Lamps lamps) {
        this.lamps = lamps;
    }
}
