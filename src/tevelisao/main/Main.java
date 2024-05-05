package tevelisao.main;

import tevelisao.calculate.RecomedationFilter;
import tevelisao.calculate.TimeCalculator;
import tevelisao.modelo.Episode;
import tevelisao.modelo.Movie;
import tevelisao.modelo.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criação e configuração do objeto Movie
        Movie theGodfather = new Movie("O poderoso chefão", 1970);
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
        Serie lost = new Serie("lost", 2000);
        lost.showData();

        lost.setSeasons(10);
        lost.setEpisodes(10);
        lost.setAverageEPTime(30);

        System.out.println("Lost tem " + lost.getScreentimeInMinutes() + " minutos");

        // Criação e configuração do avatar
        Movie avatar = new Movie("avatar", 2023);
        avatar.setTitle("avatar");
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

        var dogville = new Movie("Dogville", 2003);
        dogville.setScreentimeInMinutes(200);
        dogville.rating(10);

        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(dogville);
        moviesList.add(theGodfather);
        moviesList.add(avatar);
        System.out.println("Tamanho da lista " + moviesList.size());
        System.out.println("Primeiro filme " + moviesList.get(0).getTitle());
        System.out.println(moviesList);




    }
}