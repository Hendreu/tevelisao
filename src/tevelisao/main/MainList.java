package tevelisao.main;
import tevelisao.modelo.Movie;
import tevelisao.modelo.Serie;
import tevelisao.modelo.Title;
import java.util.ArrayList;

public class MainList {
    public static void main(String[] args) {
        Serie lost = new Serie("lost", 2000);
        lost.rating(6);

        Movie theGodfather = new Movie("O poderoso chefão", 1970);
        theGodfather.rating(8);
        theGodfather.rating(8);
        theGodfather.rating(8);

        var dogville = new Movie("Dogville", 2003);
        dogville.rating(6);
        dogville.rating(6);
        dogville.rating(6);

        Movie avatar = new Movie("avatar", 2023);
        avatar.rating(9);
        avatar.rating(9);
        avatar.rating(9);

        ArrayList<Title> watchList = new ArrayList<>();

        watchList.add(dogville);
        watchList.add(theGodfather);
        watchList.add(avatar);
        watchList.add(lost);

        for (Title item: watchList){
            System.out.println(item.getTitle());
            Movie movie = (Movie) item;
            System.out.println("Nota: "+ movie.showRating());

        }
    }
}
