package br.com.patrickcaminhas.gestaoEmpresarial.model;

import java.time.LocalDate;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.*;

public class Funcionario {
    private String id;
    private String nome;
    private String sobrenome_enc;
    private String cpf_enc;
    private String email;
    private String senha_hash;
    private int pin_hash; // Pin para realizar venda em vez de senha
    private int tipo_perfil; // Nivel de acesso
    private Boolean ativo;
    private LocalDate created_at;
    private LocalDate update_at;

    public Funcionario(String nome, String sobrenome_enc, String cpf_enc, String email, String senha_hash){
        this.id = UUID.randomUUID().toString().replace("-", "");
        this.nome= nome;
        this.sobrenome_enc = sobrenome_enc;
        this.cpf_enc = cpf_enc;
        this.email = email;
        this.senha_hash = senha_hash;
        this.tipo_perfil = 1;
        this.ativo = true;
        this.pin_hash = ThreadLocalRandom.current().nextInt(100,1000);
        this.created_at = LocalDate.now();
        this.update_at = LocalDate.now();
    }

    public String getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome_enc() {
        return sobrenome_enc;
    }
    public void setSobrenome_enc(String sobrenome_enc) {
        this.sobrenome_enc = sobrenome_enc;
    }
    public String getCpf_enc() {
        return cpf_enc;
    }
    public void setCpf_enc(String cpf_enc) {
        this.cpf_enc = cpf_enc;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha_hash() {
        return senha_hash;
    }
    public void setSenha_hash(String senha_hash) {
        this.senha_hash = senha_hash;
    }
    public String getPin_hash() {
        return pin_hash;
    }
    public void setPin_hash(String pin_hash) {
        this.pin_hash = pin_hash;
    }
    public int getTipo_perfil() {
        return tipo_perfil;
    }
    public void setTipo_perfil(int tipo_perfil) {
        this.tipo_perfil = tipo_perfil;
    }
    public Boolean getAtivo() {
        return ativo;
    }
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    public LocalDate getCreated_at() {
        return created_at;
    }
    public LocalDate getUpdate_at() {
        return update_at;
    }
    public void setUpdate_at(LocalDate update_at) {
        this.update_at = update_at;
    }
    
}
