package dio.com.digital.bank;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public ContaPoupanca() {  //construtor sugerido pela IDE
        super();
    }

    public void imprimirExtrato() {
        System.out.println("#### Extrato de Conta Poupança #####");
        super.imprimirInfosComuns();
    }
}
