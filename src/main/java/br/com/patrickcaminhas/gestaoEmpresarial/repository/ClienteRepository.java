package br.com.patrickcaminhas.gestaoEmpresarial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.patrickcaminhas.gestaoEmpresarial.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String> { }