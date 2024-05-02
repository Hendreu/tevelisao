package tevelisao.modelo;

public class Serie extends Title {
    private int seasons;
    private boolean active;
    private int episodes;
    private int averageEPTime;

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public void setAverageEPTime(int averageEPTime) {
        this.averageEPTime = averageEPTime;
    }

    public int getSeasons() {
        return seasons;
    }

    public boolean isActive() {
        return active;
    }

    public int getEpisodes() {
        return episodes;
    }

    public int getAverageEPTime() {
        return averageEPTime;
    }

    @Override
    public int getScreentimeInMinutes() {
        return seasons * episodes * averageEPTime;
    }

    // Método para calcular o tempo total de visualização de uma série
    public int getTotalWatchTime() {
        return getScreentimeInMinutes();
    }
}