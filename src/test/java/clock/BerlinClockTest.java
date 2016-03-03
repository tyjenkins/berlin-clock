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
    public void clock_Should_DisplayTwoFiveHourLamp_When_TimeIsFourteenHundredHours() {
        BerlinClock berlinClock = new BerlinClock(14,0,0);

        assertThat(berlinClock.getLamps().showFiveHourLamps(), is("RR--"));
    }

    @Test
    public void clock_Should_DisplayThreeFiveHourLamps_When_TimeIsFifteenHundredHours() {
        BerlinClock berlinClock = new BerlinClock(15,0,0);

        assertThat(berlinClock.getLamps().showFiveHourLamps(), is("RRR-"));
    }

    @Test
    public void clock_Should_DisplayThreeFiveHourLamp_When_TimeIsNineteenHundredHours() {
        BerlinClock berlinClock = new BerlinClock(19,0,0);

        assertThat(berlinClock.getLamps().showFiveHourLamps(), is("RRR-"));
    }

    @Test
    public void clock_Should_DisplayFourFiveHourLamps_When_TimeIsTwentyHundredHours() {
        BerlinClock berlinClock = new BerlinClock(20,0,0);

        assertThat(berlinClock.getLamps().showFiveHourLamps(), is("RRRR"));
    }

    @Test
    public void clock_Should_DisplayFourFiveHourLamp_When_TimeIsTwentyFourHundredHours() {
        BerlinClock berlinClock = new BerlinClock(24,0,0);

        assertThat(berlinClock.getLamps().showFiveHourLamps(), is("RRRR"));
    }

    @Test
    public void clock_Should_DisplayOneOneHourLamp_When_TimeIsOOneHundredHours() {
        BerlinClock berlinClock = new BerlinClock(1,0,0);

        assertThat(berlinClock.getLamps().showOneHourLamps(), is("R---"));
    }

    @Test
    public void clock_Should_DisplayNoOneHourLamps_When_TimeIsMidnight() {
        BerlinClock berlinClock = new BerlinClock(0,0,0);

        assertThat(berlinClock.getLamps().showOneHourLamps(), is("----"));
    }

    @Test
    public void clock_Should_DisplayTwoOneHourLamps_When_TimeIsOSevenHundredHours() {
        BerlinClock berlinClock = new BerlinClock(7,0,0);

        assertThat(berlinClock.getLamps().showOneHourLamps(), is("RR--"));
    }

    @Test
    public void clock_Should_DisplayThreeOneHourLamp_When_TimeIsThirteenHundredHours() {
        BerlinClock berlinClock = new BerlinClock(13,0,0);

        assertThat(berlinClock.getLamps().showOneHourLamps(), is("RRR-"));
    }

    @Test
    public void clock_Should_DisplayFourOneHourLamp_When_TimeIsTwentyFourHundredHours() {
        BerlinClock berlinClock = new BerlinClock(24,0,0);

        assertThat(berlinClock.getLamps().showOneHourLamps(), is("RRRR"));
    }
}
