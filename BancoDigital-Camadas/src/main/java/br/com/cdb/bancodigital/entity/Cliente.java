package br.com.cdb.bancodigital.entity;

//Para guardar a entidade de dados do cliente
public class Cliente {
    private String nome;
    private String cpf;
    private String id;

    public Cliente(String nome, String cpf, String id) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = id; // O id pode ser passado diretamente, mas geralmente é gerado pelo DAO
//
        // id será atribuído no DAO
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
