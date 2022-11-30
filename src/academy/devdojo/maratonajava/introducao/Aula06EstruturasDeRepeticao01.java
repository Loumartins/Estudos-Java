package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // Existem tres estruturas de repetição --- while, do while, for
        // Estrutura com while
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }
        for(int i = 0 ;i <10; i++) {
            System.out.println("For " +i);
        }
    }
}
