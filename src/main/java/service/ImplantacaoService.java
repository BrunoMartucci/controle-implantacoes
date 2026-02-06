package service;

import entity.Implantacao;
import org.springframework.stereotype.Service;
import repository.ImplantacaoRepository;

@Service
public class ImplantacaoService {

    private final ImplantacaoRepository implantacaoRepository;

    public ImplantacaoService(ImplantacaoRepository implantacaoRepository) {
        this.implantacaoRepository = implantacaoRepository;
    }

    public Implantacao salvar(Implantacao implantacao) {
        return implantacaoRepository.save(implantacao);
    }
}
