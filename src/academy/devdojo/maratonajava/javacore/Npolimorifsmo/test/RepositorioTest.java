package academy.devdojo.maratonajava.javacore.Npolimorifsmo.test;

import academy.devdojo.maratonajava.javacore.Npolimorifsmo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorifsmo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorifsmo.servico.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
/*
Utilizando a Programação Orientada a Interfaces é possível "chamar" a variavel de referencia
mais abstrata possivel que no caso é a propria interface para um objeto.
 */
