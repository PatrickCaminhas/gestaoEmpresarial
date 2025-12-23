package br.com.patrickcaminhas.gestaoEmpresarial.model;

import java.time.LocalDate;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import br.com.patrickcaminhas.gestaoEmpresarial.service.CriptografiaService;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcionarios")
public class Funcionario {
    @Id
    @Column(length = 32, nullable = false, updatable = false)
    private String id;

    @Embedded
    private DadosCadastrais dados;

    @Column(name = "email", nullable = false, length = 128)
    private String email;

    @Column(name = "senha_hash", nullable = false, length = 512)
    private String senha_hash;

    @Column(name = "pin_hash", nullable = false, length = 256)
    private String pin_hash; // Pin para realizar venda em vez de senha

    @Column(name = "tipo_perfil", nullable = false)
    private int tipo_perfil; // Nivel de acesso

    @Column(nullable = false)
    private Boolean ativo;

    @Column(name = "created_at", updatable = false)
    private LocalDate created_at;

    @Column(name = "updated_at")
    private LocalDate update_at;

    protected Funcionario() {

    }

    public Funcionario(String nome, String sobrenome_enc, String cpf_enc, String email, String senha_hash) {
        this.id = UUID.randomUUID().toString().replace("-", "");

        this.dados = new DadosCadastrais(nome, sobrenome_enc, "");
        this.senha_hash = CriptografiaService.encriptar(senha_hash);
        this.pin_hash = CriptografiaService
                .encriptar(Integer.toString(ThreadLocalRandom.current().nextInt(100, 1000)));

        this.email = email;
        this.tipo_perfil = 1;
        this.ativo = true;
        this.created_at = LocalDate.now();
        this.update_at = this.created_at;
    }

    @PrePersist
    private void onPersist() {
        this.created_at = LocalDate.now();
        this.update_at = this.created_at;
    }

    @PreUpdate
    private void onUpdate() {
        this.update_at = LocalDate.now();
    }

    public String getId() {
        return id;
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

    public Boolean trocarAtivoInativo() {
        if (this.ativo == true)
            this.ativo = false;
        else
            this.ativo = true;
        return this.ativo;
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
