package com.fabio.cadastrocliente.repositories;

import com.fabio.cadastrocliente.domain.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository<Telefone,Long> {
}
