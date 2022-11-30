package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String name;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// a partir do momento que é colocado uma "variavel" com Final ela se torna uma constante e com isso para de aceitar
// os valores de inicialização padrão, sendo que é preciso inicializa-la com um valor.

//constantes no Java tem uma semantica propria
//geralmente vem acompanhado com o modificado estático
