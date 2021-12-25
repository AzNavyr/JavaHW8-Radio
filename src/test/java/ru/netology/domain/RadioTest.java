package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldTestNextRadioStation() {
        radio.setNumberOfRadioStation(9);
        int expected = radio.getMinRadioStation();
        radio.nextRadioStation();
        int actual = radio.getCurrentOfRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldTestPrevMinRadioStation() {
        radio.setNumberOfRadioStation(0);
        int expected = radio.getMaxRadioStation();
        radio.prevRadioStation();
        int actual = radio.getCurrentOfRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldTestPrevMaxRadioStation() {
        radio.setNumberOfRadioStation(9);
        int expected = radio.getCurrentOfRadioStation() - 1;
        radio.prevRadioStation();
        int actual = radio.getCurrentOfRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldAddValidMinimumNumberOfStation() {
        int stationNumber = 0;
        radio.setNumberOfRadioStation(stationNumber);
        int expected = stationNumber;
        int actual = radio.getCurrentOfRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReduceVolume() {
        radio.setCurrentVolume(9);
        int expected = radio.getCurrentVolume() - 1;
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        radio.setCurrentVolume(9);
        int expected = radio.getCurrentVolume() + 1;
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}