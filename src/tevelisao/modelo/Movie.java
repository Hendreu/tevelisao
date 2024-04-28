package tevelisao.modelo;
import tevelisao.calculate.Classificate;

public class Movie extends Title implements Classificate {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassification() {
        return (int) getRate() / 2;
    }
}