package dio.com.digital.bank;

public class Main {
    public static void main(String[] args) {
        Banco bancoInicial = new Banco(); //instancia novo banco

        bancoInicial.setNome("Ju Bank"); //insere nome do banco

        Cliente julia = new Cliente("Julia", bancoInicial);  //criado novo cliente Julia
        julia.setNome("Julia Farias Castro"); //insere o nome do cliente

        Conta ccorrente = new ContaCorrente(julia); //instanciada nova conta corrente

        ccorrente.depositar(1000); //criado um deposito em conta corrente

        Cliente alisson = new Cliente("Alisson", bancoInicial);  //instancia novo cliente
        Conta cpoupanca = new ContaPoupanca(alisson);  //instanciada nova conta poupanca

        ccorrente.imprimirExtrato();  //imprime extrato de ccorrente julia
        cpoupanca.imprimirExtrato();  //imprime estrato de cpoupanca alisson

        ccorrente.transferir(48, cpoupanca);  //faz tranferencia de ccorrente julia pra cpoupanca alisson

        ccorrente.imprimirExtrato(); //imprime extrato atualizado de ccorrente julia
        cpoupanca.imprimirExtrato(); //imprime extrato atualizado de cpoupanca alisson
        bancoInicial.mostrarClientes(); //mostra lista de clientes

        Cliente carolina = new Cliente("Carolina", bancoInicial);  //instancia novo cliente carolina
        Conta ccorrente2 = new ContaCorrente(carolina); //instancia nova ccorrente2 de carolina
        ccorrente2.imprimirExtrato();  //imprime  ccorrente2 de carolina
        bancoInicial.mostrarClientes(); //mostra lista atualizada de clientes do banco
    }
}