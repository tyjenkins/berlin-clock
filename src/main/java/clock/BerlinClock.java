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
    }

    public Integer getNoFiveHourLamps() {
        return getHours() / 5;
    }

    public Integer getNoOneHourLamps() {
        return getHours() % 5;
    }

    public void setLampRow(char[] lamps, Integer noOfOnLamps) {
        for (int i=0 ; i < noOfOnLamps; i++) {
            lamps[i] = 'R';
        }
    }

    public void setFiveHourLamps() {
        setLampRow(getLamps().getFiveHourLamps(), getNoFiveHourLamps());
    }

    public void setOneHourLamps() {
        setLampRow(getLamps().getOneHourLamps(), getNoOneHourLamps());
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
