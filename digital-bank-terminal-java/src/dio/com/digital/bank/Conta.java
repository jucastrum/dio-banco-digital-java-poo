package dio.com.digital.bank;

public class Conta implements IConta{
    //visibilidade protected para acesso pelas classes filhas
    private static final int AGENCIA_PADRAO = 1; //constante para agencia padrao
    private static int SEQUENCIAL = 1; //variavel de controle iniciada em 1 dentro da classe pra criar nro seq de conta

    protected int agencia;
    protected int numero;
    protected double saldo;

    protected Cliente cliente;

    //metodo construtor da classe Conta
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++; // sinal "++" para forçar a criação de numero subsequente
        //SEQUENCIAL funcionará como chave primaria em banco de dados
        this.cliente = cliente;
    }

    public Conta() { //construtor vazio sugerido pela IDE

    }

    //metodos getters criados e setters descartados pra impedir edição externa de dados da conta
    public static int getSEQUENCIAL() {
        return SEQUENCIAL;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    //sobrescreve toString


    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }

    //metodo para imprimir informações comuns em extratos
    protected void imprimirInfosComuns() {
        System.out.printf(String.format("Titular: %s%n", this.cliente.getNome()));
        System.out.printf(String.format("Agência: %d%n", this.agencia));
        System.out.printf(String.format("Número: %d%n", this.numero));
        System.out.printf(String.format("Saldo: %.2f%n", this.saldo));
    }

    //implementação de metodos da interface IConta
    @Override
    public void sacar(double valor) {
        saldo = saldo - valor;

    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    @Override
    public void imprimirExtrato() {

    }

}
