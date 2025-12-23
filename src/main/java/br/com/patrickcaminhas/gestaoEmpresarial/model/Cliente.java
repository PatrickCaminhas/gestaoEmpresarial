package br.com.patrickcaminhas.gestaoEmpresarial.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

// import org.springframework.cglib.core.Local;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import br.com.patrickcaminhas.gestaoEmpresarial.service.CriptografiaService;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @Column(length = 32, nullable = false, updatable = false)
    private String id;

    @Embedded
    private DadosCadastrais dados;

    @Column(name = "telefone_enc", length = 64)
    private String telefone_enc;
    @Column(name = "endereco_enc", nullable = false, length = 512)
    private String endereco_enc;

    @Column(name = "saldo_devedor", precision = 15, scale = 2)
    private BigDecimal saldo_devedor;


    @Column(nullable = false)
    private Boolean ativo;

    @Column(name = "ultimo_a_modificar")
    private int ultimo_a_modificar;

    @Column(name = "created_at", updatable = false)
    private LocalDate created_at;

    @Column(name = "updated_at")
    private LocalDate update_at;

    protected Cliente() {

    }

    public Cliente(String nome, String sobrenome_enc, String documento, String endereco_enc, String telefone_enc, int ultimo_a_modificar) {
        this.id = UUID.randomUUID().toString().replace("-", "");
        this.dados = new DadosCadastrais(nome, sobrenome_enc, documento);
        this.endereco_enc = CriptografiaService.encriptar(endereco_enc);
        this.telefone_enc = CriptografiaService.encriptar(telefone_enc);
        this.saldo_devedor = new BigDecimal(0.0);
        this.ativo = true;
        this.ultimo_a_modificar = ultimo_a_modificar;
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

    public DadosCadastrais getDadosCadastrais() {
        return this.dados;
    }

    public void setDadosCadastrais(String nome, String sobrenome_enc, String documento) {
        try {
            this.dados = new DadosCadastrais(nome, sobrenome_enc, documento);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getEndereco_enc() {
        return endereco_enc;
    }

    public void setEndereco_enc(String endereco_enc) {
        try {
            this.endereco_enc = CriptografiaService.encriptar(endereco_enc);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public BigDecimal getSaldo_devedor() {
        return saldo_devedor;
    }

    public void setSaldo_devedor(BigDecimal saldo_devedor) {
        this.saldo_devedor = saldo_devedor;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public int getUltimo_a_modificar() {
        return ultimo_a_modificar;
    }

    public void setUltimo_a_modificar(int ultimo_a_modificar) {
        this.ultimo_a_modificar = ultimo_a_modificar;
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

    public String getTelefone_enc() {
        return telefone_enc;
    }

    public void setTelefone_enc(String telefone_enc) {
        this.telefone_enc = telefone_enc;
    }

}
