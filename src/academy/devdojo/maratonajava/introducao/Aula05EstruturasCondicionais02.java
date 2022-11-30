package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;
public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 - Categoria Infantil
        // idade >= 15 && idade < 18 - Categoria Juvenil
        // idade >= 18 - Categoria Adulto
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o seu nome:");
        String nome = sc.next();
        System.out.println("Informe a a sua idade:");
        int idade = sc.nextInt();
        if(idade >=10 && idade <15) {
            System.out.println("Olá " + nome + ",você jogará na categoria infantil");
        }
        else if (idade >=15 && idade <18 ) {
            System.out.println("Olá " + nome + ",você jogará na categoria juvenil");
        }
        else {
            System.out.println("Olá " + nome + ",você jogará na categoria adulto");
        }
    }
}
