package tevelisao.calculate;
import tevelisao.modelo.Title;

public class TimeCalculator {
    private int totalTime = 0;

    public int getTotalTime() {
        return totalTime;
    }

    public void includes(Title title){
        this.totalTime += title.getScreentimeInMinutes();
    }
}
