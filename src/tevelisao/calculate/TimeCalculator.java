package tevelisao.calculate;

import tevelisao.modelo.Movie;

public class TimeCalculator {
    private int totalTime = 0;

    public int getTotalTime() {
        return totalTime;
    }
    public void includes(Movie m){
        totalTime += m.getScreentimeInMinutes();
    }
}
