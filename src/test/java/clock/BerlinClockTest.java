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

    @Test
    public void clock_Should_DisplayNoFiveMinuteLamps_When_TimeHasNoMinutes() {
        BerlinClock berlinClock = new BerlinClock(12,0,0);

        assertThat(berlinClock.getLamps().showFiveMinuteLamps(), is("-----------"));
    }

    @Test
    public void clock_Should_DisplayNoFiveMinuteLamps_When_TimeHasOneMinute() {
        BerlinClock berlinClock = new BerlinClock(12,1,0);

        assertThat(berlinClock.getLamps().showFiveMinuteLamps(), is("-----------"));
    }

    @Test
    public void clock_Should_DisplayNoFiveMinuteLamps_When_TimeHasFourMinutes() {
        BerlinClock berlinClock = new BerlinClock(12,4,0);

        assertThat(berlinClock.getLamps().showFiveMinuteLamps(), is("-----------"));
    }

    @Test
    public void clock_Should_DisplayOneFiveMinuteLamps_When_TimeHasFiveMinutes() {
        BerlinClock berlinClock = new BerlinClock(12,5,0);

        assertThat(berlinClock.getLamps().showFiveMinuteLamps(), is("Y----------"));
    }

    @Test
    public void clock_Should_DisplayOneFiveMinuteLamps_When_TimeHasSevenMinutes() {
        BerlinClock berlinClock = new BerlinClock(12,7,0);

        assertThat(berlinClock.getLamps().showFiveMinuteLamps(), is("Y----------"));
    }

    @Test
    public void clock_Should_DisplayTwoFiveMinuteLamps_When_TimeHasElevenMinutes() {
        BerlinClock berlinClock = new BerlinClock(12,11,0);

        assertThat(berlinClock.getLamps().showFiveMinuteLamps(), is("YY---------"));
    }

    @Test
    public void clock_Should_DisplayThreeFiveMinuteLamps_When_TimeHasFifteenMinutes() {
        BerlinClock berlinClock = new BerlinClock(12,15,0);

        assertThat(berlinClock.getLamps().showFiveMinuteLamps(), is("YYR--------"));
    }

    @Test
    public void clock_Should_DisplayFourFiveMinuteLamps_When_TimeHasTwentyOneMinutes() {
        BerlinClock berlinClock = new BerlinClock(0,21,0);

        assertThat(berlinClock.getLamps().showFiveMinuteLamps(), is("YYRY-------"));
    }

    @Test
    public void clock_Should_DisplayFiveFiveMinuteLamps_When_TimeHasTwentySevenMinutes() {
        BerlinClock berlinClock = new BerlinClock(0,27,0);

        assertThat(berlinClock.getLamps().showFiveMinuteLamps(), is("YYRYY------"));
    }

    @Test
    public void clock_Should_DisplaySixFiveMinuteLamps_When_TimeHasThirtyThreeMinutes() {
        BerlinClock berlinClock = new BerlinClock(0,33,0);

        assertThat(berlinClock.getLamps().showFiveMinuteLamps(), is("YYRYYR-----"));
    }

    @Test
    public void clock_Should_DisplaySevenFiveMinuteLamps_When_TimeHasThirtyEightMinutes() {
        BerlinClock berlinClock = new BerlinClock(0,38,0);

        assertThat(berlinClock.getLamps().showFiveMinuteLamps(), is("YYRYYRY----"));
    }

    @Test
    public void clock_Should_DisplayEightFiveMinuteLamps_When_TimeHasFortyFourMinutes() {
        BerlinClock berlinClock = new BerlinClock(0,44,0);

        assertThat(berlinClock.getLamps().showFiveMinuteLamps(), is("YYRYYRYY---"));
    }

    @Test
    public void clock_Should_DisplayNineFiveMinuteLamps_When_TimeHasFortyFiveMinutes() {
        BerlinClock berlinClock = new BerlinClock(0,45,0);

        assertThat(berlinClock.getLamps().showFiveMinuteLamps(), is("YYRYYRYYR--"));
    }

    @Test
    public void clock_Should_DisplayTenFiveMinuteLamps_When_TimeHasFiftyOneMinutes() {
        BerlinClock berlinClock = new BerlinClock(0,51,0);

        assertThat(berlinClock.getLamps().showFiveMinuteLamps(), is("YYRYYRYYRY-"));
    }

    @Test
    public void clock_Should_DisplayElevenFiveMinuteLamps_When_TimeHasFiftySevenMinutes() {
        BerlinClock berlinClock = new BerlinClock(0,57,0);

        assertThat(berlinClock.getLamps().showFiveMinuteLamps(), is("YYRYYRYYRYY"));
    }

    @Test
    public void clock_Should_DisplayNoOneMinuteLamps_When_TimeHasNoMinutes() {
        BerlinClock berlinClock = new BerlinClock(0,0,0);

        assertThat(berlinClock.getLamps().showOneMinuteLamps(), is("----"));
    }

    @Test
    public void clock_Should_DisplayOneOneMinuteLamps_When_TimeHasOneMinute() {
        BerlinClock berlinClock = new BerlinClock(0,1,0);

        assertThat(berlinClock.getLamps().showOneMinuteLamps(), is("Y---"));
    }
}
