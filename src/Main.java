import tevelisao.calculate.RecomedationFilter;
import tevelisao.calculate.TimeCalculator;
import tevelisao.modelo.Episode;
import tevelisao.modelo.Movie;
import tevelisao.modelo.Serie;


public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setTitle("O poderoso chefão");
        myMovie.setLaunchDate(1972);
        myMovie.setScreentimeInMinutes(175);
        System.out.println("Duração do filme: "  + myMovie.getScreentimeInMinutes());

        myMovie.showData();
        myMovie.rating(6);
        myMovie.rating(9);
        myMovie.rating(3);
        System.out.println("Total de avaliações: " + myMovie.getRate());
        System.out.println(myMovie.showRating());


        Serie lost = new Serie();
        lost.setTitle("lost");
        lost.setLaunchDate(2000);
        lost.showData();
        lost.setSeasons(10);
        lost.setEpisodes(10);
        lost.setAverageEPTime(30);
        System.out.println("Lost tem: " + lost.getScreentimeInMinutes() + " minutos");

        Movie outroMovie = new Movie();
        outroMovie.setTitle("avatar");
        outroMovie.setLaunchDate(1972);
        outroMovie.setScreentimeInMinutes(1000);


        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(myMovie);
        calculator.includes(outroMovie);
        calculator.includes(lost);
        System.out.println(calculator.getTotalTime());

        RecomedationFilter filter = new RecomedationFilter();
        filter.filter(myMovie);

        Episode episode = new Episode();
        Episode.setNumber(1);
        Episode.setSerie(lost);
        Episode.setTotalViews(500);
        filter.filter(episode);
    }
}
