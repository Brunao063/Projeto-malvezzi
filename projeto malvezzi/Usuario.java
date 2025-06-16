package model;

import java.time.LocalDate;

public class Usuario {
    private int id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String telefone;
    private String tipoUsuario;
    private String senhaHash;

    public Usuario(int id, String nome, String cpf, LocalDate dataNascimento, String telefone, String tipoUsuario, String senhaHash) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.tipoUsuario = tipoUsuario;
        this.senhaHash = senhaHash;
    }

    // Getters e Setters
}
