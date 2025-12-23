package br.com.patrickcaminhas.gestaoEmpresarial.model;

import br.com.patrickcaminhas.gestaoEmpresarial.service.CriptografiaService;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class DadosCadastrais {
    @Column(name= "nome", nullable = false, length = 128)
    private String nome;
    @Column(name = "sobrenome", nullable = false, length = 256)
    private String sobrenome_enc;
    @Column(name = "documento", nullable = false, length = 256)
    private String documento;

    protected DadosCadastrais(){

    }

    public DadosCadastrais(String nome, String sobrenome_enc, String documento) {
            this.nome = nome;
            this.sobrenome_enc = CriptografiaService.encriptar(sobrenome_enc);
            this.documento = CriptografiaService.encriptar(documento);
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

    public void atualizarDocumento(String documento) {
        this.documento = CriptografiaService.encriptar(documento);
    }



}
