package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class Cachorro implements Terrestre{
    private String name;
    private int idade;
    private String raca;

    public Cachorro(String name, int idade, String raca) {
        this.name = name;
        this.idade = idade;
        this.raca = raca;
    }

    @Override
    public void andar() {
        System.out.println("O cachorro anda em 4 patas");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                ", raca='" + raca + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
