package tevelisao.modelo;

public class Title {
    private String title; //todo atributo precisa ser privado
    private int launchDate;
    private boolean coveredOnTheSubPlan;
    private double rating;
    private int rate;
    private int screentimeInMinutes;

    public int getRate(){ //get (permite eu pegar o valor previamente dito e nao permite futuras alterações)
        return rate;
    }

    public void setTitle(String title) { //set (permite eu trocar o valor posteriormente)
        this.title = title;
    }

    public void setLaunchDate(int launchDate) {
        this.launchDate = launchDate;
    }

    public void setCoveredOnTheSubPlan(boolean coveredOnTheSubPlan) {
        this.coveredOnTheSubPlan = coveredOnTheSubPlan;
    }

    public int getScreentimeInMinutes() {
        return screentimeInMinutes;
    }

    public void setScreentimeInMinutes(int screentimeInMinutes) {
        this.screentimeInMinutes = screentimeInMinutes;
    }

    public void showData() {
        System.out.println("Nome do Filme: " + title);
        System.out.println("Ano de lançamento: " + launchDate);
    }

    public void rating(double rated) {
        rating += rated;
        rate++;
    }
    public double showRating(){
        return  rating / rate;
    }
}
