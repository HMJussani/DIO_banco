import org.jetbrains.annotations.NotNull;

public class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int contaPadrao;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.contaPadrao= SEQUENCIAL++;
        this.cliente = cliente;
    }


    public void sacar(double valor) {
        saldo -= valor;
    }


    public void depositar(double valor) {
        saldo += valor;
    }


    public void transferir(double valor, @NotNull Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getcontaPadrao() {
        return contaPadrao;
    }

    public double getSaldo() {
        return saldo;
    }

    void imprimirExtrato(){
        System.out.println("=== Dados da Conta ===");
        info();
    }

    protected void info() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("ID: %s", this.cliente.getId()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.contaPadrao));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
