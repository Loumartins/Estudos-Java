package academy.devdojo.maratonajava.javacore.Npolimorifsmo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorifsmo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
