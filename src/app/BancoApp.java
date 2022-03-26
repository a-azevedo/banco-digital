package app;

import model.Cliente;
import model.Conta;
import model.Conta.TipoDeConta;
import model.Endereco;
import model.Endereco.TipoDeEndereco;
import model.Cliente.TipoDeDocumento;

public class BancoApp {

    public static void main(String[] args) {

        TipoDeEndereco tipo = TipoDeEndereco.RESIDENCIAL;
        Endereco endereco = new Endereco("Rua Marieta Newmann","1A", tipo);

        TipoDeDocumento tipodoc = TipoDeDocumento.CPF;

        Cliente cliente = new Cliente("Aelmajan do Monte Azevedo", endereco, "12490861751", tipodoc);

        TipoDeConta tipoconta = TipoDeConta.CORRENTE;
        Conta conta = new Conta(237,tipoconta,cliente);
        Conta conta2 = new Conta(24, tipoconta, cliente);
        cliente.contas.add(conta);
        cliente.contas.add(conta2);

        conta.depositar(2000, conta);
        conta2.depositar(0, conta2);


        System.out.println(conta.getSaldo());
        System.out.println(conta2.getSaldo());
        conta.transferir(300, 0, 1);


        System.out.println(cliente.toString());

        while(!cliente.contas.isEmpty()) {
            System.out.println(cliente.contas);
            break;
        }
    }
}
