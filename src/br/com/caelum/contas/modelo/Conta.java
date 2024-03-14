package br.com.caelum.contas.modelo;
public class Conta {
    private String titular;
    private int identificador;
    private static int proximoIdentificador;
    


    public Conta() {
        this.titular = titular;
        this.identificador = proximoIdentificador++;
    }

    public int getIdentificador() {
        return this.identificador;
    }

    public void setNumero(int i) {
    }

    public void deposita(int i) {
    }

    public void setDataDeAbertura(String string) {
    }

    public boolean recuperaDadosParaImpressao() {
        return false;
    }

    public void setTitular(String hugo) {
    }

    public void setAgencia(String s) {
    }
}
