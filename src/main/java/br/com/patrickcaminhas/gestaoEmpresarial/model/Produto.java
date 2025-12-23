package br.com.patrickcaminhas.gestaoEmpresarial.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

// import org.springframework.cglib.core.Local;

public class Produto {
    private String id;
    private String nome;
    private CategoriaProduto categoria;
    private BigDecimal preco_custo;
    private BigDecimal preco_venda;
    private BigDecimal preco_minimo; // Menor preço a ser vendido para ter lucro (preco com desconto)
    private Boolean ativo;
    private int ultimo_a_modificar; // FK
    private LocalDate created_at;
    private LocalDate updated_at;

    public Produto(String nome, CategoriaProduto categoria, BigDecimal preco_custo, BigDecimal preco_venda,
            Boolean ativo, int ultimo_a_modificar, LocalDate created_at, LocalDate updated_at) {
        this.id = UUID.randomUUID().toString().replace("-", "");
        this.nome = nome;
        this.categoria = categoria;
        this.preco_custo = preco_custo;
        this.preco_venda = preco_venda;
        this.ativo = ativo;
        this.ultimo_a_modificar = ultimo_a_modificar;
        this.created_at = LocalDate.now();
        this.updated_at = LocalDate.now();
    }

    public BigDecimal getPreco_minimo() {
        return preco_minimo;
    }

    public void setPreco_minimo(BigDecimal preco_minimo) {
        this.preco_minimo = preco_minimo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getPreco_custo() {
        return preco_custo;
    }

    public void setPreco_custo(BigDecimal preco_custo) {
        this.preco_custo = preco_custo;
    }

    public BigDecimal getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(BigDecimal preco_venda) {
        this.preco_venda = preco_venda;
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
