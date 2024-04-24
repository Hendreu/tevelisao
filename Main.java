import tevelisao.modelo.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setTitle("O poderoso chefão");
        myMovie.setLaunchDate(1972);
        myMovie.setScreentime(175);

        myMovie.showData();
        myMovie.rating(6);
        myMovie.rating(9);
        myMovie.rating(3);
        System.out.println("Total de avaliações: " + myMovie.getRate());
        System.out.println(myMovie.showRating());
    }
}
