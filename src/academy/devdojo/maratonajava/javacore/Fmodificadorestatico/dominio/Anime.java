package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    /*
    O que acontece quando criamos um objeto...
    0- Bloco de inicialização é executado quando a JVM carregar a classe;
    1- Primeiro é alocado espaço em memoria pro objeto;
    2- Cada atributo de classe é criado e inicializado com valores default ou o que for passado;
    3- O bloco de inicialização é executado;
    4- O Construtor é executado;

    A diferença entre um bloco de inicializção e um construtor padrão é que ele inicializado independente
    do construtor que for chamado

     */
   static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int [100];
        for (int i = 0; i < episodios.length;i++){
            episodios[i] = i+1;
        }
    }
    public Anime(String nome){
        this.nome = nome;
    }
    public Anime() {

        for(int episodio:Anime.episodios){
            System.out.print(episodio +" ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
