public class Produto {

    private String nome;
    private double preco;

    public Produto() {
    }

    public Produto(String nome, double preco) {
        nome = nome;
        preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}