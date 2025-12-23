package br.com.patrickcaminhas.gestaoEmpresarial.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class ItemVenda {
    private String id;
    private String venda_id;
    private String produto_id;
    private int quantidade;
    private BigDecimal preco_unitario_aplicado;
    private BigDecimal subtotal;
    private LocalDate created_at;

    public ItemVenda(String id, String venda_id, String produto_id, int quantidade, BigDecimal preco_unitario_aplicado,
            BigDecimal subtotal, LocalDate created_at) {
        this.id = UUID.randomUUID().toString().replace("-", "");
        this.venda_id = venda_id;
        this.produto_id = produto_id;
        this.quantidade = quantidade;
        this.preco_unitario_aplicado = preco_unitario_aplicado;
        this.subtotal = subtotal;
        this.created_at = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public String getVenda_id() {
        return venda_id;
    }

    public void setVenda_id(String venda_id) {
        this.venda_id = venda_id;
    }

    public String getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(String produto_id) {
        this.produto_id = produto_id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco_unitario_aplicado() {
        return preco_unitario_aplicado;
    }

    public void setPreco_unitario_aplicado(BigDecimal preco_unitario_aplicado) {
        this.preco_unitario_aplicado = preco_unitario_aplicado;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        if (this.preco_unitario_aplicado != null) {
            this.subtotal = this.preco_unitario_aplicado.multiply(BigDecimal.valueOf(quantidade));
        } else {
            this.subtotal = subtotal;
        }
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

}
