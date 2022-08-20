package ru.netology.javaqamvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testIncreaseStationOn1() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testReduceStationOnZeroFrom9() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testReduceCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 4;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testIncreaseVolumeOn1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 7;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testReduceVolumeOn1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testLimitValueOnIncreaseBelowZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testLimitValueOnIncreaseStationAfter9() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testLimitValueOnCurrentVolumeBelowZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testLimitValueOnCurrentVolumeAfter10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testUnchangedVolumeOnIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testUnchangedVolumeOnReduce() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }
}
