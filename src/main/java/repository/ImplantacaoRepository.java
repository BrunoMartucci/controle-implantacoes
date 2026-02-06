package repository;

import entity.Implantacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImplantacaoRepository extends JpaRepository<Implantacao, Long> {
}
