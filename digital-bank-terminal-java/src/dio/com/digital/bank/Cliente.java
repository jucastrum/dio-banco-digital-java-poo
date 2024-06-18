package dio.com.digital.bank;

public class Cliente {
    public Banco banco;

    public String nome;

    public String endereco;

    public String email;

    public String telefone;

    //construtor da lista de clientes do Banco
    public Cliente(String nome, Banco banco) {
        this.nome = nome;
        this.banco = banco;
        this.banco.clientes.add(this);
    }

    //construtor da classe Cliente
    public Cliente(String nome, String endereco, String email, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    //metodos getters e setters de dados pessoais do cliente
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //metodo setter da lista de clientes do Banco
    public void setBanco(Banco banco) {
        this.banco = banco;
        this.banco.clientes.add(this);
    }

    //sobrescreve toString
    @Override
    public String toString() {  //configurado toString pra mostrar lista com nomes de banco e cliente
        return "Cliente {" +
                "banco=" + banco.nome + ", nome='" + this.getNome() +
                '}';
    }
}
