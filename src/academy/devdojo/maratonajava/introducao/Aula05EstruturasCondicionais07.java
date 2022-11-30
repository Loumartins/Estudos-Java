package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;
public class Aula05EstruturasCondicionais07 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia util ou final de semana. Considerando 1 como domingo.
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor de 1 a 7");
        int dia = sc.nextInt();
        switch (dia){
            case 1 :
                System.out.println("domingo - fim de semana");
                break;
            case 2 :
                System.out.println("segunda - dia útil");
                break;
            case 3 :
                System.out.println("terça - dia útil");
                break;
            case 4 :
                System.out.println("quarta - dia útil");
                break;
            case 5 :
                System.out.println("quinta - dia útil");
                break;
            case 6 :
                System.out.println("sexta - dia útil");
                break;
            case 7 :
                System.out.println("sábado - fim de semana");
                break;

            default:
                System.out.println("Valor inválido");
        }
    }
}
