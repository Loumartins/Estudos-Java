package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClientTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Luiz Henrique Martins", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO );
        Cliente cliente2 = new Cliente("Gabriela Barbosa", TipoCliente.PESSOA_FISICA,TipoPagamento.DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente);

    }
}
