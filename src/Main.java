import tevelisao.calculate.RecomedationFilter;
import tevelisao.calculate.TimeCalculator;
import tevelisao.modelo.Episode;
import tevelisao.modelo.Movie;
import tevelisao.modelo.Serie;

public class Main {
    public static void main(String[] args) {
        // Criação e configuração do objeto Movie
        Movie theGodfather = new Movie();
        theGodfather.setTitle("O poderoso chefão");
        theGodfather.setLaunchDate(1972);
        theGodfather.setScreentimeInMinutes(175);

        System.out.println("Duração do filme: "  + theGodfather.getScreentimeInMinutes() + " minutos");
        theGodfather.showData();

        // Avaliações do filme
        theGodfather.rating(6);
        theGodfather.rating(9);
        theGodfather.rating(3);

        System.out.println("Total de avaliações: " + theGodfather.getRate());
        System.out.println("Média de avaliações: " + theGodfather.showRating());

        // Criação e configuração do objeto lost
        Serie lost = new Serie();
        lost.setTitle("lost");
        lost.setLaunchDate(2000);
        lost.showData();

        lost.setSeasons(10);
        lost.setEpisodes(10);
        lost.setAverageEPTime(30);

        System.out.println("Lost tem " + lost.getScreentimeInMinutes() + " minutos");

        // Criação e configuração do avatar
        Movie avatar = new Movie();
        avatar.setTitle("avatar");
        avatar.setLaunchDate(1972);
        avatar.setScreentimeInMinutes(1000);

        // Cálculo do tempo total
        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(theGodfather);
        calculator.includes(avatar);
        calculator.includes(lost);

        System.out.println("Tempo total de visualização: " + calculator.getTotalTime() + " minutos");

        // Filtro de recomendação
        RecomedationFilter filter = new RecomedationFilter();
        filter.filter(theGodfather);

        // Criação e configuração do objeto Episode
        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(lost);
        episode.setTotalViews(500);

        filter.filter(episode);

        var dogville = new Movie();
        dogville.setTitle("Dogville");
        dogville.setLaunchDate("2003");
        dogville.setScreentimeInMinutes("200");
        dogville.rating(10);
        

    }
}