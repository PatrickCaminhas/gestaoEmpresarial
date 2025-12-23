package br.com.patrickcaminhas.gestaoEmpresarial.controller;

public class ClienteRequest {
    private String nome;
    private String sobrenome;
    private String documento;
    private String endereco;
    private String telefone;
    private int ultimo_a_modificar;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getUltimo_a_modificar() {
        return ultimo_a_modificar;
    }

    public void setUltimo_a_modificar(int ultimo_a_modificar) {
        this.ultimo_a_modificar = ultimo_a_modificar;
    }
}