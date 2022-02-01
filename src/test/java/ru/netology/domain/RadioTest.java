package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldSetAnotherCountOfRadioStation() {
        Radio radio = new Radio(12);
        radio.setCountOfRadioStation(12);
        assertEquals(13, radio.getCurrentOfRadioStation());
    }

    @Test
    void shouldTestMaxNextRadioStation() {
        radio.setCountOfRadioStation(10);
        radio.nextRadioStation();
        assertEquals(1, radio.getCurrentOfRadioStation());
    }

    @Test
    void shouldTestMinNextRadioStation() {
        radio.setCountOfRadioStation(3);
        radio.nextRadioStation();

        assertEquals(5, radio.getCurrentOfRadioStation());
    }

    @Test
    void shouldTestPrevMinRadioStation() {
        radio.setCountOfRadioStation(0);
        radio.prevRadioStation();

        assertEquals(radio.getMaximumCount() + 1, radio.getCurrentOfRadioStation());
    }

    @Test
    void shouldTestPrevMaxRadioStation() {
        radio.setCountOfRadioStation(10);
        radio.prevRadioStation();

        assertEquals(10, radio.getCurrentOfRadioStation());
    }

    @Test
    void shouldAddValidMinimumNumberOfStation() {
        radio.setCountOfRadioStation(1);

        assertEquals(2, radio.getCurrentOfRadioStation());
    }



    @Test
    void shouldAddUnderMinNumberOfStation() {
        radio.setCountOfRadioStation(11);

        assertEquals(0,radio.getCurrentOfRadioStation() );
    }

    @Test
    void shouldAddUpperMaxNumberOfStation() {
        radio.setCountOfRadioStation(0);

        assertEquals(0, radio.getCurrentOfRadioStation());
    }

    @Test
    void shouldSetUpperMaxVolume() {
        radio.setCurrentVolume(101);

        assertEquals(0,radio.getCurrentVolume() );
    }

    @Test
    void shouldSetUnderMinVolume() {
        radio.setCurrentVolume(-1);

        assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    void shouldMaxReduceVolume() {
        radio.setCurrentVolume(100);
        radio.reduceVolume();

        assertEquals(99,radio.getCurrentVolume() );
    }

    @Test
    void shouldMinReduceVolume() {
        radio.setCurrentVolume(0);
        radio.reduceVolume();

        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseMinVolume() {
        radio.setCurrentVolume(0);
        radio.increaseVolume();

        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseMaxVolume() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }
}