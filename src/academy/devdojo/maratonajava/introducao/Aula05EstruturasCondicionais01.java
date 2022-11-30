package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >=18;

        if(isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar a bebida alcoolica");
        } else
            System.out.println("Nao autorizado a comprar bebida alcoolica");
    }
}
// É possivel se utlizar do if fora das chaves desde que a condição seja unica.(Nao muito aceitavel)