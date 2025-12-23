package br.com.patrickcaminhas.gestaoEmpresarial.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Venda {
    private String id;
    private String codigo_pedido;
    private String cliente_id;
    private String atendente_id;
    private String caixa_id;
    private EstadoCompra estado;
    private BigDecimal valor_bruto;
    private BigDecimal valor_desconto;
    private BigDecimal valor_liquido;
    private FormaPagamento forma_pagamento;
    private LocalDate created_at;

    

    public Venda(String codigo_pedido, String cliente_id, String atendente_id, String caixa_id,
            EstadoCompra estado, BigDecimal valor_bruto, BigDecimal valor_desconto, BigDecimal valor_liquido,
            FormaPagamento forma_pagamento, LocalDate created_at) {
        this.id = UUID.randomUUID().toString().replace("-", "");
        this.codigo_pedido = codigo_pedido;
        this.cliente_id = cliente_id;
        this.atendente_id = atendente_id;
        this.caixa_id = caixa_id;
        this.estado = estado;
        this.valor_bruto = valor_bruto;
        this.valor_desconto = valor_desconto;
        this.valor_liquido = valor_liquido;
        this.forma_pagamento = forma_pagamento;
        this.created_at = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public String getCodigo_pedido() {
        return codigo_pedido;
    }
    public void setCodigo_pedido(String codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }
    public String getCliente_id() {
        return cliente_id;
    }
    public void setCliente_id(String cliente_id) {
        this.cliente_id = cliente_id;
    }
    public String getAtendente_id() {
        return atendente_id;
    }
    public void setAtendente_id(String atendente_id) {
        this.atendente_id = atendente_id;
    }
    public String getCaixa_id() {
        return caixa_id;
    }
    public void setCaixa_id(String caixa_id) {
        this.caixa_id = caixa_id;
    }
    public EstadoCompra getEstado() {
        return estado;
    }
    public void setEstado(EstadoCompra estado) {
        this.estado = estado;
    }
    public BigDecimal getValor_bruto() {
        return valor_bruto;
    }
    public void setValor_bruto(BigDecimal valor_bruto) {
        this.valor_bruto = valor_bruto;
    }
    public BigDecimal getValor_desconto() {
        return valor_desconto;
    }
    public void setValor_desconto(BigDecimal valor_desconto) {
        this.valor_desconto = valor_desconto;
    }
    public BigDecimal getValor_liquido() {
        return valor_liquido;
    }
    public void setValor_liquido(BigDecimal valor_liquido) {
        this.valor_liquido = valor_liquido;
    }
    public FormaPagamento getForma_pagamento() {
        return forma_pagamento;
    }
    public void setForma_pagamento(FormaPagamento forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }
    public LocalDate getCreated_at() {
        return created_at;
    }
}
