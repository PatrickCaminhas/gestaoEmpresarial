package br.com.patrickcaminhas.gestaoEmpresarial.model;

public class DadosCadastrais {
    private String nome;
    private String sobrenome_enc;
    private String documento;


    public DadosCadastrais(String nome, String sobrenome_enc, String documento){
        this.nome = nome;
        this.sobrenome_enc = sobrenome_enc;
         this.documento = documento;
       
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome_enc() {
        return sobrenome_enc;
    }

    public void setSobrenome_enc(String sobrenome_enc) {
        this.sobrenome_enc = sobrenome_enc;
    }


    public String getDocumento() {
        return documento;
    }


    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
