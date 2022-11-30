package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();
        estudante.nome = "Luiz Henrique Martins";
        estudante.sexo = 'M';
        estudante.idade = 26;
        System.out.println("----------------------");
        estudante1.nome = "Gabriela dos Santos Barbosa";
        estudante1.sexo = 'F';
        estudante1.idade = 26;
        System.out.println(estudante.nome);


    }
}
