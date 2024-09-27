package Aula01SegundoSemestre2024;

public class Cliente {
    private String email;
    private String nome;
    private String cpf;

    public Cliente(String email, String nome, String cpf) {
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
