package br.com.patrickcaminhas.gestaoEmpresarial.model;

import java.util.UUID;

public class CategoriaProduto {
    private String id;
    private String nome;
    private String sigla;


    
    public CategoriaProduto(int id, String nome, String sigla) {
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
