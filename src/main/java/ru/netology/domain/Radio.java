package ru.netology.domain;


public class Radio {
    private int maximumCount = 9;
    private int minimumCount = 0;

    private int currentOfRadioStation;

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;


    public Radio() {
    }

    public Radio(int maximumCount) {

        this.maximumCount = maximumCount;
    }

    public int getCurrentOfRadioStation() {

        return currentOfRadioStation;
    }

    public int getMaximumCount() {
        return maximumCount;
    }

    public int getMinimumCount() {
        return minimumCount;
    }

    public int nextRadioStation() {
        if (currentOfRadioStation < maximumCount + 1) {
            currentOfRadioStation = currentOfRadioStation + 1;
        } else {
            currentOfRadioStation = minimumCount + 1;
        }
        return currentOfRadioStation;
    }

    public int prevRadioStation() {
        if (currentOfRadioStation < 1) {
            currentOfRadioStation = maximumCount + 1;
        } else {
            currentOfRadioStation = currentOfRadioStation - 1;
        }
        return currentOfRadioStation;
    }

    public void setCountOfRadioStation(int countOfRadioStations) {
        if (countOfRadioStations > (getMaximumCount() + 1)) {
            return;
        }
        if (countOfRadioStations < (getMinimumCount() + 1)) {
            return;
        }
        this.currentOfRadioStation = countOfRadioStations + 1;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getMinVolume() {

        return minVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }
}
