package academy.devdojo.maratonajava.introducao;

public class Aula07Array01 {
    public static void main(String[] args) {
        int [] idades = new int[3];
        idades[0] = 1;
        idades[1] = 3;
        idades[2] = 4;
        System.out.println(idades[1]);

        //array de nomes
        String [] nomes = new String[5];
        System.out.println(nomes.length);

        String [] toDos = new String[3];
        toDos [0] = "Estudar Java";
        toDos [1] = "Estudar a Documentação";
        toDos [2] = "Ir para a academia";
        System.out.println(toDos.length);
        System.out.println(toDos[0]);
    }
}
