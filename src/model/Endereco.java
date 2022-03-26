package model;

public class Endereco {
    private String logradouro;
    private String numero;
    public enum TipoDeEndereco{RESIDENCIAL,COBRANCA,ENTREGA}

    public Endereco(String logradouro, String numero, TipoDeEndereco tipo) {
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    @Override
    public String toString() {
        return  logradouro + ", N° " + numero;
    }


}
