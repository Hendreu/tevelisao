package tevelisao.main;
import tevelisao.modelo.Movie;
import tevelisao.modelo.Serie;
import tevelisao.modelo.Title;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MainList {
    public static void main(String[] args) {
        Serie lost = new Serie("Lost", 2000);
        lost.rating(6);

        Movie theGodfather = new Movie("O poderoso chefão", 1970);
        theGodfather.rating(8);
        theGodfather.rating(8);
        theGodfather.rating(8);

        var dogville = new Movie("Dogville", 2003);
        dogville.rating(6);
        dogville.rating(6);
        dogville.rating(6);

        Movie avatar = new Movie("Avatar", 2023);
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
            if (item instanceof Movie movie && movie.showRating() > 2){
                System.out.println("Nota: "+ movie.showRating());
            }
        }

        ArrayList<String> searchForArtist = new ArrayList<>();
        searchForArtist.add("Adam Sandler");
        searchForArtist.add("matheus");
        searchForArtist.add("george");
        System.out.println(searchForArtist);

        Collections.sort(searchForArtist);
        System.out.println(searchForArtist);
        Collections.sort(watchList);
        System.out.println(watchList);
        watchList.sort(Comparator.comparing(Title::getLaunchDate));
        System.out.println(watchList);
    }
}
