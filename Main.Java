public class Main {
    public class Conta {

        private String titular;
        private int numero;
        private String agencia;
        private double saldo;
        private String dataDeAbertura;
        private Conta c;

        public double calculaRendimento() {
            return this.saldo * 0.1;
        }

        public String getTitular() {
            return this.titular;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public int getNumero() {
            return this.numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public String getAgencia() {
            return this.agencia;
        }

        public void setAgencia(String agencia) {
            this.agencia = agencia;
        }

        public double getSaldo() {
            return this.saldo;
        }

        public void deposita(double valor) {
            this.saldo += valor;
        }

        public void saca(double valor) {
            this.saldo -= valor;
        }

        public String getDataDeAbertura() {
            return this.dataDeAbertura;
        }

        public void setDataDeAbertura(String dataDeAbertura) {
            this.dataDeAbertura = dataDeAbertura;
            
            c.setTitular("Grell");
        System.out.println(c.getTitular());
        }
    }
}
