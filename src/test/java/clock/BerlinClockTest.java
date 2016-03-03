package clock;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by tyjenkins on 03/03/2016.
 */
public class BerlinClockTest {

    @Test
    public void clock_Should_DisplayNoFiveHourLamps_When_TimeIsMidnight() {
        BerlinClock berlinClock = new BerlinClock(0,0,0);

        assertThat(berlinClock.getLamps().showFiveHourLamps(), is("----"));
    }

    @Test
    public void clock_Should_DisplayNoFiveHourLamps_When_TimeIsFourAm() {
        BerlinClock berlinClock = new BerlinClock(4,0,0);

        assertThat(berlinClock.getLamps().showFiveHourLamps(), is("----"));
    }

    @Test
    public void clock_Should_DisplayOneFiveHourLamp_When_TimeIsFiveAm() {
        BerlinClock berlinClock = new BerlinClock(5,0,0);

        assertThat(berlinClock.getLamps().showFiveHourLamps(), is("R---"));
    }

    @Test
    public void clock_Should_DisplayOneFiveHourLamp_When_TimeIsNineAm() {
        BerlinClock berlinClock = new BerlinClock(9,0,0);

        assertThat(berlinClock.getLamps().showFiveHourLamps(), is("R---"));
    }
}
