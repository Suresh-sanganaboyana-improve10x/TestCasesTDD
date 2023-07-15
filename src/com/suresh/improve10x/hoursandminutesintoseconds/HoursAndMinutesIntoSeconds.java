package com.suresh.improve10x.hoursandminutesintoseconds;

public class HoursAndMinutesIntoSeconds {
    public int convertHoursAndMinutesIntoSeconds(int hours, int minutes) {
        int seconds = 0;
        seconds = hours*3600 + minutes*60;
        return seconds;
    }
}
