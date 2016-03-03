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
    public void clock_Should_DisplayNoFiveHourLamps_When_TimeOFourHundredHours() {
        BerlinClock berlinClock = new BerlinClock(4,0,0);

        assertThat(berlinClock.getLamps().showFiveHourLamps(), is("----"));
    }

    @Test
    public void clock_Should_DisplayOneFiveHourLamp_When_TimeIsOFiveHundredHours() {
        BerlinClock berlinClock = new BerlinClock(5,0,0);

        assertThat(berlinClock.getLamps().showFiveHourLamps(), is("R---"));
    }

    @Test
    public void clock_Should_DisplayOneFiveHourLamp_When_TimeIsONineHundredHours() {
        BerlinClock berlinClock = new BerlinClock(9,0,0);

        assertThat(berlinClock.getLamps().showFiveHourLamps(), is("R---"));
    }

    @Test
    public void clock_Should_DisplayTwoFiveHourLamps_When_TimeIsTenHundredHours() {
        BerlinClock berlinClock = new BerlinClock(10,0,0);

        assertThat(berlinClock.getLamps().showFiveHourLamps(), is("RR--"));
    }

    @Test
    public void clock_Should_DisplayOneFiveHourLamp_When_TimeIsFourteenHundredHours() {
        BerlinClock berlinClock = new BerlinClock(14,0,0);

        assertThat(berlinClock.getLamps().showFiveHourLamps(), is("RR--"));
    }
}
