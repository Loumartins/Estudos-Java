package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissões no banco de dados");
    }
}
//Na utilização de interfaces diferentemente da Herança é possivel ser implementado de varias interfaces diferentes dentro de uma mesma classe
