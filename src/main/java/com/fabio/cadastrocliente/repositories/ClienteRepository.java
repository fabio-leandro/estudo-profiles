package com.fabio.cadastrocliente.repositories;

import com.fabio.cadastrocliente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
