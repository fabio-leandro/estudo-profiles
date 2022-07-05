package com.fabio.cadastrocliente.repositories;

import com.fabio.cadastrocliente.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco,Long> {
}
