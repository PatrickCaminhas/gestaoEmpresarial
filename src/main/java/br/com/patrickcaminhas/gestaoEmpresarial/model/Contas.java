package br.com.patrickcaminhas.gestaoEmpresarial.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Contas {
    private String id;
    private String descricao;
    private BigDecimal valor;
    private LocalDate data_vencimento;
    private LocalDate data_pagamento;
    private String comprovante_url;
    private String estado;
    private LocalDate created_at;
    private LocalDate updated_at;

    public Contas( String descricao, BigDecimal valor, LocalDate data_vencimento, LocalDate data_pagamento,
            String comprovante_url, String estado, LocalDate created_at, LocalDate updated_at) {
        this.id = UUID.randomUUID().toString().replace("-", "");
        this.descricao = descricao;
        this.valor = valor;
        this.data_vencimento = data_vencimento;
        this.data_pagamento = data_pagamento;
        this.comprovante_url = comprovante_url;
        this.estado = estado;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
    public String getId() {
        return id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public LocalDate getData_vencimento() {
        return data_vencimento;
    }
    public void setData_vencimento(LocalDate data_vencimento) {
        this.data_vencimento = data_vencimento;
    }
    public LocalDate getData_pagamento() {
        return data_pagamento;
    }
    public void setData_pagamento(LocalDate data_pagamento) {
        this.data_pagamento = data_pagamento;
    }
    public String getComprovante_url() {
        return comprovante_url;
    }
    public void setComprovante_url(String comprovante_url) {
        this.comprovante_url = comprovante_url;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public LocalDate getCreated_at() {
        return created_at;
    }
    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }
    public LocalDate getUpdated_at() {
        return updated_at;
    }
    public void setUpdated_at(LocalDate updated_at) {
        this.updated_at = updated_at;
    }
    
}
