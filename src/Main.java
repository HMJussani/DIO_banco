

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("cli1", "CPF");
        Cliente cliente2 = new Cliente("cli2", "CPF");
        Conta ccCli1 = new ContaCorrente(cliente1);
        ccCli1.imprimirExtrato();
        Conta ccCli2 = new ContaCorrente(cliente2);
        ccCli2.imprimirExtrato();
        Conta poupanca = new ContaPoupanca(cliente1);
        ccCli1.depositar(100);
        ccCli1.transferir(100, ccCli2);
        ccCli1.imprimirExtrato();
      




    }
}
