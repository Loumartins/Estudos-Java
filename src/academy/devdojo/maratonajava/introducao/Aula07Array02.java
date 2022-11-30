package academy.devdojo.maratonajava.introducao;

public class Aula07Array02 {
    public static void main(String[] args) {
        // un array é sempre um objeto
        //byte, short, int ,long ,float e double a inicialização é 0
        // char ''
        // boolean false
        // String null
        String [] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";
        nomes[3] = "Hinata";

        for(int i = 0; i<nomes.length ; i++) {
            System.out.println(nomes[i]);
        }

        String[] tasks = new String[3];
        tasks[0] = "Dormir cedo";
        tasks[1] = "Ir a academia";
        tasks[2]= "Arrumar a casa";

        //Voce pode utilizar o for para passar por todos os elementos presentes dentro de uma array
        // sem q voce precise chamar por cada um deles unicamente
        for (int i = 0;i< tasks.length;i++){
            System.out.println(tasks[i]);
        }
    }
}
//As array nao podem ser alteradas dinamicamente no Java, por isso é indicado a utilização do pacote de Collections
