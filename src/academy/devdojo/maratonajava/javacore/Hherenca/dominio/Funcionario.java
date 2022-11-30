package academy.devdojo.maratonajava.javacore.Hherenca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de funcionario");
    }
    {
        System.out.println("Dentro do bloco inicialização de funcionario1");
    }
    {
        System.out.println("Dentro do bloco inicialização de funcionario2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }
    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }
    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " recebi o salário de " + this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
