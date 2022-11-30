package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    void load();
    default void checkPermission(){

    }
}
//interface nao é uma classe.
//todas os metodos de interface no Java são publicos e abstratos
// todos os atributos em uma interface são constantes