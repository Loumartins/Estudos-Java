package academy.devdojo.maratonajava.javacore.Npolimorifsmo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorifsmo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
