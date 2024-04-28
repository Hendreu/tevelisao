package tevelisao.modelo;

import tevelisao.calculate.Classificate;

public class Episode implements Classificate {
    private static int number;
    private String name;
    private static Serie serie;
    private static int totalViews;

    public int getTotalViews() {
        return totalViews;
    }

    public static void setTotalViews(int totalViews) {
        totalViews = totalViews;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Serie getSerie() {
        return serie;
    }

    public static void setNumber(int number) {
        number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setSerie(Serie serie) {
        Episode.serie = serie;
    }

    @Override
    public int getClassification() {
        if (totalViews > 100){
            return 4;
        } else {
            return 2;
        }
    }
}
