package model;

public class Conta {

    private static int SEQUENCIAL = 0;
    public static enum TipoDeConta {CORRENTE,POUPANCA}
    private int numero;
    private int agencia;
    private double saldo = 0;
    private Cliente cliente;

    public Conta() {

    }

    public Conta(int agencia, TipoDeConta tipo, Cliente cliente) {
        super();
        SEQUENCIAL++;
        this.numero = SEQUENCIAL;
        this.agencia = agencia;
        this.cliente = cliente;
    }

    public void sacar(double valorS){
        if(saldo >= valorS) {
            saldo -= valorS;
            System.out.println("Saque no valor de R$" + valorS + " efetuado.");
            System.out.println("Seu novo saldo é de R$" + saldo);
        }else {
            System.out.println("Saldo insuficiente");
            System.out.println("Saldo disponível é " + saldo);
        }
    }

    public void depositar(double valorD,Conta contaDestino) {
        saldo += valorD;
    }

    public void transferir(double valorT, int contaRemetente, int contaDestino) {

        if(cliente.contas.get(contaRemetente).getSaldo() >= valorT) {
            cliente.contas.get(contaRemetente).setSaldo(saldo - valorT);
            double dest_saldo_atual, dest_saldo_ante;
            dest_saldo_ante = cliente.contas.get(contaDestino).getSaldo();
            dest_saldo_atual = dest_saldo_ante + valorT;
            cliente.contas.get(contaDestino).setSaldo(dest_saldo_atual);
        }else {
            System.out.println("Saldo insuficiente.");
            System.out.println("Saldo disponível é " + saldo);
        }

        System.out.println("Resumo da operação:");
        System.out.println("Tranferido R$ " + valorT + " da Conta N°: " + cliente.contas.get(contaRemetente).getNumero() + " --------> Conta N°: " + cliente.contas.get(contaDestino).getNumero());
        System.out.println("Conta N°: "+ cliente.contas.get(contaRemetente).getNumero() + "Saldo: R$ " + cliente.contas.get(contaRemetente).getSaldo());
        System.out.println("Conta N°: "+ cliente.contas.get(contaDestino).getNumero() + "Saldo: R$ " + cliente.contas.get(contaDestino).getSaldo());
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double valor) {
        this.saldo = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "N° conta: " + numero + ", Agência:" + agencia + ", Saldo:" + saldo + "\n";
    }

}
