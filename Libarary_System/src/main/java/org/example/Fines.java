package org.example;
import java.time.LocalTime;
import java.time.Clock;
public class Fines{
    public static long Current_time(){
        Clock clock = Clock.systemDefaultZone();
        // Get the current time in real-time
        LocalTime currentTime = LocalTime.now(clock);
        // Print the current time
        long min =currentTime.getMinute();
        long secs =currentTime.getSecond();
        long total_time = (min*60) + (secs);
        return total_time;
    }

    public static long difference(long currtime,long prevtime){
        return Math.abs(currtime- prevtime);
    }
}

