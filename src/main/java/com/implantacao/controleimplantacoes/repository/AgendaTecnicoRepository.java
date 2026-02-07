package com.implantacao.controleimplantacoes.repository;

import com.implantacao.controleimplantacoes.entity.AgendaTecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaTecnicoRepository extends JpaRepository<AgendaTecnico, Long> {
}
