package br.com.patrickcaminhas.gestaoEmpresarial.model;

import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
// import jakarta.persistence.Embedded;
// import jakarta.persistence.Entity;
import jakarta.persistence.Id;
// import jakarta.persistence.PrePersist;
// import jakarta.persistence.PreUpdate;
// import jakarta.persistence.Table;

@Embeddable
public class CategoriaProduto {
    @Id
    @Column(length = 32, nullable = false, updatable = false)
    private String id;

    @Column(name= "nome", nullable = false, length = 128)
    private String nome;

    @Column(name= "sigla", length = 32)
    private String sigla;

    protected CategoriaProduto(){
        
    }
    
    public CategoriaProduto(String nome, String sigla) {
        this.id = UUID.randomUUID().toString().replace("-", "");
        this.nome = nome;
        this.sigla = sigla;
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
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
}
