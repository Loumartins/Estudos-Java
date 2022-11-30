package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class Produto implements Transportavel, Tributavel {
    private String name;
    private double peso;
    private double preco;
    private double precoFinal;
    private double valorFrete;

    @Override
    public void calculaFrete() {
        this.valorFrete = this.preco / peso *0.1;
    }

    @Override
    public void calculaImposto() {
    precoFinal = this.preco + (this.preco * IMPOSTO);
    }

    public Produto(String name, double peso, double preco) {
        this.name = name;
        this.peso = peso;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "name='" + name + '\'' +
                ", peso=" + peso +
                ", preco=" + preco +
                ", precoFinal=" + precoFinal +
                ", valorFrete=" + valorFrete +
                '}';
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
