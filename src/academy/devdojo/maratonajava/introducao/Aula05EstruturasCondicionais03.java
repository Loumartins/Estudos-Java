package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario for maior que 5000
        double salario = 3000;
        String mensagemDoar = "Eu vou dar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda nao tenho condições";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

    }
}
// Estrutura de condição do operador ternário
// (condiçao) ? verdadeiro : falso;