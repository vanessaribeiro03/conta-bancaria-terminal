public class ContaTerminal {
    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirMensagem(){
        String mensagem = (
                String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s," +
                        "conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo));
        System.out.println(mensagem);
    }
}
