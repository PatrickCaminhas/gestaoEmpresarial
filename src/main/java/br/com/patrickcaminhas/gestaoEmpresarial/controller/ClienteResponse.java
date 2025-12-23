package br.com.patrickcaminhas.gestaoEmpresarial.controller;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.patrickcaminhas.gestaoEmpresarial.model.Cliente;
import br.com.patrickcaminhas.gestaoEmpresarial.service.CriptografiaService;

public class ClienteResponse {
    private String id;
    private String nome;
    private String sobrenome;
    private String documento;
    private String endereco;
    private String telefone;
    private BigDecimal saldo_devedor;
    private Boolean ativo;
    private int ultimo_a_modificar;
    private LocalDate created_at;
    private LocalDate update_at;

    public static ClienteResponse from(Cliente c) {
        ClienteResponse r = new ClienteResponse();
        r.id = c.getId();
        r.nome = c.getDadosCadastrais().getNome();
        String sobEnc = c.getDadosCadastrais().getSobrenome_enc();
        String docEnc = c.getDadosCadastrais().getDocumento();
        r.sobrenome = sobEnc == null ? null : CriptografiaService.desencriptar(sobEnc);
        r.documento = docEnc == null ? null : CriptografiaService.desencriptar(docEnc);
        r.endereco = c.getEndereco_enc() == null ? null : CriptografiaService.desencriptar(c.getEndereco_enc());
        r.telefone = c.getTelefone_enc() == null ? null
                : (c.getTelefone_enc() == null ? null : CriptografiaService.desencriptar(c.getTelefone_enc())); // caso
        
        r.saldo_devedor = c.getSaldo_devedor();
        r.ativo = c.getAtivo();
        r.ultimo_a_modificar = c.getUltimo_a_modificar();
        r.created_at = c.getCreated_at();
        r.update_at = c.getUpdate_at();
        return r;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getDocumento() {
        return documento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public BigDecimal getSaldo_devedor() {
        return saldo_devedor;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public int getUltimo_a_modificar() {
        return ultimo_a_modificar;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

    public LocalDate getUpdate_at() {
        return update_at;
    }
    // getters (opcionais)...
}