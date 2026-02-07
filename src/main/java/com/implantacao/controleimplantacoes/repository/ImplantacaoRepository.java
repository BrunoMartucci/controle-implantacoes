package com.implantacao.controleimplantacoes.repository;


import com.implantacao.controleimplantacoes.entity.Implantacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImplantacaoRepository extends JpaRepository<Implantacao, Long>{

    Optional<Implantacao> findById(Long id);


}
