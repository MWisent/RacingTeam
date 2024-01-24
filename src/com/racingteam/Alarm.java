package com.racingteam;

public interface Alarm {
    String ALARM_SOUND = "Beep Beep Beep Beep Beep Beep Beep Beep Beep";
    default void turnAlarmOn() {
        System.out.println("Alarm on! Sound: " + ALARM_SOUND);
    }
    default void turnAlarmOff() {
        System.out.println("Alarm off");
    }
}
