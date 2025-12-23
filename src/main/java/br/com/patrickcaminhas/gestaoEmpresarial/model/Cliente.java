package br.com.patrickcaminhas.gestaoEmpresarial.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import org.springframework.cglib.core.Local;

public class Cliente {
    private String id;
    private DadosCadastrais dados;
    private String endereco_enc;
    private BigDecimal saldo_devedor;
    private Boolean ativo;
    private int ultimo_a_modificar;
    private LocalDate created_at;
    private LocalDate update_at;

    public Cliente(String nome, String sobrenome_enc, String cpf_cnpj_enc, String endereco_enc,
            int ultimo_a_modificar) {
        this.id = UUID.randomUUID().toString().replace("-", "");
        this.dados = new DadosCadastrais(nome, sobrenome_enc, endereco_enc);
        this.endereco_enc = endereco_enc;
        this.saldo_devedor = new BigDecimal(0.0);
        this.ativo = true;
        this.ultimo_a_modificar = ultimo_a_modificar;
        this.created_at = LocalDate.now();
        this.update_at = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public String getEndereco_enc() {
        return endereco_enc;
    }

    public void setEndereco_enc(String endereco_enc) {
        this.endereco_enc = endereco_enc;
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

}
