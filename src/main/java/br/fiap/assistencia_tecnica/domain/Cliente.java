package br.fiap.assistencia_tecnica.domain;

import jakarta.persistence.*;

@Entity
//liga tabela no banco de dados
@Table(name = "JAVA_CLIENTE")
public class Cliente {

    @Id   //Identifica que é chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE") //Nome que ta na tabela
    private Long id;
    ///  JPA NAO TEM CONSTRUTOR
    @Column(name = "NOME", nullable = false, length = 120)
    private String nome;

    @Column(name = "EMAIL", nullable = false, length = 120)
    private String email;

    @Column(name = "TELEFONE", nullable = false, length = 20)
    private String telefone;

    @Column(name = "SENHA", nullable = false, length = 512)
    private String senha;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}////////////////////////////////////////////
