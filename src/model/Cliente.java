package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente{
    private static int SEQUENCIAL = 0;
    private int cod;
    public List<Conta> contas;
    protected String nome;
    protected Endereco endereco;
    protected String documento;
    public enum TipoDeDocumento{CPF,CNPJ}

    public Cliente(String nome, Endereco endereco, String documento, TipoDeDocumento tipo) {
        this.nome = nome;
        this.endereco = endereco;
        this.documento = documento;
        SEQUENCIAL++;
        cod = SEQUENCIAL;
        if (contas == null) {
            contas = new ArrayList<Conta>();
        }
    }
    public int getCod() {
        return cod;
    }
    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
    public String getNome() {
        return nome;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public String getDocumento() {
        return documento;
    }
    @Override
    public String toString() {
        return "--------------------------------------\n"
                + "           Dados do Cliente\n"
                + "--------------------------------------\n"
                + "Nome: " + nome +"\n"
                + "Codigo: " + cod +"\n"
                + "Documento: " + documento +"\n"
                + "Endereço: " + endereco +"\n"
                + "--------------------------------------\n"
                + "                Contas\n"
                +"--------------------------------------\n";

    }
}



