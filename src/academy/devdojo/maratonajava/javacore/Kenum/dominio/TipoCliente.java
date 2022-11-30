package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private int valor;
    private String nomeRelatorio;
    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public int getValor() {
        return valor;
    }

     public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
         for (TipoCliente tipoCliente : values()) {
             if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                 return tipoCliente;
             }
         }
         return null;
     }
    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
// Enumeração é um tipo especial de classe onde todos os atributos que são criados
// são constantes!

/*
Qual o tipo da pessoa física??
Tipo cliente.
Qual o tipo da pessoa juridica??
Tipo cliente.
 */

/*
Ideia de uso de enumerações => Uma escolha dentro de uma quantidade limitada de opções, onde voce precisa
forçar o tipo a ser utilizado.
 */